package com.zeke.DogGrooming.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zeke.DogGrooming.entity.Client;
import com.zeke.DogGrooming.service.ClientService;

@RestController
@RequestMapping("/api")
public class ClientRestController {

	@Autowired
	private ClientService clientService;
	
	@GetMapping("/clients")
	public List<Client> getAllClients(){
		return this.clientService.getAllClients();
	}
}
