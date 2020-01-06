package com.example.serviceImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.entities.Sujet;
import com.example.repositories.SujetRepository;
import com.example.service.SujetService;

@Service("sujetservice")
public class SujetServiceImpl implements SujetService {
	
	
	@Autowired
	SujetRepository sujetrepository;
	@PersistenceContext
	EntityManager em;
	
	

	public void addSujet(Sujet sujet) {
		sujetrepository.save(sujet);
		
	}

	public List<Sujet> getAll() {
		TypedQuery<Sujet> query  = em.createQuery("SELECT o FROM Ouvrier o ", Sujet.class);
		return query.getResultList();
	
	}

	@Override
	public Sujet getSujetbyId(int id) {
		
		return sujetrepository.getOne(id);
	}
	
	
}
