package com.example.demo;

public class Admin2 {


	private int totalEmailErrors;
	private int totalzipErrors;
	
	public int getTotalEmailErrors() {
		return totalEmailErrors;
	}
	public void setTotalEmailErrors(int totalEmailErrors) {
		this.totalEmailErrors = totalEmailErrors;
	}
	public int getTotalzipErrors() {
		return totalzipErrors;
	}
	public void setTotalzipErrors(int totalzipErrors) {
		this.totalzipErrors = totalzipErrors;
	}

	@Override
	public String toString() {
		return "Admin2 [totalEmailErrors=" + totalEmailErrors + ", totalzipErrors=" + totalzipErrors + "]";
	}
	
}
