package com.paper18march;

import java.util.Iterator;
import java.util.LinkedList;

public class EmployeeList {


	static void show(LinkedList<Employee> list)
	{
		for(Employee e:list)
		{
			System.out.println(e);
		}

	}
	
	
	static void search(LinkedList<Employee> list, int eno)
	{
		int dno=0;
		for(Employee e:list)
		{
			if(e.getEno()==eno)
			{
				dno=e.getDept().getDeptId();
				break;
			}
		}
		
		System.out.print("Department number for employee having eno 10 is-");
		System.out.println(dno);
		
		
	
		

		
		Iterator<Employee> itr=list.iterator();
		while(itr.hasNext())
		{
			Employee e=itr.next();
			if(e.getDept().getDeptId()==dno)
			{
				itr.remove();
			}
			
			System.out.println();
		}
		
		
		for(Employee e:list)
		{
			System.out.println(e);
		}
		
		
		
		
	}
	
	public static void main(String args[])
	{
		LinkedList<Employee> list=new LinkedList<>();
		
		Department d1=new Department(101, "sales");
		Department d2=new Department(102, "Hr");
		
		list.add(new Employee("sagar", 1, d1));
		list.add(new Employee("yogesh", 2, d1));
		list.add(new Employee("nishant", 3, d2));
		list.add(new Employee("hitendra", 10, d2));

		
		show(list);

		System.out.println("________________________");
		//search for emp whoes eno=10 and delete the record of same dept
		search(list,10);


		System.out.println("________________________");
		
			
	}



	
}
