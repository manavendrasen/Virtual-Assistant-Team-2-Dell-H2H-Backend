package com.example.demo;


public class Admin3 {
	

	private String location;
	private int emailErrors;
	private int zipErrors;
	
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getEmailErrors() {
		return emailErrors;
	}
	public void setEmailErrors(int emailErrors) {
		this.emailErrors = emailErrors;
	}
	public int getZipErrors() {
		return zipErrors;
	}
	public void setZipErrors(int zipErrors) {
		this.zipErrors = zipErrors;
	}

	@Override
	public String toString() {
		return "Admin3 [location=" + location + ", emailErrors=" + emailErrors + ", zipErrors=" + zipErrors + "]";
	}
	

}
