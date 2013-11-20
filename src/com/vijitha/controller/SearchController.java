/**
 * 
 */
package com.vijitha.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.vijitha.dao.BookDao;

/**
 * @author Vijitha
 *
 */
public class SearchController extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private BookDao dao;
	
	public SearchController(){
		super();
		dao = new BookDao();
	}
	
	
	protected void doPost(HttpServletRequest request,HttpServletResponse response){
		//Book book=new Book();
		System.out.println("search:::::::::::::");
		String name=request.getParameter("search_text");
		String criteria=request.getParameter("criteria");
		System.out.println(name+"+++++++++"+criteria);		
		
		
		try {
			RequestDispatcher view=request.getRequestDispatcher("/listbooks.jsp");
			request.setAttribute("books", dao.getSearchedBooks(name, criteria));
			view.forward(request, response);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
