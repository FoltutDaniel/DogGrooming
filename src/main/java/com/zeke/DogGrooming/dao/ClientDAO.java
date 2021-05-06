package com.zeke.DogGrooming.dao;

import java.util.List;

import com.zeke.DogGrooming.entity.Client;


public interface ClientDAO {
	
	public List<Client> getAllClients();
	
	public Client getClient(int id);
	
	public Client saveClient(Client client);
	
	public void deleteClient(int id);
	
	
}
