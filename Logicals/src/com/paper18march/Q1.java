package com.paper18march;

import java.util.ArrayList;

public class Q1 {

	static void check(ArrayList<String> al)
	{
		int count=0;
		ArrayList<String> str=new ArrayList<>();
		for(String e:al)
		{
			if(!str.contains(e))
			{
				str.add(e);
			}
			
		}
		
		System.out.println(str);
	}

	public static void main(String args[])
	{
		ArrayList<String> al=new ArrayList<>();
		al.add("Sun");
		al.add("Mon");
		al.add("Sat");
		al.add("Sun");
		al.add("Mon");
		al.add("Sat");
		al.add("Sun");
		al.add("Sat");
		al.add("Sun");
		al.add("Mon");

		System.out.println("Original Array List -");
		System.out.println(al);
		
		System.out.println("without duplicates-");
		check(al);


	
	}

}
