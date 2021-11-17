package com.example.StarterClient;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix="retry")
public class CircuitBreakerProperties {

	private Byte retry = 0;

	public Byte getCounter() {
		return retry;
	}

	public void setCounter(Byte retry) {
		this.retry = retry;
	}

}
