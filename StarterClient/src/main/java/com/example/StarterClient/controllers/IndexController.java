package com.example.StarterClient.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.StarterServer.state.State;

@RestController
public class IndexController {

	@Autowired
	private State circuitBreaker;
	
	private Long contadorIntentos = 0L;
	
	@PostMapping("/writer")
	public ResponseEntity<String> setEstado(String nuevoEstado){
		contadorIntentos++;
		return new ResponseEntity<String>(HttpStatus.OK).ok(circuitBreaker.checkCircuitBreaker(nuevoEstado));
	}
	
	@GetMapping("/retry")
	public ResponseEntity<Integer> getRetry(){
		return new ResponseEntity<Integer>(HttpStatus.OK).ok(circuitBreaker.getRetry());
	}
	
}