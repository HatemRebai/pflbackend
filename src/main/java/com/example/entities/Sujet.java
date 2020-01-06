package com.example.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Sujet implements Serializable {
	
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String titre;
	private String description;

	@OneToOne
	private Vote vote;
	
	@ManyToOne
	private User user;
	 
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
		
	}
	public Vote getVote() {
		return vote;
	}
	public void setVote(Vote vote) {
		this.vote = vote;
	}
	public Sujet() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Sujet(int id, String titre, String description, Vote vote, User user) {
		super();
		this.id = id;
		this.titre = titre;
		this.description = description;
		this.vote = vote;
		this.user = user;
	}
	@Override
	public String toString() {
		return "Sujet [id=" + id + ", titre=" + titre + ", description=" + description + ", vote=" + vote + ", user="
				+ user + "]";
	}


}
