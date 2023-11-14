package com.spring.transaction.Transaction.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.transaction.Transaction.entity.Record;

public interface RecordDao extends JpaRepository<Record, Integer>{

}
