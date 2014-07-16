/**
 * 
 */
package com.vijitha.model;

import java.util.Date;

/**
 * @author Vijitha
 *
 */
public class Book {
	
	private String id,title,isbn,author1,author2,author3,author4,corporateBody1,corporateBody2,corporateBody3,corporateBody4,series,classNo,rackNo,publisher,description,keywords,recordType,bibliographicLevel,heading,headingIdentifier,typeofMaterial,notes,abstractofBook,broadHeading,geoCode,enteredBy;

	private int noofBooks,yearofPublication,edition;
	private Date dateofArrival,enteredDate;
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the isbn
	 */
	public String getIsbn() {
		return isbn;
	}
	/**
	 * @param isbn the isbn to set
	 */
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	/**
	 * @return the classNo
	 */
	public String getClassNo() {
		return classNo;
	}
	/**
	 * @param classNo the classNo to set
	 */
	public void setClassNo(String classNo) {
		this.classNo = classNo;
	}
	/**
	 * @return the rackNo
	 */
	public String getRackNo() {
		return rackNo;
	}
	/**
	 * @param rackNo the rackNo to set
	 */
	public void setRackNo(String rackNo) {
		this.rackNo = rackNo;
	}
	/**
	 * @return the pubisher
	 */
	public String getPublisher() {
		return publisher;
	}
	/**
	 * @param pubisher the pubisher to set
	 */
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the keywords
	 */
	public String getKeywords() {
		return keywords;
	}
	/**
	 * @param keywords the keywords to set
	 */
	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}
	/**
	 * @return the recordType
	 */
	public String getRecordType() {
		return recordType;
	}
	/**
	 * @param recordType the recordType to set
	 */
	public void setRecordType(String recordType) {
		this.recordType = recordType;
	}
	/**
	 * @return the bibliographicLevel
	 */
	public String getBibliographicLevel() {
		return bibliographicLevel;
	}
	/**
	 * @param bibliographicLevel the bibliographicLevel to set
	 */
	public void setBibliographicLevel(String bibliographicLevel) {
		this.bibliographicLevel = bibliographicLevel;
	}
	/**
	 * @return the headingIdentifier
	 */
	public String getHeadingIdentifier() {
		return headingIdentifier;
	}
	/**
	 * @param headingIdentifier the headingIdentifier to set
	 */
	public void setHeadingIdentifier(String headingIdentifier) {
		this.headingIdentifier = headingIdentifier;
	}
	/**
	 * @return the typeofMaterial
	 */
	public String getTypeofMaterial() {
		return typeofMaterial;
	}
	/**
	 * @param typeofMaterial the typeofMaterial to set
	 */
	public void setTypeofMaterial(String typeofMaterial) {
		this.typeofMaterial = typeofMaterial;
	}
	/**
	 * @return the noofBooks
	 */
	public int getNoofBooks() {
		return noofBooks;
	}
	/**
	 * @param noofBooks the noofBooks to set
	 */
	public void setNoofBooks(int noofBooks) {
		this.noofBooks = noofBooks;
	}
	/**
	 * @return the edition
	 */
	public int getEdition() {
		return edition;
	}
	/**
	 * @param edition the edition to set
	 */
	public void setEdition(int edition) {
		this.edition = edition;
	}
	/**
	 * @return the dateofArrival
	 */
	public Date getDateofArrival() {
		return dateofArrival;
	}
	/**
	 * @param dateofArrival the dateofArrival to set
	 */
	public void setDateofArrival(Date dateofArrival) {
		this.dateofArrival = dateofArrival;
	}
	
	public String getHeading() {
		return heading;
	}
	public void setHeading(String heading) {
		this.heading = heading;
	}
	public String getAuthor1() {
		return author1;
	}
	public String getAuthor2() {
		return author2;
	}
	public String getAuthor3() {
		return author3;
	}
	public String getAuthor4() {
		return author4;
	}
	public String getCorporateBody1() {
		return corporateBody1;
	}
	public String getCorporateBody2() {
		return corporateBody2;
	}
	public String getCorporateBody3() {
		return corporateBody3;
	}
	public String getCorporateBody4() {
		return corporateBody4;
	}
	public String getSeries() {
		return series;
	}
	public String getNotes() {
		return notes;
	}
	public String getAbstractofBook() {
		return abstractofBook;
	}
	public String getBroadHeading() {
		return broadHeading;
	}
	public String getGeoCode() {
		return geoCode;
	}
	public String getEnteredBy() {
		return enteredBy;
	}
	public int getYearofPublication() {
		return yearofPublication;
	}
	public Date getEnteredDate() {
		return enteredDate;
	}
	public void setAuthor1(String author1) {
		this.author1 = author1;
	}
	public void setAuthor2(String author2) {
		this.author2 = author2;
	}
	public void setAuthor3(String author3) {
		this.author3 = author3;
	}
	public void setAuthor4(String author4) {
		this.author4 = author4;
	}
	public void setCorporateBody1(String corporateBody1) {
		this.corporateBody1 = corporateBody1;
	}
	public void setCorporateBody2(String corporateBody2) {
		this.corporateBody2 = corporateBody2;
	}
	public void setCorporateBody3(String corporateBody3) {
		this.corporateBody3 = corporateBody3;
	}
	public void setCorporateBody4(String corporateBody4) {
		this.corporateBody4 = corporateBody4;
	}
	public void setSeries(String series) {
		this.series = series;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	public void setAbstractofBook(String abstractofBook) {
		this.abstractofBook = abstractofBook;
	}
	public void setBroadHeading(String broadHeading) {
		this.broadHeading = broadHeading;
	}
	public void setGeoCode(String geoCode) {
		this.geoCode = geoCode;
	}
	public void setEnteredBy(String enteredBy) {
		this.enteredBy = enteredBy;
	}
	public void setYearofPublication(int yearofPublication) {
		this.yearofPublication = yearofPublication;
	}
	public void setEnteredDate(Date enteredDate) {
		this.enteredDate = enteredDate;
	}
	

}
