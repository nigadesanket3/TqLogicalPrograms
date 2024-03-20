package com.HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class EmpDeptMap {

	public static void printDept(ArrayList<Employee> arr)
	{
		HashMap<Department, Integer> map=new HashMap<Department, Integer>();
		for(Employee e:arr)
		{
			if(map.containsKey(e.getDept()))
			{
				int count=map.get(e.getDept());
				count++;
				map.put(e.getDept(), count);			
			}
			else
			{
				map.put(e.getDept(), 1);
			}
			
		}
		
		for(Map.Entry<Department, Integer> e: map.entrySet())
		{
			System.out.println(e.getKey()+" -> "+e.getValue());
		}
		
		
	}
	
	public static void printArrayList(ArrayList<Employee> arr)
	{
		HashMap<Department, ArrayList<Employee>> map=new HashMap<>();
		ArrayList<Employee> elist;
		
		for(Employee e:arr)
		{
			if(map.containsKey(e.getDept()))
			{
				elist=map.get(e.getDept());
				elist.add(e);
				map.put(e.getDept(), elist);
			}
			else
			{
				elist=new ArrayList<Employee>();
				elist.add(e);
				map.put(e.getDept(), elist);
			}
		}
		
		for(Map.Entry<Department, ArrayList<Employee>> e:map.entrySet())
		{
			System.out.print(e.getKey()+" -> ");
			for(Employee ob:e.getValue())
			{
				System.out.println(ob.getName()+","+ob.getSalary());
			}
		}
		
		
	}
	
	
	public static void printSalary(ArrayList<Employee> arr)
	{
		
		HashMap<Department, Double> map=new HashMap<Department, Double>();
		
		for(Employee e:arr)
		{
			if(map.containsKey(e.getDept()))
			{
				Double salary=map.get(e.getSalary());
				map.put(e.getDept(), salary);
			}
			else
			{
				map.put(e.getDept(),0.0);
			}
			
		}
		
		for(Map.Entry<Department, Double> e: map.entrySet())
		{
			System.out.println(e.getKey()+" -> ");
			double sum=0;
			sum+=e.getValue();
			System.out.print(sum);
		}
	
		
		
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		ArrayList<Employee> arr=new ArrayList<Employee>();
		arr.add(new Employee(1, "sagar", 40000, new Department(101, "IT")));
		arr.add(new Employee(2, "ashish", 20000, new Department(102, "sales")));
		arr.add(new Employee(3, "vishal", 35000, new Department(103, "HR")));
		arr.add(new Employee(4, "nishant", 75000, new Department(102, "sales")));
		arr.add(new Employee(5, "hitendra", 45000, new Department(103, "HR")));
		arr.add(new Employee(6, "sumit", 25000, new Department(101, "IT")));
		
		Iterator<Employee> itr=arr.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println(".................................");
		
		printDept(arr);
		

		System.out.println(".................................");
		
		printArrayList(arr);
		
		System.out.println(".................................");
		
		printSalary(arr);
		
		
	}
	
}
