package com.example.service;

import java.util.List;

import com.example.entities.Vote;

public interface VoteService {
	
	public void addVote (Vote vote);
	public List<Vote> getAll();

}
