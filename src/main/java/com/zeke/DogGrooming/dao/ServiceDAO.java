package com.zeke.DogGrooming.dao;

import java.util.List;

import com.zeke.DogGrooming.entity.Service;

public interface ServiceDAO {

	public List<Service> getAllServices();
	
	public Service getService(int id);
	
	public Service saveService(Service service);
	
	public void deleteService(int id);
}
