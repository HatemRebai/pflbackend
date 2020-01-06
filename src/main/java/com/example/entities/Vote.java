package com.example.entities;


import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Vote  implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String oui;
	private String non;
	

	@OneToOne
	private Sujet sujet;
	public String getOui() {
		return oui;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setOui(String oui) {
		this.oui = oui;
	}
	public String getNon() {
		return non;
	}
	public void setNon(String non) {
		this.non = non;
	}

	public Sujet getSujet() {
		return sujet;
	}
	public void setSujet(Sujet sujet) {
		this.sujet = sujet;
	}
	public Vote() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Vote(int id, String oui, String non, User user, Sujet sujet) {
		super();
		this.id = id;
		this.oui = oui;
		this.non = non;
	
		this.sujet = sujet;
	}

	@Override
	public String toString() {
		return "Vote [id=" + id + ", oui=" + oui + ", non=" + non + ", sujet=" + sujet + "]";
	}


	 

}
