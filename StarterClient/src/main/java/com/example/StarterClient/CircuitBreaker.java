package com.example.StarterClient;

public class CircuitBreaker {

	private String status = "open";
	private Integer retry = 0;
	
	
	public CircuitBreaker(String status, Integer retry) {
		super();
		this.status = status;
		this.retry = retry;
	}
	
	public String changeStatus() {
		if(this.retry > 2) {
			this.setStatus("close");
			this.setRetry(retry++);
		}else {
			this.setStatus("half-open");
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

	public Integer getRetry() {
		return retry;
	}

	public void setRetry(Integer retry) {
		this.retry = retry;
	}
	
	
	
}
