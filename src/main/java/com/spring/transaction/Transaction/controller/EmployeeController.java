package com.spring.transaction.Transaction.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.transaction.Transaction.entity.EmployeeDepratmentVo;
import com.spring.transaction.Transaction.service.EmployeeService;

@RestController
public class EmployeeController {

	
	@Autowired
	private EmployeeService employeeService;
	
	

	@PostMapping("/saveemployee")
	public String saveemployee(@RequestBody EmployeeDepratmentVo employeeDepratmentVo) {

		return employeeService.saveEmpData(employeeDepratmentVo);
	}
	
	
//	@DeleteMapping("/employee/{id}/{depratmentId}")
//	
//	public String deleteEmployee(@PathVariable int id,@PathVariable int depratmentId)
//	{
//		
//	String msg=	 employeeService.deletEmployee(id, depratmentId);
//	
//	return msg;
//		
//	}
}
