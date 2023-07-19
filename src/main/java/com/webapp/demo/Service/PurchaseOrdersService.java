package com.webapp.demo.Service;

import java.util.List;

import com.webapp.demo.Model.PurchaseOrder;

public interface PurchaseOrdersService {
	public List<PurchaseOrder> getAllPurchaseOrder();

	public List<PurchaseOrder> getPurchaseOrderByProductId(Long id);

	public void createPurchaseOrder(PurchaseOrder p);

	public void editPurchaseOrder(PurchaseOrder p);

	public void deletePurchaseOrder(Long id);
}
