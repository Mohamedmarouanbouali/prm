package com.web.model;


import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.ToString;

@Entity
@Table
public class User {
	
	//
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	@ToString.Include
private int id ;
	@Column(name = "firstName",nullable = false,length = 40)
	@ToString.Include
private String firstName;
	@Column(name = "lastName",nullable = false,length = 40)
	@ToString.Include
private String lastName;
	@Column
	@ToString.Include
private String maidenName;
	@Column
	@ToString.Include
private String gender;
	@Column
	@ToString.Include
private String email ;
	@Column
	@ToString.Include
private String phone ;
	@Column
	@ToString.Include
private String username;
	@Column
	@ToString.Include
private String password;
	@Column
	@ToString.Include
private Date birthDate;
	@Column
	@ToString.Include
private String image;
	@Column
	@ToString.Include
private float height;
	@Column
	@ToString.Include
private float weight;
	@Column
	@ToString.Include
private String address;
	

	@OneToMany(mappedBy="user",fetch=FetchType.LAZY)
private List<commande> commandes;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMaidenName() {
		return maidenName;
	}

	public void setMaidenName(String maidenName) {
		this.maidenName = maidenName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<commande> getCommandes() {
		return commandes;
	}

	public void setCommandes(List<commande> commandes) {
		this.commandes = commandes;
	}

	public User(int id, String firstName, String lastName, String maidenName, String gender, String email, String phone,
			String username, String password, Date birthDate, String image, float height, float weight, String address,
			List<commande> commandes) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.maidenName = maidenName;
		this.gender = gender;
		this.email = email;
		this.phone = phone;
		this.username = username;
		this.password = password;
		this.birthDate = birthDate;
		this.image = image;
		this.height = height;
		this.weight = weight;
		this.address = address;
		this.commandes = commandes;
	}
	
}
