package com.example.demo;

import java.sql.Date;
import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Issues {
	


	@Id
     @GeneratedValue
	private int issueId;
	 @Column( columnDefinition="BIT")
	 private boolean isResolved ;
	 private int orderId;
	 

		private Date issueDate;
		 private Time issueTime;
	 
	 public Date getIssueDate() {
		return issueDate;
	}


	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}


	public Time getIssueTime() {
		return issueTime;
	}


	public void setIssueTime(Time issueTime) {
		this.issueTime = issueTime;
	}

	 
	
	public int getIssueId() {
		return issueId;
	}


	public void setIssueId(int issueId) {
		this.issueId = issueId;
	}


	public boolean isResolved() {
		return isResolved;
	}


	public void setResolved(boolean isResolved) {
		this.isResolved = isResolved;
	}


	public int getOrderId() {
		return orderId;
	}


	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	
	
    @Override
	public String toString() {
		return "Issues [issueId=" + issueId + ", isResolved=" + isResolved + ", orderId=" + orderId + ", issueDate="
				+ issueDate + ", issueTime=" + issueTime + "]";
	}



	 
}
