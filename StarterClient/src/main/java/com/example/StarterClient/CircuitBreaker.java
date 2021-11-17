package com.example.StarterClient;

public class CircuitBreaker {

	private String status = "open";
	private Byte retry = 0;
	
	
	public CircuitBreaker(String status, Byte retry) {
		super();
		this.status = status;
		this.retry = retry;
	}
	
	public String changeStatus() {
		if(this.retry > 3) {
			this.setStatus("close");
			this.setRetry(retry++);
		}else {
			this.setStatus("open");
			this.setRetry(retry++);
		}
		return this.getStatus();
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Byte getRetry() {
		return retry;
	}

	public void setRetry(Byte retry) {
		this.retry = retry;
	}
	
	
	
}
