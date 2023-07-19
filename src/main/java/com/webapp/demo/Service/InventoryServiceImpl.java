package com.webapp.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webapp.demo.Model.Inventory;
import com.webapp.demo.Model.Product;
import com.webapp.demo.Repository.Inventorydao;
import com.webapp.demo.Repository.Productdao;

@Service
public class InventoryServiceImpl implements InventoryService {
	@Autowired
	Inventorydao inventorydao;
	@Autowired
	Productdao product;

	@Override
	public List<Inventory> getAllInventory() {

		List<Inventory> optional = inventorydao.findAll();
		return optional;
	}

	@Override
	public void createInventory(Inventory i) {
		Product p2 = product.findById(i.getProduct().getId()).orElse(null);
		i.setProduct(p2);
		inventorydao.save(i);

	}

@Override
	public Inventory getInventoryById(Long id) {

		
		return inventorydao.findById(id).orElse(null);
	}


	@Override
	public void editInInventory(Inventory i) {
		Product p2 = product.findById(i.getProduct().getId()).orElse(null);
		i.setProduct(p2);
		inventorydao.save(i);

	}

	@Override
	public void deleteInInventory(Long id) {
		inventorydao.deleteById(id);
	}

}
