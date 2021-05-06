package com.zeke.DogGrooming.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name = "dog")
public class Dog {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "dog_name")
	private String dogName;
	
	@Column(name = "breed")
	private String breed;
	
	@Column(name = "age")
	private int age;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "dog_id")
	private List<Service> services;
	
	public Dog(String dogName, String breed, int age) {
		super();
		this.dogName = dogName;
		this.breed = breed;
		this.age = age;
	}

	public Dog() {
		// TODO Auto-generated constructor stub
	}
	public String getDogName() {
		return dogName;
	}

	public void setDogName(String dogName) {
		this.dogName = dogName;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	public void addService(Service tempService) {
		if(this.services == null) {
			this.services = new ArrayList<>();
		}
		
		this.services.add(tempService);
	}

	@Override
	public String toString() {
		return "Dog [id=" + id + ", dogName=" + dogName + ", breed=" + breed + ", age=" + age 
				+ ", services=" + services + "]";
	}
	
	
}
