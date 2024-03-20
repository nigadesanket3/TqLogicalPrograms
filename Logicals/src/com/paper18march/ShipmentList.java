package com.paper18march;

import java.util.ArrayList;
import java.util.List;

public class ShipmentList {

	
	static void show(List<Shipment> ship)
	{
		for(Shipment e:ship)
		{
			System.out.println(e);
		}
	}	


	public static void main(String args[])
	{
			ArrayList<Shipment> ship=new ArrayList<Shipment>();
			
			Mydate d1=new Mydate(12, 4, 2020);
			Address a1=new Address("wadgaonsheri", "pune", "maharashtra");
			ship.add(new Shipment(101, "nishant", a1,d1 ));
			
			Mydate d2=new Mydate(8, 9, 2022);
			Address a2=new Address("juhu", "mumbai", "maharashtra");
			ship.add(new Shipment(102, "sagar", a2,d2 ));
			
			Mydate d3=new Mydate(25, 9, 2021);
			Address a3=new Address("bandra", "mumbai", "maharashtra");
			ship.add(new Shipment(103, "hitendra", a3,d3 ));
			
			Mydate d4=new Mydate(18, 2, 2018);
			Address a4=new Address("pulwama", "srinagar", "jammu_&_Kashmir");
			ship.add(new Shipment(104, "vishal", a4,d4 ));
			
			
			show(ship);
			
			
			
		
	}



	
}
