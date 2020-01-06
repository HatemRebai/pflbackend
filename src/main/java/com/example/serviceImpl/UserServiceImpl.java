package com.example.serviceImpl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.entities.User;
import com.example.repositories.UserRepository;
import com.example.service.UserService;


@Service("userservice")
public class UserServiceImpl implements UserService  {
	
	@Autowired
	UserRepository userrepository;
	@PersistenceContext
	EntityManager em;

	
	public void addUser(User user) {
		userrepository.save(user);
		
	}


	public User getUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public User getUserbyId(int id) {
		// TODO Auto-generated method stub
		return userrepository.getOne(id);
	}



}
