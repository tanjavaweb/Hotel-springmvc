package com.nhapmoncongnghephanmem.repository;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.nhapmoncongnghephanmem.entity.Code;

public interface CodeRepository extends JpaRepository<Code, Long> {
	@Modifying
	@Query(value = "insert into code VALUES (?1,?2,?3,?4,?5,?6,?7,?8,?9)", nativeQuery = true)
	@Transactional
	void insertCode(String randomCode, String fullName, String phoneNumber, String email, String cmnd,
			String checkInDate, String checkOutDate, String specialRequest, String paymentMethod);
	
	Code findOneByRandomCode(String randomCode);
}
