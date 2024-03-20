package com.paper18march;

import java.util.*;

public class Q5 {

	public static void main(String args[])
	 {
		
		List<Integer> li=Arrays.asList(10,20,30);
		

		ListIterator<Integer>itr=li.listIterator(li.size());
		while(itr.hasPrevious())
		{
			System.out.println(itr.previous());
		}

	}

	
}
