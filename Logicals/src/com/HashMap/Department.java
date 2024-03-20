package com.HashMap;

import java.util.Objects;

public class Department {

	private int deptId;
	private String dname;
	
	@Override
	public int hashCode() {
		return Objects.hash(deptId, dname);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Department other = (Department) obj;
		return deptId == other.deptId && Objects.equals(dname, other.dname);
	}

	public Department() {
		// TODO Auto-generated constructor stub
	}

	public Department(int deptId, String dname) {
		super();
		this.deptId = deptId;
		this.dname = dname;
	}

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

	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", dname=" + dname + "]";
	}
	
	
}
