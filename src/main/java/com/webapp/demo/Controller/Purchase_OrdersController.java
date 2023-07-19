package com.webapp.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.webapp.demo.Model.PurchaseOrder;
import com.webapp.demo.Repository.Purchaseorderdao;
import com.webapp.demo.Service.PurchaseOrdersService;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class Purchase_OrdersController {

	@Autowired
	PurchaseOrdersService pos;

	@Autowired
	Purchaseorderdao doas;

	@PostMapping("/purchase-order")
	public void setPurchaseOrder(@RequestBody PurchaseOrder p) {
		pos.createPurchaseOrder(p);
	}

	@GetMapping("/purchase-order")
	public List<PurchaseOrder> getPurchaseOrder() {
		return pos.getAllPurchaseOrder();
	}

	@GetMapping("/purchase-order/{id}")
	public List<PurchaseOrder> getbyid(@PathVariable Long id) {
		return pos.getPurchaseOrderByProductId(id);
	}

	@PutMapping("/purchase-order")
	public void editPurchaseOrder(@RequestBody PurchaseOrder p) {
		pos.editPurchaseOrder(p);
	}

	@DeleteMapping("/purchase-order")
	public void delPurchaseOrder(Long id) {
		pos.deletePurchaseOrder(id);
	}

	@PostMapping("/purchase-orderss")
	public void setPurchaseOrders(@RequestBody PurchaseOrder p) {
		doas.save(p);
	}

}
