package com.springboot.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.repository.custom.AdminRepository;
import com.springboot.entities.Admin;

@Service("adminService")
public class AdminService {
	
	@Autowired
	private AdminRepository AdminRepository;
	
	@PersistenceContext
	private EntityManager em;
	
	
	public boolean AuthenticateAdmin(String username, String password){
		boolean flag = false;
		Admin admin = AdminRepository.getAdminByUsernameAndPassword(em, username, password);
		if(admin != null){
			flag = true;
		}
		
		return flag;
	}
	
}
