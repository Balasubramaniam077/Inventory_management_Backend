package com.webapp.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webapp.demo.Model.Product;
import com.webapp.demo.Model.Sales;
import com.webapp.demo.Repository.Productdao;
import com.webapp.demo.Repository.Saledao;

@Service
public class SalesServiceimpl implements SalesService {
	@Autowired
	Saledao sale;

	@Autowired
	Productdao pro;

	@Override
	public List<Sales> getAllSales() {
		return sale.findAll();
	}

	@Override
	public List<Sales> getSalesByProductId(Long id) {
		return sale.findByProductId(id);
	}

	@Override
	public Sales getSalesById(Long id) {
		return sale.findById(id).orElse(null);
	}

	@Override
	public void setSales(Sales s) {
		// List<Sales> u=sale.findByProductId(s.getProductId());
		// Sales mergedSales=new Sales();
   
		

		// if(u==null){
			

			sale.save(s);
	//  }
		
	// 	else
	// 	{
	// 		for (Sales sale : u) {
    //         // Merge the properties from each Sales object in the list
    //         mergedSales.setId(sale.getId());
    //         mergedSales.setProductId(sale.getProductId());
    //         mergedSales.setPrice(sale.getPrice());
	// 		mergedSales.setQuantity(sale.getQuantity());
	// 		mergedSales.setDate(sale.getDate());
    //         // You may need to handle other properties accordingly based on your requirements
    //     }
	// 		mergedSales.setPrice(mergedSales.getPrice()+s.getPrice());
	// 		mergedSales.setQuantity(mergedSales.getQuantity()+s.getQuantity());
	// 		sale.save(mergedSales);
	// 	}

	}

	@Override
	public void editSales(Sales s) {
		sale.save(s);

	}

	@Override
	public void deleteSales(Long id) {
		sale.deleteById(id);

	}
}
