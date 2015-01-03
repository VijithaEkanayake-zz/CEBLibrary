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
import com.vijitha.model.Standards;
import com.vijitha.util.DbConnection;

/**
 * @author Vijitha
 *
 */
public class StandardDao {
	
	
	private Connection connection;
	private String query = null;
	
	public StandardDao(){
		try {
			connection=DbConnection.getConnection();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void checkStandard(Standards standard){
		try {
			PreparedStatement ps=connection.prepareStatement("select ref_no from standards where ref_no = ? ");
			ps.setString(1, standard.getRefNo());
			ResultSet rs=ps.executeQuery();
			
			if(rs.next()){
				updateStandard(standard);
			}else{
				addStandard(standard);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void addStandard(Standards standard){
		try {
			PreparedStatement ps=connection.prepareStatement("INSERT INTO standards (ref_no,type,edition,amendment,description,year_of_published,year_of_amended,enter_by,date_entered,location,keywords) VALUES(?,?,?,?,?,?,?,?,?,?,?);");
			ps.setString(1, standard.getRefNo());
			ps.setString(2, standard.getType());
			ps.setInt(3, standard.getEdition());
			ps.setString(4, standard.getAmendment());
			ps.setString(5, standard.getDescription());
			ps.setString(6, standard.getYearOfPublished());
			ps.setString(7, standard.getYearOfAmended());
			ps.setString(8, standard.getEnteredBy());
			ps.setDate(9, new java.sql.Date(standard.getEnteredDate().getTime()));
			ps.setString(10, standard.getLocation());
			ps.setString(11, standard.getKeywords());
			ps.executeUpdate();
			//initializeBookCopies(standard);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//TODO implement book update function
	public void updateStandard(Standards standard){
		try {
			PreparedStatement ps=connection.prepareStatement("UPDATE standards SET standards (ref_no=?,type=?,edition=?,amendment=?,description=?,year_of_published=?,year_of_amended=?,enter_by=?,date_entered=?,location=?,keywords=?);");
			ps.setString(1, standard.getRefNo());
			ps.setString(2, standard.getType());
			ps.setInt(3, standard.getEdition());
			ps.setString(4, standard.getAmendment());
			ps.setString(5, standard.getDescription());
			ps.setString(6, standard.getYearOfPublished());
			ps.setString(7, standard.getYearOfAmended());
			ps.setString(8, standard.getEnteredBy());
			ps.setDate(9, new java.sql.Date(standard.getEnteredDate().getTime()));
			ps.setString(10, standard.getLocation());
			ps.setString(11, standard.getKeywords());
			ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//TODO
	public void deleteStandard(String id){
		try {
            PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM standards where ref_no=?");
            // Parameters start with 1
            preparedStatement.setString(1, id);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
	}
	
	
	public List<Standards> getAllStandards(){
		List<Standards> standards=new ArrayList<Standards>();
		
		
		try {
			Statement st = connection.createStatement();
			ResultSet rs=st.executeQuery("SELECT * FROM standards");
			while(rs.next()){
				Standards standard=new Standards();
				standard.setRefNo(rs.getString("ref_no"));
				standard.setType(rs.getString("type"));
				standard.setEdition(rs.getInt("edition"));
				standard.setAmendment(rs.getString("amendment"));
				standard.setDescription(rs.getString("description"));
				standard.setYearOfPublished(rs.getString("year_of_published"));
				standard.setYearOfAmended(rs.getString("year_of_amended"));
				standard.setEnteredBy(rs.getString("enter_by"));
				standard.setEnteredDate(rs.getDate("date_entered"));
				standard.setLocation(rs.getString("location"));
				standard.setKeywords(rs.getString("keywords"));
				standards.add(standard);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	System.out.println(standards.size() +"  ::::::::::::::::::");
		return standards;
	}
	
	public Standards getStandardById(String standardId){
		Standards standard=new Standards();
		
		try {
			PreparedStatement ps=connection.prepareStatement("SELECT * FROM standards WHERE ref_no = ?");
			ps.setString(1, standardId);
			ResultSet rs=ps.executeQuery();
			
			if(rs.next()){
				standard.setRefNo(rs.getString("ref_no"));
				standard.setType(rs.getString("type"));
				standard.setEdition(rs.getInt("edition"));
				standard.setAmendment(rs.getString("amendment"));
				standard.setDescription(rs.getString("description"));
				standard.setYearOfPublished(rs.getString("year_of_published"));
				standard.setYearOfAmended(rs.getString("year_of_amended"));
				standard.setEnteredBy(rs.getString("enter_by"));
				standard.setEnteredDate(rs.getDate("date_entered"));
				standard.setLocation(rs.getString("location"));
				standard.setKeywords(rs.getString("keywords"));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return standard;
	}
	
	public List<Standards> getSearchedStandards(String name,String criteria){
		List<Standards> standards=new ArrayList<>();
		System.out.println("+++++++++++++++++test++++++++++");
		
		if(name.equals("") ){
			System.out.println("+++++++++++++++++test2++++++++++");
			query="SELECT * FROM standards";
		}else {
			switch (criteria) {
			case "refno":
				query="SELECT * FROM standards WHERE ref_no LIKE '%"+name+"%' ";
				break;
			case "description":
				query="SELECT * FROM standards WHERE description LIKE '%"+name+"%' ";
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
					Standards standard=new Standards();
					standard.setRefNo(rs.getString("ref_no"));
					standard.setType(rs.getString("type"));
					standard.setEdition(rs.getInt("edition"));
					standard.setAmendment(rs.getString("amendment"));
					standard.setDescription(rs.getString("description"));
					standard.setYearOfPublished(rs.getString("year_of_published"));
					standard.setYearOfAmended(rs.getString("year_of_amended"));
					standard.setEnteredBy(rs.getString("enter_by"));
					standard.setEnteredDate(rs.getDate("date_entered"));
					standard.setLocation(rs.getString("location"));
					standard.setKeywords(rs.getString("keywords"));
					standards.add(standard);
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		return standards;
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
