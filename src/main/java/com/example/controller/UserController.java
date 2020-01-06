package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.example.entities.User;
import com.example.service.UserService;



@CrossOrigin("*")
@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserService userservice;
	
	
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public void saveUser(@RequestBody User user) {
		userservice.addUser(user);	
	}
}
