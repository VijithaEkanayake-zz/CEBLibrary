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

import com.vijitha.model.BookRequest;
import com.vijitha.util.DbConnection;

/**
 * @author vijitha
 *
 */
public class BookRequestDao {
	
	private Connection connection;
	
	public BookRequestDao(){
		try {
			connection = DbConnection.getConnection();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public void requestBook(BookRequest bookRequest){
		try {
			PreparedStatement ps=connection.prepareStatement("INSERT INTO requests (member_id,book_id,requested_date) VALUES(?,?,?);");
			ps.setString(1, bookRequest.getMemberId());
			ps.setString(2, bookRequest.getBookId());
			ps.setDate(3, new java.sql.Date(bookRequest.getReqDate().getTime()));
			ps.executeUpdate();
			updateAvailableCopies(bookRequest); 
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void updateAvailableCopies(BookRequest bookRequest){
		try {
			int availableCount = getAvailableCopies(bookRequest);
			System.out.print("availableCount "+availableCount);
			int count = availableCount-1;
			System.out.print("NewavailableCount "+count);
			PreparedStatement ps=connection.prepareStatement("UPDATE book_copies_count SET available_copies=? WHERE acc_no=?");
			ps.setInt(1, count);
			ps.setString(2, bookRequest.getBookId());
			//ps.setInt(3, book.getNoofBooks());
			ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	}
	
	public void updateRequestAvailableCopies(BookRequest bookRequest){
		try {
			int availableCount = getAvailableCopies(bookRequest);
			System.out.print("availableCount "+availableCount);
			int count = availableCount+1;
			System.out.print("NewavailableCount "+count);
			PreparedStatement ps=connection.prepareStatement("UPDATE book_copies_count SET available_copies=? WHERE acc_no=?");
			ps.setInt(1, count);
			ps.setString(2, bookRequest.getBookId());
			//ps.setInt(3, book.getNoofBooks());
			ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	}
	
	public int getAvailableCopies(BookRequest bookRequest){
		int count=0;
		try {
			PreparedStatement ps=connection.prepareStatement("select available_copies from book_copies_count where acc_no = ? ");
			ps.setString(1, bookRequest.getBookId());
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

	/**
	 * @param username
	 * @return
	 */
	
	public List<BookRequest> getRequestesBooks(String username){
		List<BookRequest> bookRequests=new ArrayList<BookRequest>();
		
		
		try {
			PreparedStatement ps=connection.prepareStatement("SELECT * FROM requests WHERE member_id=?");
			ps.setString(1, username);
			ResultSet rs=ps.executeQuery();
			
			while(rs.next()){
				BookRequest bookRequest=new BookRequest();
				bookRequest.setRequestId(rs.getInt("request_id"));
				bookRequest.setBookId(rs.getString("book_id"));
				bookRequest.setMemberId(rs.getString("member_id"));
				bookRequest.setReqDate(rs.getDate("requested_date"));
				bookRequests.add(bookRequest);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	System.out.println(bookRequests.size() +"  ::::::::::::::::::");
		return bookRequests;
	}

	/**
	 * @return
	 */
	public List<BookRequest> getAllRequestesBooks(){
		List<BookRequest> bookRequests=new ArrayList<BookRequest>();
		
		
		try {
			Statement st = connection.createStatement();
			ResultSet rs=st.executeQuery("SELECT * FROM requests");
			
			while(rs.next()){
				BookRequest bookRequest=new BookRequest();
				bookRequest.setRequestId(rs.getInt("request_id"));
				bookRequest.setBookId(rs.getString("book_id"));
				bookRequest.setMemberId(rs.getString("member_id"));
				bookRequest.setReqDate(rs.getDate("requested_date"));
				bookRequests.add(bookRequest);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	System.out.println(bookRequests.size() +"  ::::::::::::::::::");
		return bookRequests;
	}
	
	public BookRequest getBookRequestById(String requestId){
		BookRequest bookRequest=new BookRequest();
		
		try {
			PreparedStatement ps=connection.prepareStatement("SELECT * FROM requests WHERE request_id = ?");
			ps.setString(1, requestId);
			ResultSet rs=ps.executeQuery();
			
			if(rs.next()){
				bookRequest.setRequestId(rs.getInt("request_id"));
				bookRequest.setBookId(rs.getString("book_id"));
				bookRequest.setMemberId(rs.getString("member_id"));
				bookRequest.setReqDate(rs.getDate("requested_date"));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return bookRequest;
	}
	
	public void deleteRequest(String id){
		try {
            PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM requests where request_id=?");
            // Parameters start with 1
            preparedStatement.setString(1, id);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
	}

}
