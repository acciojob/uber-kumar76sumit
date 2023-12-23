package com.driver.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.driver.model.Admin;

import javax.transaction.Transactional;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Integer>{
}
