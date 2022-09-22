package com.himanshu.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.himanshu.api.domain.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Integer> {

	
	
}
