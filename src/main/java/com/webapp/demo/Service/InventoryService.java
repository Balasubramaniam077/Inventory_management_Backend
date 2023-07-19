package com.webapp.demo.Service;

import java.util.List;

import com.webapp.demo.Model.Inventory;

public interface InventoryService {
	public List<Inventory> getAllInventory();

	Inventory getInventoryById(Long id);

	public void createInventory(Inventory i);

	public void editInInventory(Inventory i);

	public void deleteInInventory(Long id);
}
