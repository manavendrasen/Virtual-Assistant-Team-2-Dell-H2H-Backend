package com.example.demo;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Error {

	
    @Id
    @GeneratedValue
	private int errorId;
	private String errorName;

	
	public int getErrorId() {
		return errorId;
	}
	public void setErrorId(int errorId) {
		this.errorId = errorId;
	}
	public String getErrorName() {
		return errorName;
	}
	public void setErrorName(String errorName) {
		this.errorName = errorName;
	}
	
	@Override
	public String toString() {
		return "Error [errorId=" + errorId + ", errorName=" + errorName + "]";
	}
	
}
