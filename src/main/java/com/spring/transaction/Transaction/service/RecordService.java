package com.spring.transaction.Transaction.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionSynchronizationManager;

import com.spring.transaction.Transaction.dao.RecordDao;
import com.spring.transaction.Transaction.entity.Record;

@Service
@Transactional(propagation = Propagation.NOT_SUPPORTED)
public class RecordService {
	
	
	@Autowired
	private RecordDao recordDao;
	
	public void saveRecord(String name,String deptCode,String status) {
		System.out.println("saveRecord :: "+TransactionSynchronizationManager.isActualTransactionActive());
		System.out.println(TransactionSynchronizationManager.getCurrentTransactionName());
		Record record = new Record();
		record.setEmpId(name);
		record.setDeptId(deptCode);
		if(status.equalsIgnoreCase("fail")) {
			record.setMessage("fail");
		}else {
			record.setMessage("success");
		}
		
		recordDao.save(record);
	}

}
