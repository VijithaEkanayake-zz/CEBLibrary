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
import javax.servlet.http.HttpSession;

import com.vijitha.dao.StandardDao;

/**
 * @author Vijitha
 *
 */
public class StandardSearchController extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private StandardDao dao;
	
	public StandardSearchController(){
		super();
		dao = new StandardDao();
	}
	
	
	protected void doPost(HttpServletRequest request,HttpServletResponse response){
		//Book book=new Book();
		System.out.println("search:::::::::::::");
		String name=request.getParameter("search_text");
		String criteria=request.getParameter("criteria");
		System.out.println(name+"+++++++++"+criteria);		
		HttpSession session = request.getSession(true);
    	String userLevel = session.getAttribute("userLevel").toString();
    	request.setAttribute("userLevel", userLevel);
		
		try {
			RequestDispatcher view=request.getRequestDispatcher("/searchstandardsresult.jsp");
			request.setAttribute("standards", dao.getSearchedStandards(name, criteria));
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
