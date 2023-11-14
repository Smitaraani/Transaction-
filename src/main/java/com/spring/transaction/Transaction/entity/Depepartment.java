package com.spring.transaction.Transaction.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="dep_table")
public class Depepartment {
	
	
	
	
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int depratmentId;
	
	private String departmentcode;
	
	@Override
	public String toString() {
		return "Depepartment [depratmentId=" + depratmentId + ", departmentcode=" + departmentcode + ", departmentname="
				+ departmentname + "]";
	}

	public Depepartment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Depepartment(int depratmentId, String departmentcode, String departmentname) {
		super();
		this.depratmentId = depratmentId;
		this.departmentcode = departmentcode;
		this.departmentname = departmentname;
	}

	public int getDepratmentId() {
		return depratmentId;
	}

	public void setDepratmentId(int depratmentId) {
		this.depratmentId = depratmentId;
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

	private String departmentname;

}
