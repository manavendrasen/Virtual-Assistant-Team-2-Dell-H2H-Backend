package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
@IdClass(IssueHasId.class)
public class IssueHas{
	
	@Id
	private int issueId;
	



	@Id
	private int errorId;
	
	public int getIssueId() {
		return issueId;
	}

	public void setIssueId(int issueId) {
		this.issueId = issueId;
	}

	public int getErrorId() {
		return errorId;
	}

	public void setErrorId(int errorId) {
		this.errorId = errorId;
	}


	@Override
	public String toString() {
		return "IssueHas [issueId=" + issueId + ", errorId=" + errorId + "]";
	}
}
