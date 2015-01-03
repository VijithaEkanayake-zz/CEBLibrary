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
	private String query = null;
	
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
			PreparedStatement ps=connection.prepareStatement("INSERT INTO book (acc_no,title,isbn,author1,author2,author3,author4,corporate_body1,corporate_body2,corporate_body3,corporate_body4,year_of_publication,series,class_no,rack_no,no_of_books,date_of_arrival,publisher,edition,description,keywords,record_type,bibliographic_level,heading_identifier,heading,type_of_material,abstract,broad_heading,geo_code,entered_by,entered_date,notes) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);");
			ps.setString(1, book.getId());
			ps.setString(2, book.getTitle());
			ps.setString(3, book.getIsbn());
			ps.setString(4, book.getAuthor1());
			ps.setString(5, book.getAuthor2());
			ps.setString(6, book.getAuthor3());
			ps.setString(7, book.getAuthor4());
			ps.setString(8, book.getCorporateBody1());
			ps.setString(9, book.getCorporateBody2());
			ps.setString(10, book.getCorporateBody3());
			ps.setString(11, book.getCorporateBody4());
			ps.setInt(12, book.getYearofPublication());
			ps.setString(13, book.getSeries());
			ps.setString(14, book.getClassNo());
			ps.setString(15, book.getRackNo());
			ps.setInt(16, book.getNoofBooks());
			ps.setDate(17, new java.sql.Date(book.getDateofArrival().getTime()));
			ps.setString(18, book.getPublisher());
			ps.setInt(19, book.getEdition());
			ps.setString(20,book.getDescription());
			ps.setString(21, book.getKeywords());
			ps.setString(22, book.getRecordType());
			ps.setString(23, book.getBibliographicLevel());
			ps.setString(24, book.getHeadingIdentifier());
			ps.setString(25, book.getHeading());
			ps.setString(26, book.getTypeofMaterial());
			ps.setString(27, book.getAbstractofBook());
			ps.setString(28, book.getBroadHeading());
			ps.setString(29, book.getGeoCode());
			ps.setString(30, book.getEnteredBy());
			ps.setDate(31, new java.sql.Date(book.getEnteredDate().getTime()));
			ps.setString(32, book.getNotes());
			ps.executeUpdate();
			initializeBookCopies(book);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//TODO implement book update function
	public void updateBook(Book book){
		try {
			PreparedStatement ps=connection.prepareStatement("UPDATE book SET acc_no=?,title=?,isbn=?,author1=?,author2=?,author3=?,author4=?,corporate_body1=?,corporate_body2=?,corporate_body3=?,corporate_body4=?,year_of_publication=?,series=?,class_no=?,rack_no=?,no_of_books=?,date_of_arrival=?,publisher=?,edition=?,description=?,keywords=?,record_type=?,bibliographic_level=?,heading_identifier=?,heading,type_of_material=?,abstract=?,broad_heading=?,geo_code=?,entered_by=?,entered_date=?,notes=? ;");
			ps.setString(1, book.getId());
			ps.setString(2, book.getTitle());
			ps.setString(3, book.getIsbn());
			ps.setString(4, book.getAuthor1());
			ps.setString(5, book.getAuthor2());
			ps.setString(6, book.getAuthor3());
			ps.setString(7, book.getAuthor4());
			ps.setString(8, book.getCorporateBody1());
			ps.setString(9, book.getCorporateBody2());
			ps.setString(10, book.getCorporateBody3());
			ps.setString(11, book.getCorporateBody4());
			ps.setInt(12, book.getYearofPublication());
			ps.setString(13, book.getSeries());
			ps.setString(14, book.getClassNo());
			ps.setString(15, book.getRackNo());
			ps.setInt(16, book.getNoofBooks());
			ps.setDate(17, new java.sql.Date(book.getDateofArrival().getTime()));
			ps.setString(18, book.getPublisher());
			ps.setInt(19, book.getEdition());
			ps.setString(20,book.getDescription());
			ps.setString(21, book.getKeywords());
			ps.setString(22, book.getRecordType());
			ps.setString(23, book.getBibliographicLevel());
			ps.setString(24, book.getHeadingIdentifier());
			ps.setString(25, book.getHeading());
			ps.setString(26, book.getTypeofMaterial());
			ps.setString(27, book.getAbstractofBook());
			ps.setString(28, book.getBroadHeading());
			ps.setString(29, book.getGeoCode());
			ps.setString(30, book.getEnteredBy());
			ps.setDate(31, new java.sql.Date(book.getEnteredDate().getTime()));
			ps.setString(32, book.getNotes());
			ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//TODO
	public void deleteBook(String id){
		try {
            PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM standards where ref_no=?");
            // Parameters start with 1
            preparedStatement.setString(1, id);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
	}
	
	
	public List<Book> getAllBooks(){
		List<Book> books=new ArrayList<Book>();
		
		
		try {
			Statement st = connection.createStatement();
			ResultSet rs=st.executeQuery("SELECT * FROM book");
			while(rs.next()){
				Book book=new Book();
				book.setId(rs.getString("acc_no"));
				book.setHeading(rs.getString("heading"));
				book.setTitle(rs.getString("title"));
				book.setIsbn(rs.getString("isbn"));
				book.setAuthor1(rs.getString("author1"));
				book.setAuthor2(rs.getString("author2"));
				book.setAuthor3(rs.getString("author3"));
				book.setAuthor4(rs.getString("author4"));
				book.setCorporateBody1(rs.getString("corporate_body1"));
				book.setCorporateBody2(rs.getString("corporate_body2"));
				book.setCorporateBody3(rs.getString("corporate_body3"));
				book.setCorporateBody4(rs.getString("corporate_body4"));
				book.setYearofPublication(rs.getInt("year_of_publication"));
				book.setSeries(rs.getString("series"));
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
				book.setAbstractofBook(rs.getString("abstract"));
				book.setBroadHeading(rs.getString("broad_heading"));
				book.setGeoCode(rs.getString("geo_code"));
				book.setEnteredBy(rs.getString("entered_by"));
				book.setEnteredDate(rs.getDate("entered_date"));
				book.setNotes(rs.getString("notes"));
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
			PreparedStatement ps=connection.prepareStatement("SELECT * FROM book WHERE acc_no = ?");
			ps.setString(1, bookId);
			ResultSet rs=ps.executeQuery();
			
			if(rs.next()){
				book.setId(rs.getString("acc_no"));
				book.setHeading(rs.getString("heading"));
				book.setTitle(rs.getString("title"));
				book.setIsbn(rs.getString("isbn"));
				book.setAuthor1(rs.getString("author1"));
				book.setAuthor2(rs.getString("author2"));
				book.setAuthor3(rs.getString("author3"));
				book.setAuthor4(rs.getString("author4"));
				book.setCorporateBody1(rs.getString("corporate_body1"));
				book.setCorporateBody2(rs.getString("corporate_body2"));
				book.setCorporateBody3(rs.getString("corporate_body3"));
				book.setCorporateBody4(rs.getString("corporate_body4"));
				book.setYearofPublication(rs.getInt("year_of_publication"));
				book.setSeries(rs.getString("series"));
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
				book.setAbstractofBook(rs.getString("abstract"));
				book.setBroadHeading(rs.getString("broad_heading"));
				book.setGeoCode(rs.getString("geo_code"));
				book.setEnteredBy(rs.getString("entered_by"));
				book.setEnteredDate(rs.getDate("entered_date"));
				book.setNotes(rs.getString("notes"));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return book;
	}
	
	public List<Book> getSearchedBooks(String name,String criteria){
		List<Book> books=new ArrayList<>();
		System.out.println("+++++++++++++++++test++++++++++");
		
		if(name.equals("") ){
			System.out.println("+++++++++++++++++test2++++++++++");
			query="SELECT * FROM book";
		}else {
			switch (criteria) {
			case "title":
				query="SELECT * FROM book WHERE title LIKE '%"+name+"%' ";
				break;
			case "isbn":
				query="SELECT * FROM book WHERE isbn LIKE '%"+name+"%' ";
				break;
			case "author":
				query="SELECT * FROM book WHERE author1 LIKE '%"+name+"%' OR author2 LIKE '%"+name+"%' OR author3 LIKE '%"+name+"%' OR author4 LIKE '%"+name+"%'";
				break;
				
			case "keyword":
				query="SELECT * FROM book WHERE keywords LIKE '%"+name+"%' ";
				break;

			default:
				break;
			}
		}
			System.out.println(query);
			try {
				Statement st=connection.createStatement();
				ResultSet rs=st.executeQuery(query);
				
				while(rs.next()){
					Book book=new Book();
					book.setId(rs.getString("acc_no"));
					book.setHeading(rs.getString("heading"));
					book.setTitle(rs.getString("title"));
					book.setIsbn(rs.getString("isbn"));
					book.setAuthor1(rs.getString("author1"));
					book.setAuthor2(rs.getString("author2"));
					book.setAuthor3(rs.getString("author3"));
					book.setAuthor4(rs.getString("author4"));
					book.setCorporateBody1(rs.getString("corporate_body1"));
					book.setCorporateBody2(rs.getString("corporate_body2"));
					book.setCorporateBody3(rs.getString("corporate_body3"));
					book.setCorporateBody4(rs.getString("corporate_body4"));
					book.setYearofPublication(rs.getInt("year_of_publication"));
					book.setSeries(rs.getString("series"));
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
					book.setAbstractofBook(rs.getString("abstract"));
					book.setBroadHeading(rs.getString("broad_heading"));
					book.setGeoCode(rs.getString("geo_code"));
					book.setEnteredBy(rs.getString("entered_by"));
					book.setEnteredDate(rs.getDate("entered_date"));
					book.setNotes(rs.getString("notes"));
					books.add(book);
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		return books;
	}
	
	public void initializeBookCopies(Book book){
		try {
			PreparedStatement ps=connection.prepareStatement("INSERT INTO book_copies_count (acc_no,total_copies,available_copies) VALUES(?,?,?);");
			ps.setString(1, book.getId());
			ps.setInt(2, book.getNoofBooks());
			ps.setInt(3, book.getNoofBooks());
			ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	}
	
	public int getAvailableCopies(Book book){
		int count=0;
		try {
			PreparedStatement ps=connection.prepareStatement("select available_copies from book_copies_count where acc_no = ? ");
			ps.setString(1, book.getId());
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
