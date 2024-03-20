package com.paper18march;

import java.util.ArrayList;
import java.util.Collections;

public class Q4 {

	public static void main(String args[])
	{
		ArrayList<String> al=new ArrayList<>();
		al.add("red");
		al.add("yellow");
		al.add("blue");
		al.add("green");
				
		System.out.println("Original arraylist-"+al);		

		Collections.sort(al);
		Collections.reverse(al);

		System.out.println("After sorting in reverse manner-"+al);
		
	}

	
}
