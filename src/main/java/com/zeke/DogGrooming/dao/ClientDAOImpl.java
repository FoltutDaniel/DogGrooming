package com.zeke.DogGrooming.dao;

import java.util.List;


import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.zeke.DogGrooming.entity.Client;

@Repository
public class ClientDAOImpl implements ClientDAO {
	
	private EntityManager entityManager;

	@Autowired
	public ClientDAOImpl(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	@Override
	public List<Client> getAllClients() {
		Session currentSession = entityManager.unwrap(Session.class);
		
		Query<Client> theQuery = currentSession.createQuery("from Client", Client.class);
		
		List<Client> clients = theQuery.getResultList();
		
		return clients;
		
	}

	@Override
	public Client getClient(int id) {
		
		Session currentSession = entityManager.unwrap(Session.class);
		
		Client client = currentSession.get(Client.class, id);
		
		return client;
		
	}

	@Override
	public Client saveClient(Client client) {
		
		Session currentSession = entityManager.unwrap(Session.class);
		
		currentSession.saveOrUpdate(client);
		
		return client;
	}

	@Override
	public void deleteClient(int id) {
		
		Session currentSession = entityManager.unwrap(Session.class);
		
		currentSession.delete(currentSession.get(Client.class, id));
		
	}

}
