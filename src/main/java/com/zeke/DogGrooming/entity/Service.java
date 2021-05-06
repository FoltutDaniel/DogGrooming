package com.zeke.DogGrooming.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Service {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "service_name")
	private String serviceName;
	
	@Column(name = "cost")
	private float cost;
	
	@Column(name = "time_required")
	private int timeRequired;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "dog_id")
	private Dog dog;

	public Service(String serviceName, float cost, int timeRequired) {
		super();
		this.serviceName = serviceName;
		this.cost = cost;
		this.timeRequired = timeRequired;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	public int getTimeRequired() {
		return timeRequired;
	}

	public void setTimeRequired(int timeRequired) {
		this.timeRequired = timeRequired;
	}

	public Dog getDog() {
		return dog;
	}

	public void setDog(Dog dog) {
		this.dog = dog;
	}

	@Override
	public String toString() {
		return "Service [id=" + id + ", serviceName=" + serviceName + ", cost=" + cost + ", timeRequired="
				+ timeRequired + ", dog=" + dog + "]";
	}
	
	
}
