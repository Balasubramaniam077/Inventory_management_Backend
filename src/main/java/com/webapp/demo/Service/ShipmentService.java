package com.webapp.demo.Service;

import java.util.List;

import com.webapp.demo.Model.Shipment;

public interface ShipmentService {

	public List<Shipment> getAllShipment();

	public Shipment getShipmentById(Long id);

	public void setShipment(Shipment sh);

	public void createShipment(Shipment sh);

	public void editShipment(Shipment sh);

	public void deleteShipment(Long id);
}
