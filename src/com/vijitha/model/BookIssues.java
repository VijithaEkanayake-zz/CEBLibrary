package com.vijitha.model;

import java.util.Date;



public class BookIssues {
	int issueID;
	String accNo;
	String memberId;
	Date issuedDate;
	Date legalReturnDate;
	String issuer;
	int fine;
	
	public int getFine() {
		return fine;
	}
	public void setFine(int fine) {
		this.fine = fine;
	}
	public int getIssueID() {
		return issueID;
	}
	public void setIssueID(int issueID) {
		this.issueID = issueID;
	}
	
	public Date getLegalReturnDate() {
		return legalReturnDate;
	}
	public void setLegalReturnDate(Date legalReturnDate) {
		this.legalReturnDate = legalReturnDate;
	}
	public String getAccNo() {
		return accNo;
	}
	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public Date getIssuedDate() {
		return issuedDate;
	}
	public void setIssuedDate(Date issuedDate) {
		this.issuedDate = issuedDate;
	}
	public String getIssuer() {
		return issuer;
	}
	public void setIssuer(String issuer) {
		this.issuer = issuer;
	}
	
	

}
