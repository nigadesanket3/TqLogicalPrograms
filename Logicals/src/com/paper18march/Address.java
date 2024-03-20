package com.paper18march;

public class Address {

	private String addr;
	private String city;
	private String state;
	  
	  public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	
	public Address()
	  {
	  }
	  public Address(String addr, String city, String state)
	  {
	    this.addr = addr;
	    this.city = city;
	    this.state = state;
	  }
	  
	  public String toString()
	  {
	    return addr+"  "+"  "+city+"  "+state;
	  }
	
}
