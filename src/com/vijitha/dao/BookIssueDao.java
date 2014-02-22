/**
 * 
 */
package com.vijitha.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.vijitha.model.BookIssues;
import com.vijitha.util.DbConnection;

/**
 * @author Vijitha
 *
 */
public class BookIssueDao {
	
	private Connection connection;
	public BookIssueDao(){
		try {
			connection = DbConnection.getConnection();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public void issueBook(BookIssues bookIssue){
		try {
			PreparedStatement ps=connection.prepareStatement("INSERT INTO issues (acc_no,member_id,issued_date,issuedby) VALUES(?,?,?,?);");
			ps.setString(1, bookIssue.getAccNo());
			ps.setString(2, bookIssue.getMemberId());
			ps.setDate(3, new java.sql.Date(bookIssue.getIssuedDate().getTime()));
			ps.setString(4, bookIssue.getIssuer());
			ps.executeUpdate();
			updateAvailableCopies(bookIssue); 
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void issueRequestedBook(BookIssues bookIssue){
		try {
			PreparedStatement ps=connection.prepareStatement("INSERT INTO issues (acc_no,member_id,issued_date,issuedby) VALUES(?,?,?,?);");
			ps.setString(1, bookIssue.getAccNo());
			ps.setString(2, bookIssue.getMemberId());
			ps.setDate(3, new java.sql.Date(bookIssue.getIssuedDate().getTime()));
			ps.setString(4, bookIssue.getIssuer());
			ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//TODO
		public void removeBookIssue(String id){
			
		}
		
		
		public List<BookIssues> getAllIssuedBooks(){
			List<BookIssues> bookIssued=new ArrayList<BookIssues>();
			
			
			try {
				Statement st = connection.createStatement();
				ResultSet rs=st.executeQuery("SELECT * FROM issues");
				while(rs.next()){
					BookIssues bookIssues =new BookIssues();
					bookIssues.setIssueID(rs.getInt("issue_id"));
					bookIssues.setAccNo(rs.getString("acc_no"));
					bookIssues.setMemberId(rs.getString("member_id"));
					bookIssues.setIssuedDate(rs.getDate("issued_date"));
					bookIssues.setIssuer(rs.getString("issuedby"));
					bookIssued.add(bookIssues);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		System.out.println(bookIssued.size() +"  ::::::::::::::::::");
			return bookIssued;
		}
		
		public void updateAvailableCopies(BookIssues bookIssues){
			try {
				int availableCount = getAvailableCopies(bookIssues);
				System.out.print("availableCount "+availableCount);
				int count = availableCount-1;
				System.out.print("NewavailableCount "+count);
				PreparedStatement ps=connection.prepareStatement("UPDATE book_copies_count SET available_copies=? WHERE acc_no=?");
				ps.setInt(1, count);
				ps.setString(2, bookIssues.getAccNo());
				//ps.setInt(3, book.getNoofBooks());
				ps.executeUpdate();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
					
		}
		
		public int getAvailableCopies(BookIssues bookIssues){
			int count=0;
			try {
				PreparedStatement ps=connection.prepareStatement("select available_copies from book_copies_count where acc_no = ? ");
				ps.setString(1, bookIssues.getAccNo());
				ResultSet rs=ps.executeQuery();
				if(rs.next()){
					count=rs.getInt("available_copies");
					
				}
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.print("count "+count);
			return count;		
		}

}
