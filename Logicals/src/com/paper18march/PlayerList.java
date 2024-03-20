package com.paper18march;

import java.util.ArrayList;
import java.util.Iterator;

public class PlayerList {

	public static void main(String[] args) {
		
		ArrayList<Player> pl=new ArrayList<Player>();
		pl.add(new Player(101, "Virat_Kohli", "India", "RCB"));
		pl.add(new Player(104, "Maxwell", "Australia", "RCB"));
		pl.add(new Player(105, "hazelwood", "Australia", "RCB"));
	
		pl.add(new Player(103, "MS_Dhoni", "India", "CSK"));
		pl.add(new Player(106, "Sam_Curran", "Australia", "CSK"));

		pl.add(new Player(102, "Pat_cummins", "Australia","SRH"));
		pl.add(new Player(107, "Bhubneshwar_Kumar", "India","SRH"));
		
		ArrayList<Player> aus=new ArrayList<Player>();

		
		Iterator<Player>itr=pl.iterator();
		while(itr.hasNext())
		{
			Player e=itr.next();
			if(e.getCountry().equalsIgnoreCase("Australia"))
			{
				aus.add(e);
			}
			
		}
		
		
		System.out.println("___________");
	//	System.out.println(aus);
		
		Iterator<Player>itr1=aus.iterator();
		while(itr1.hasNext())
		{
			Player e=itr1.next();
			System.out.println(e);
			
		}
		
		int count=0;
		
		for(int i=0;i<aus.size();i++)
		{
			for(int j=0;j<aus.size();j++)
			{
				if(aus.get(i).getTeam().equals(aus.get(j).getTeam()) && j<i)
					break;
				else if(aus.get(i).getTeam().equals(aus.get(j).getTeam()))
					count++;					
			}
			
			System.out.println(count);
			
		/*	if(count>0)
			{
				System.out.println(aus.get(i).getCountry()+"");
			}

		*/
		}
		
		
	}
	
}
