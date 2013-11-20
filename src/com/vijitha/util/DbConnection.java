/**
 * 
 */
package com.vijitha.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Vijitha
 *
 */
public class DbConnection {
	
	static Connection con;

	public static Connection getConnection() throws ClassNotFoundException{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ceb_olms","root","toor");
			return con;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Database.getConnection() Error -->" + e.getMessage());
            return null;
		}
		
	}
	
	public static void close(){
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Database.getConnection() Error -->" + e.getMessage());
		}
	}
	
}
