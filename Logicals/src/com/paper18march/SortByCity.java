package com.paper18march;

import java.util.Comparator;

public class SortByCity implements Comparator<Shipment>{

	@Override
	public int compare(Shipment o1, Shipment o2) {
		// TODO Auto-generated method stub
		
		int cityCompare=o1.getAddress().getCity().compareTo(o2.getAddress().getCity());
		
		if(cityCompare==0)
		{
			int yearCompare= Integer.compare(o1.getShipDate().getYy(), o2.getShipDate().getYy());
			
			if(yearCompare==0)
			{
				int monthCompare=Integer.compare(o1.getShipDate().getMm(), o2.getShipDate().getMm());
		
				if(monthCompare==0)
				{
					
					return Integer.compare(o1.getShipDate().getDd(), o2.getShipDate().getDd());
	
				}
				
				
				return monthCompare;
			}
			
			
			
			return yearCompare;
		
		}
		
		
		
		
		return cityCompare;
	}

	
}
