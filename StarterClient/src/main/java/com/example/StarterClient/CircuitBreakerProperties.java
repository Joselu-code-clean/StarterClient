package com.example.StarterClient;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix="retry")
public class CircuitBreakerProperties {

	private Integer retry = 0;

	public Integer getCounter() {
		return retry;
	}

	public void setCounter(Integer retry) {
		this.retry = retry;
	}

}
