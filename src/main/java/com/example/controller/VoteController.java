package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.example.entities.Sujet;
import com.example.entities.User;
import com.example.entities.Vote;
import com.example.service.SujetService;
import com.example.service.UserService;
import com.example.service.VoteService;

@CrossOrigin("*")
@RestController
@RequestMapping("/vote")
public class VoteController {
	
	
	
	
	@Autowired
	UserService userservice;
	@Autowired
	SujetService sujetservice;
	@Autowired
	VoteService voteservice;

	
	
	 @RequestMapping(value="/voter/{id}", method=RequestMethod.POST)
	    public void addClienttoReservation(@RequestBody Vote vote, @PathVariable("id") Integer id) {
	    
	    	Sujet s = sujetservice.getSujetbyId(id);
	    	voteservice.addVote(vote); 	
	    }
	    
	

}
