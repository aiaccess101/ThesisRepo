package com.springboot.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("loginService")
public class LoginService {
	private static final String USERNAME = "Jess";
	private static final String PASSWORD = "qwerty";
	
	
	@PersistenceContext
	private EntityManager em;

	public boolean AuthenticateUser(String username, String password) {
		boolean flag = false;
		if(username.equals(USERNAME) && password.equals(PASSWORD)){
			flag = true;
		}
		return flag;
	}
	
	
}