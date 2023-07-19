package com.webapp.demo.Service;

import java.util.List;

import com.webapp.demo.Model.Sales;

public interface SalesService {
	public List<Sales> getAllSales();

    public Sales getSalesById(Long id);

	public List<Sales> getSalesByProductId(Long id);

	public void setSales(Sales s);

	public void editSales(Sales s);

	public void deleteSales(Long id);
}
