package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.example.entities.Sujet;
import com.example.entities.User;
import com.example.repositories.SujetRepository;
import com.example.repositories.UserRepository;
import com.example.service.SujetService;
import com.example.service.UserService;

@CrossOrigin("*")
@RestController
@RequestMapping("/sujet")
public class SujetController {
	
	@Autowired
	UserService userservice;
	@Autowired
	SujetService sujetservice;
	@Autowired
	SujetRepository sujetrepository;
	@Autowired
	UserRepository userrepository;
	
	@RequestMapping(value="/addSujet{idUser}",method=RequestMethod.POST)
	public void saveUser(@RequestBody Sujet sujet, @PathVariable("idUser") int idUser) {
	
		User u = userrepository.getOne(idUser);
		sujet.setUser(u);
        sujetservice.addSujet(sujet);	
	}
	@RequestMapping(value="/allSujet", method= RequestMethod.GET)
	public List<Sujet> getall(){
		return sujetservice.getAll();
}
}