package com.spring.transaction.Transaction.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.transaction.Transaction.entity.Depepartment;
import com.spring.transaction.Transaction.entity.Employee;

public interface DepratmentDao extends JpaRepository<Depepartment,Integer> {

	//Depepartment save(Depepartment departemnt);

}
