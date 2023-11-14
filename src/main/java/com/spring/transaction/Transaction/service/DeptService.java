package com.spring.transaction.Transaction.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionSynchronizationManager;

import com.spring.transaction.Transaction.dao.DepratmentDao;
import com.spring.transaction.Transaction.entity.Depepartment;
import com.spring.transaction.Transaction.entity.EmployeeDepratmentVo;

@Service
@Transactional(propagation = Propagation.REQUIRES_NEW)
public class DeptService {

	@Autowired
	private DepratmentDao depratmentDao;

	
	public int saveDept(EmployeeDepratmentVo employeeDepratmentVo) {
		int depratmentId = 0;
		try {
			System.out.println("saveDept :: "+TransactionSynchronizationManager.isActualTransactionActive());
			System.out.println(TransactionSynchronizationManager.getCurrentTransactionName());
			Depepartment departemnt = new Depepartment();
			departemnt.setDepartmentcode(employeeDepratmentVo.getDepartmentcode());
			departemnt.setDepartmentname(employeeDepratmentVo.getDepartmentname());

			depratmentId = depratmentDao.save(departemnt).getDepratmentId();
			//throw new RuntimeException();

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			throw new RuntimeException();
		}

		return depratmentId;

	}

}
