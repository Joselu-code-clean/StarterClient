package com.example.StarterClient.service;

import java.net.URI;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.example.StarterClient.controllers.IndexController;

public class ClienteService {
	
	
	/*ERRORES
	 * 
	 * Creo que no me hace falta el servicio
	 * */
	
	
	
	
	Logger logger = LoggerFactory.getLogger(ClienteService.class);
	
	@Autowired
	IndexController controller;
	
	RestTemplate restTemplate = new RestTemplate();
	String urlBase = "http://localhost:8080/";
	String writeEndPoint = "estados/writer";
	
	public void setToOpen() {
		String fooResourceUrl = urlBase+writeEndPoint;
		ResponseEntity<String> response = restTemplate.postForEntity(URI.create(fooResourceUrl), "open", String.class);
		logger.info("Estado ---- open" );

	}
	
	public void setToClose() {
		String fooResourceUrl = urlBase+writeEndPoint;
		ResponseEntity<String> response = restTemplate.postForEntity(URI.create(fooResourceUrl), "close", String.class);
		logger.info("Estado ---- close");

	}
	
	public void setToHalfOpen() {
		String fooResourceUrl = urlBase+writeEndPoint;
		ResponseEntity<String> response = restTemplate.postForEntity(URI.create(fooResourceUrl), "half-open", String.class);
		logger.info("Estado ---- half-open");

	}
}
