package com.zeke.DogGrooming.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zeke.DogGrooming.dao.ClientDAO;

import com.zeke.DogGrooming.entity.Client;

@Service
public class ClientServiceImpl implements ClientService {

	@Autowired
	private ClientDAO clientDAO;
	
	@Override
	@Transactional
	public List<Client> getAllClients() {
		return this.clientDAO.getAllClients();
	}

	@Override
	@Transactional
	public Client getcClient(int id) {
		return this.clientDAO.getClient(id);
	}

	@Override
	@Transactional
	public Client saveClient(Client client) {
		return this.clientDAO.saveClient(client);
	}

	@Override
	@Transactional
	public void deleteClient(int id) {
		this.clientDAO.deleteClient(id);
	}

}
