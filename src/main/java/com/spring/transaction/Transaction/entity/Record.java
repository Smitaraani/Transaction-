package com.spring.transaction.Transaction.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="record_pd")
public class Record {
	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	private int id; 
	private String empId;
	private String deptId;
	private String message;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getDeptId() {
		return deptId;
	}
	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Record(int id, String empId, String deptId, String message) {
		super();
		this.id = id;
		this.empId = empId;
		this.deptId = deptId;
		this.message = message;
	}
	public Record() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Record [id=" + id + ", empId=" + empId + ", deptId=" + deptId + ", message=" + message + "]";
	}
	

}
