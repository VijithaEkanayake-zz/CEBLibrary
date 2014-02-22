/**
 * 
 */
package com.vijitha.model;

import java.util.Date;

/**
 * @author vijitha
 *
 */
public class Fine {
	
	private Date borrowedDate;
	private Date dateToBeReturn;
	private String memberId;
	private String bookId;
	
	
	public Date getBorrowedDate() {
		return borrowedDate;
	}
	public void setBorrowedDate(Date borrowedDate) {
		this.borrowedDate = borrowedDate;
	}
	public Date getDateToBeReturn() {
		return dateToBeReturn;
	}
	public void setDateToBeReturn(Date dateToBeReturn) {
		this.dateToBeReturn = dateToBeReturn;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getBookId() {
		return bookId;
	}
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

}
