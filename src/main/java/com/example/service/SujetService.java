package com.example.service;

import com.example.entities.Sujet;
import com.example.entities.User;

import java.util.List;

public interface SujetService {
	
	
	public void addSujet( Sujet sujet);
	public List<Sujet> getAll();
	public Sujet getSujetbyId (int id);

}
