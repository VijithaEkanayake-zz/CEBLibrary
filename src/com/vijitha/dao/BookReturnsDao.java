/**
 * 
 */
package com.vijitha.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.vijitha.model.BookIssues;
import com.vijitha.model.BookReturns;
import com.vijitha.util.DbConnection;

/**
 * @author Vijitha
 *
 */
public class BookReturnsDao {
	
	private Connection connection;
	public BookReturnsDao(){
		try {
			connection = DbConnection.getConnection();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public void returnBook(BookReturns bookReturns){
		BookIssues bookIssues = getBookIssuesDetails(bookReturns);
		System.out.print("rrrr"+bookReturns.getReceiver());
		try {
			PreparedStatement ps=connection.prepareStatement("INSERT INTO returns (issue_id,acc_no,member_id,issued_date,issuedby,returned_date,receivedby) VALUES(?,?,?,?,?,?,?);");
			ps.setInt(1, bookIssues.getIssueID());
			ps.setString(2, bookIssues.getAccNo());
			ps.setString(3, bookIssues.getMemberId());
			ps.setDate(4, new java.sql.Date(bookIssues.getIssuedDate().getTime()));
			ps.setString(5, bookIssues.getIssuer());
			ps.setDate(6, new java.sql.Date(bookReturns.getReturnedDate().getTime()));
			ps.setString(7, bookReturns.getReceiver());
			ps.executeUpdate();
			removeReturned(bookIssues);
			updateAvailableCopies(bookReturns); 
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	public void updateAvailableCopies(BookReturns bookReturns){
		try {
			int availableCount = getAvailableCopies(bookReturns);
			int count = availableCount+1;
			PreparedStatement ps=connection.prepareStatement("UPDATE book_copies_count SET available_copies=? WHERE acc_no=?");
			ps.setInt(1, count);
			ps.setString(2, bookReturns.getAccNo());
			//ps.setInt(3, book.getNoofBooks());
			ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	}
	
	public int getAvailableCopies(BookReturns bookReturns){
		int count=0;
		try {
			PreparedStatement ps=connection.prepareStatement("select available_copies from book_copies_count where acc_no = ? ");
			ps.setString(1, bookReturns.getAccNo());
			ResultSet rs=ps.executeQuery();
			if(rs.next()){
				count=rs.getInt("available_copies");
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return count;		
	}
	
	public BookIssues getBookIssuesDetails(BookReturns bookReturns){
		BookIssues bookIssues=new BookIssues();
		try {
			PreparedStatement ps=connection.prepareStatement("SELECT * FROM issues WHERE acc_no = ? AND member_id = ?");
			ps.setString(1, bookReturns.getAccNo());
			ps.setString(2, bookReturns.getMemberId());
			ResultSet rs=ps.executeQuery();
			
			if(rs.next()){
				bookIssues.setIssueID(rs.getInt("issue_id"));
				bookIssues.setAccNo(rs.getString("acc_no"));
				bookIssues.setMemberId(rs.getString("member_id"));
				bookIssues.setIssuedDate(rs.getDate("issued_date"));
				bookIssues.setIssuer(rs.getString("issuedby"));	
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return bookIssues;
	}
	
	public void removeReturned(BookIssues bookIssues){
		System.out.print("delete called");
		try {
			PreparedStatement ps=connection.prepareStatement("DELETE FROM issues WHERE issue_id = ?");
			ps.setInt(1, bookIssues.getIssueID());
			ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
