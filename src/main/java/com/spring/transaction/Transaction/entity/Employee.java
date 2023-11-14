package com.spring.transaction.Transaction.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="emp_table")
public class Employee {
	
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;
	
	private String name;
	
	private int depratmentId;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDepratmentId() {
		return depratmentId;
	}

	public void setDepratmentId(int depratmentId) {
		this.depratmentId = depratmentId;
	}

	public Employee(int id, String name, int depratmentId) {
		super();
		this.id = id;
		this.name = name;
		this.depratmentId = depratmentId;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", depratmentId=" + depratmentId + "]";
	}
	
	
	
	
	

}
