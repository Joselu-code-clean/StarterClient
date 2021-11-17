package com.example.StarterClient;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix="circuitbreaker")
public class CircuitBreakerProperties {

	private Integer retry = 0;

	public Integer getRetry() {
		return retry;
	}

	public void setRetry(Integer retry) {
		this.retry = retry;
	}

	

}
