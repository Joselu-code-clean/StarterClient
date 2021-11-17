package com.example.StarterClient;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StarterClientApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StarterClientApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		/*Me ha faltado la logica de ejecutar 5 veces el metodo del servicio*/
		for (int i = 0; i < 5; i++) {
			
		}
		
	}

}
