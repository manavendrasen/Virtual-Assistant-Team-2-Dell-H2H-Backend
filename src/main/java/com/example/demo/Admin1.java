package com.example.demo;

import java.sql.Date;

public class Admin1 {

	

	private Date issueDate;
	private int emailErrors;
	private int zipErrors;
	
	public Date getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
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
		return "Admin1 [emailErrors=" + emailErrors + ", zipErrors=" + zipErrors + "]";
	}
	
}
