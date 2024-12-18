package org.mql.java.reflection.classes;

import org.mql.java.reflection.enumerations.filiere;

public class Etudiant {
	private String nom;
	private String prenom;
	private int age;
	private String cni;
	private int cne;
	private filiere filiere;

	public Etudiant() {
		
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCni() {
		return cni;
	}

	public void setCni(String cni) {
		this.cni = cni;
	}
	
	public int getCne() {
		return cne;
	}

	public void setCne(int cne) {
		this.cne = cne;
	}

	public filiere getFiliere() {
		return filiere;
	}

	public void setFiliere(filiere filiere) {
		this.filiere = filiere;
	}

	public Etudiant(String nom, String prenom, int age, String cni, int cne, filiere filiere) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.cni = cni;
		this.cne = cne;
		this.filiere = filiere;
	}

	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom + ", age=" + age + ", cni=" + cni + ", cne=" + cne
				+ ", filiere=" + filiere + "]";
	}



}
