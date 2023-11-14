package com.spring.transaction.Transaction.entity;

public class EmployeeDepratmentVo {

	private String name;
	
	@Override
	public String toString() {
		return "EmployeedepratmentVo [name=" + name + ", departmentcode=" + departmentcode + ", departmentname="
				+ departmentname + "]";
	}


	public EmployeeDepratmentVo(String name, String departmentcode, String departmentname) {
		super();
		this.name = name;
		this.departmentcode = departmentcode;
		this.departmentname = departmentname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartmentcode() {
		return departmentcode;
	}

	public void setDepartmentcode(String departmentcode) {
		this.departmentcode = departmentcode;
	}

	public String getDepartmentname() {
		return departmentname;
	}

	public void setDepartmentname(String departmentname) {
		this.departmentname = departmentname;
	}

	private String departmentcode;
	
	private String departmentname;

}
