package com.example.StarterClient;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(CircuitBreaker.class)
@EnableConfigurationProperties(CircuitBreakerProperties.class)
public class CircuitBreakerAutoConfigure {

	private final CircuitBreakerProperties properties;
	
	
	
	public CircuitBreakerAutoConfigure(CircuitBreakerProperties properties) {
		super();
		this.properties = properties;
	}


	@Bean
	public CircuitBreaker saludo() {
		System.out.println("Estados-Contador: "+ properties.getRetry() );
		return new CircuitBreaker("open", properties.getRetry());
	}
	
}
