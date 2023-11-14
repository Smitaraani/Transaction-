package com.spring.transaction.Transaction.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionSynchronizationManager;

import com.spring.transaction.Transaction.dao.EmployeeDao;
import com.spring.transaction.Transaction.entity.Employee;
import com.spring.transaction.Transaction.entity.EmployeeDepratmentVo;

@Service
@Transactional
public class EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;
	
	@Autowired
	private DeptService deptService;

	@Autowired
	private RecordService recordService;
	
	
	public String saveEmpData(EmployeeDepratmentVo employeeDepratmentVo) {
		try {
			int saveDept = deptService.saveDept(employeeDepratmentVo);
			System.out.println("saveEmpData :: "+TransactionSynchronizationManager.isActualTransactionActive());
			System.out.println(TransactionSynchronizationManager.getCurrentTransactionName());
			Employee employee = new Employee();

			employee.setName(employeeDepratmentVo.getName());
			employee.setDepratmentId(saveDept);

			employeeDao.save(employee);
			throw new RuntimeException();
			//recordService.saveRecord(employeeDepratmentVo.getName(),employeeDepratmentVo.getDepartmentcode(),"success");
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			recordService.saveRecord(employeeDepratmentVo.getName(),employeeDepratmentVo.getDepartmentcode(),"fail");
			throw new RuntimeException();
		}

		
		//return "saved";
		
		
		
	}

//	@Transactional
//	public String deletEmployee(int id, int depratmentId) {
//
//		depratmentDao.deleteById(depratmentId);
//
//		// employeedao.save(employee);
//
//		employeeDao.deleteById(id);
//		return "delete successfully";
//
//	}

}
