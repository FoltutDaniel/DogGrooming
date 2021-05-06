package com.zeke.DogGrooming.service;

import java.util.List;

import com.zeke.DogGrooming.entity.Client;

public interface ClientService {

	
	public List<Client> getAllClients();
	
	public Client getcClient(int id);
	
	public Client saveClient(Client client);
	
	public void deleteClient(int id);
}
