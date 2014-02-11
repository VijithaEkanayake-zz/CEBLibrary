/**
 * 
 */
package com.vijitha.dao;


import java.sql.Connection;

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

}
