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

import com.vijitha.model.Book;
import com.vijitha.util.DbConnection;

/**
 * @author Vijitha
 *
 */
public class BookDao {
	
	
	private Connection connection;
	
	public BookDao(){
		try {
			connection=DbConnection.getConnection();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void checkBook(Book book){
		try {
			PreparedStatement ps=connection.prepareStatement("select acc_no from book where acc_no = ? ");
			ps.setString(1, book.getId());
			ResultSet rs=ps.executeQuery();
			
			if(rs.next()){
				updateBook(book);
			}else{
				addBook(book);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void addBook(Book book){
		try {
			PreparedStatement ps=connection.prepareStatement("INSERT INTO book (acc_no,title,isbn,author,class_no,rack_no,no_of_books,date_of_arrival,publisher,edition,description,keywords,record_type,bibliographic_level,heading_identifier,type_of_material) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);");
			ps.setString(1, book.getId());
			ps.setString(2, book.getTitle());
			ps.setString(3, book.getIsbn());
			ps.setString(4, book.getAuthor());
			ps.setString(5, book.getClassNo());
			ps.setString(6, book.getRackNo());
			ps.setInt(7, book.getNoofBooks());
			ps.setDate(8, new java.sql.Date(book.getDateofArrival().getTime()));
			ps.setString(9, book.getPublisher());
			ps.setInt(10, book.getEdition());
			ps.setString(11,book.getDescription());
			ps.setString(12, book.getKeywords());
			ps.setString(13, book.getRecordType());
			ps.setString(14, book.getBibliographicLevel());
			ps.setString(15, book.getHeadingIdentifier());
			ps.setString(16, book.getTypeofMaterial());
			ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//TODO implement book update function
	public void updateBook(Book book){
		
	}
	
	//TODO
	public void deleteBook(String id){
		
	}
	
	
	public List<Book> getAllBooks(){
		List<Book> books=new ArrayList<Book>();
		
		
		try {
			Statement st = connection.createStatement();
			ResultSet rs=st.executeQuery("SELECT * FROM book");
			while(rs.next()){
				Book book=new Book();
				book.setId(rs.getString("acc_no"));
				book.setTitle(rs.getString("title"));
				book.setIsbn(rs.getString("isbn"));
				book.setAuthor(rs.getString("author"));
				book.setClassNo(rs.getString("class_no"));
				book.setRackNo(rs.getString("rack_no"));
				book.setNoofBooks((rs.getInt("no_of_books")));
				book.setDateofArrival(rs.getDate("date_of_arrival"));
				book.setPublisher(rs.getString("publisher"));
				book.setEdition(rs.getInt("edition"));
				book.setDescription(rs.getString("description"));
				book.setKeywords(rs.getString("keywords"));
				book.setRecordType(rs.getString("record_type"));
				book.setBibliographicLevel(rs.getString("bibliographic_level"));
				book.setHeadingIdentifier(rs.getString("heading_identifier"));
				book.setTypeofMaterial(rs.getString("type_of_material"));
				books.add(book);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	System.out.println(books.size() +"  ::::::::::::::::::");
		return books;
	}
	
	public Book getBookById(String bookId){
		Book book=new Book();
		
		try {
			PreparedStatement ps=connection.prepareStatement("SELECT * FROM book WHERE id = ?");
			ps.setString(1, bookId);
			ResultSet rs=ps.executeQuery();
			
			if(rs.next()){
				//TODO implement set book
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return book;
	}
	
	public List<Book> getSearchedBooks(String name,String criteria){
		List<Book> books=new ArrayList<>();
		if(name=="" ){
			this.getAllBooks();
		}else if(criteria=="title"){
			try {
				Statement st=connection.createStatement();
				ResultSet rs=st.executeQuery("SELECT * FROM book WHERE title LIKE '%%' ");
				
				while(rs.next()){
					Book book=new Book();
					book.setId(rs.getString("acc_no"));
					book.setTitle(rs.getString("title"));
					book.setIsbn(rs.getString("isbn"));
					book.setAuthor(rs.getString("author"));
					book.setClassNo(rs.getString("class_no"));
					book.setRackNo(rs.getString("rack_no"));
					book.setNoofBooks((rs.getInt("no_of_books")));
					book.setDateofArrival(rs.getDate("date_of_arrival"));
					book.setPublisher(rs.getString("publisher"));
					book.setEdition(rs.getInt("edition"));
					book.setDescription(rs.getString("description"));
					book.setKeywords(rs.getString("keywords"));
					book.setRecordType(rs.getString("record_type"));
					book.setBibliographicLevel(rs.getString("bibliographic_level"));
					book.setHeadingIdentifier(rs.getString("heading_identifier"));
					book.setTypeofMaterial(rs.getString("type_of_material"));
					books.add(book);
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return books;
	}
	

}
