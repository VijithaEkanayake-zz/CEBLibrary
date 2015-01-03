/**
 * 
 */
package com.vijitha.model;

import java.util.Date;

/**
 * @author root
 *
 */
public class Standards {
	
	private String refNo,type,amendment,description,yearOfPublished,yearOfAmended,enteredBy,location,keywords;
	private int edition;
	private Date enteredDate;
	
	
	
	public String getRefNo() {
		return refNo;
	}
	public String getType() {
		return type;
	}
	public String getAmendment() {
		return amendment;
	}
	public String getDescription() {
		return description;
	}
	public String getYearOfPublished() {
		return yearOfPublished;
	}
	public String getYearOfAmended() {
		return yearOfAmended;
	}
	public String getEnteredBy() {
		return enteredBy;
	}
	public String getLocation() {
		return location;
	}
	public String getKeywords() {
		return keywords;
	}
	public int getEdition() {
		return edition;
	}
	public Date getEnteredDate() {
		return enteredDate;
	}
	public void setRefNo(String refNo) {
		this.refNo = refNo;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setAmendment(String amendment) {
		this.amendment = amendment;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setYearOfPublished(String yearOfPublished) {
		this.yearOfPublished = yearOfPublished;
	}
	public void setYearOfAmended(String yearOfAmended) {
		this.yearOfAmended = yearOfAmended;
	}
	public void setEnteredBy(String enteredBy) {
		this.enteredBy = enteredBy;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}
	public void setEdition(int edition) {
		this.edition = edition;
	}
	public void setEnteredDate(Date enteredDate) {
		this.enteredDate = enteredDate;
	}
	
	
		

}
