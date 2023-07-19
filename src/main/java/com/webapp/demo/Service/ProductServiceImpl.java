package com.webapp.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webapp.demo.Model.BarcodeScanner;
import com.webapp.demo.Model.Product;
import com.webapp.demo.Model.PurchaseOrder;
import com.webapp.demo.Repository.Barcodescannerdao;
import com.webapp.demo.Repository.Productdao;
import com.webapp.demo.Repository.Purchaseorderdao;

@Service
public class ProductServiceImpl implements ProductService {


	@Autowired
	Productdao prodao;

	

	@Override
	public List<Product> getAllProduct() {
		
		return prodao.findAll();
	}
	@Override
	public Product getProductById(Long id) {
		
		return prodao.findById(id).orElse(null);
	}

	@Override
	public void createProduct(Product product) {
		prodao.save(product);
	}

	@Override
	public void editProduct(Product product) {
			prodao.save(product);	
	}

	@Override
	public void deleteProduct(Long id) {
		prodao.deleteById(id);

	}
     
	@Override
	public int getTotalQuantity() {
		return prodao.getTotalQuantity();
	}

	@Override
	public List<Product> getProductsByQuantityLessThanSix() {
		
		return prodao.findProductsByQuantityLessThanSix();
	}

}
