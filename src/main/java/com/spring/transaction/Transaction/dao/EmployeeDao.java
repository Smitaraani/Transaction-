package com.spring.transaction.Transaction.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.transaction.Transaction.entity.Employee;

public interface EmployeeDao extends JpaRepository<Employee,Integer> {

}
