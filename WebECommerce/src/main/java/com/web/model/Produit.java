package com.web.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "produit")
public class Produit {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "idProduit")
	int idProduit;

	@Column(name = "title")
	String title;
	
	@Column(name = "description")
	String description;
	@Column(name = "price")
	float price;

	@Column(name = "discount")
	float discount;

	@Column(name = "rating")
	float rating;

	@Column(name = "stock")
	int stock;

	@Column(name = "brand")
	String brand;

	@Column(name = "thumbnail")
	String thumbnail;

	@Column(name = "image1")
	String image1;

	@Column(name = "image2")
	String image2;

	@Column(name = "image3")
	String image3;

	@Column(name = "image4")
	String image4;
	
	@Column(name="idCategorie")
	int idCategori;
	
	@ManyToOne
	@JoinColumn(name="idCategorie")
	Categori categori;
	
	public Produit(String title, String description, float price, float discount, float rating,
			int stock, String brand, String thumbnail, String image1, String image2, String image3, String image4,int idCategorie) {
		this.title = title;
		this.description = description;
		this.price = price;
		this.discount = discount;
		this.rating = rating;
		this.stock = stock;
		this.brand = brand;
		this.thumbnail = thumbnail;
		this.image1 = image1;
		this.image2 = image2;
		this.image3 = image3;
		this.image4 = image4;
		this.idCategori=idCategorie;
	}

	public Produit() {
		super();
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public float getDiscount() {
		return discount;
	}

	public void setDiscount(float discount) {
		this.discount = discount;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getThumbnail() {
		return thumbnail;
	}

	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}

	public String getImage1() {
		return image1;
	}

	public void setImage1(String image1) {
		this.image1 = image1;
	}

	public String getImage2() {
		return image2;
	}

	public void setImage2(String image2) {
		this.image2 = image2;
	}

	public String getImage3() {
		return image3;
	}

	public void setImage3(String image3) {
		this.image3 = image3;
	}

	public String getImage4() {
		return image4;
	}

	public void setImage4(String image4) {
		this.image4 = image4;
	}

	public int getIdProduit() {
		return idProduit;
	}

}
