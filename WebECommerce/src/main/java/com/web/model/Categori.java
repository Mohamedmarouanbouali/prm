package com.web.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="categorie")
public class Categori {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="idCategorie")
	int idCategori;
	
	@Column(name="name")
	String name;
	
	@OneToMany(mappedBy = "Produit")
	List<Produit> produits;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Produit> getProduits() {
		return produits;
	}

	public void setProduits(List<Produit> produits) {
		this.produits = produits;
	}

	public int getIdCategori() {
		return idCategori;
	}

	public Categori(String name) {
		this.name = name;
	}

	public Categori() {
		super();
	}
	
}
