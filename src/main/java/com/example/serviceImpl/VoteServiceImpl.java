package com.example.serviceImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.entities.Vote;
import com.example.repositories.VoteRepository;
import com.example.service.VoteService;

public class VoteServiceImpl implements VoteService {
	
	
	@Autowired
	VoteRepository voteepository;
	@PersistenceContext
	EntityManager em;

	public void addVote(Vote vote) {
		voteepository.save(vote);
		// TODO Auto-generated method stub
		
	}
	public List<Vote> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
