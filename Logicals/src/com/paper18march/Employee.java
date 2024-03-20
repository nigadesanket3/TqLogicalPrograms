package com.paper18march;

public class Employee {

	private String name;
	private int eno;
	private Department dept;		


	Employee()
	{ 

		}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEno() {
		return eno;
	}

	public void setEno(int eno) {
		this.eno = eno;
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	Employee(String name,int eno,Department dept)
	{
		this.name=name;
		this.eno=eno;
		this.dept=dept;
	}	
	
	public String toString()
	{
		return name+" "+eno+" "+dept;
	}	

}
