package com.springboot.repository.custom;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.springboot.entities.Admin;


@Repository
@Transactional
public class AdminRepository {

	public Admin getAdminByUsernameAndPassword(EntityManager em, String username, String password){
		Admin admin = null;
		StringBuilder builder = new StringBuilder ("FROM Admin WHERE username LIKE :username AND password LIKE :password ");
		Query query = em.createQuery(builder.toString());
		query.setParameter("username", username);
		query.setParameter("password", password);
		try{
			admin = (Admin)query.getSingleResult();
		}
		catch(NoResultException e){
			admin = null;
		}
		return admin;
	}
	
	
}
