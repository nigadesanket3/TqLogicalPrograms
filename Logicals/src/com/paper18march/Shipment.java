package com.paper18march;

public class Shipment {

	private int shipId;
	private String cust_name;
	private Address address;
	private Mydate shipDate;

	Shipment()
	{  
	}

	public int getShipId() {
		return shipId;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void setShipId(int shipId) {
		this.shipId = shipId;
	}

	public String getCust_name() {
		return cust_name;
	}

	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}

	

	public Mydate getShipDate() {
		return shipDate;
	}

	public void setShipDate(Mydate shipDate) {
		this.shipDate = shipDate;
	}

	

	public Shipment(int shipId, String cust_name, Address address, Mydate shipDate) {
		super();
		this.shipId = shipId;
		this.cust_name = cust_name;
		this.address = address;
		this.shipDate = shipDate;
	}

	@Override
	public String toString() {
		return "Shipment [shipId=" + shipId + ", cust_name=" + cust_name + ", address=" + address + ", shipDate="
				+ shipDate + "]";
	}

	

	
}
