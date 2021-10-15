package com.example.demo;

import java.io.Serializable;
import java.util.Objects;



public class IssueHasId implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int issueId;
	private int errorId;
	

	public IssueHasId(){
		issueId=0;
		errorId=0;
	}
	
	public IssueHasId(int issueId,int errorId){
		this.issueId=issueId;
		this.errorId=errorId;
		
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(errorId, issueId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		IssueHasId other = (IssueHasId) obj;
		return errorId == other.errorId && issueId == other.issueId;
	}

	
}

