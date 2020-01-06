package com.example.service;

import com.example.entities.User;

public interface UserService {
	
	public void addUser(User user);
	public User getUser(User user);
	public User getUserbyId (int id);

}
