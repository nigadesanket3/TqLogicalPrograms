package com.paper18march;

public class Department {
	private int deptId;
	private String dname;

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	Department()
	{ 

            }

	Department(int deptId,String dname)
	{
		this.deptId=deptId;
		this.dname=dname;
	}


	public String toString()
	{
		return deptId+"  "+dname;
	}



}
