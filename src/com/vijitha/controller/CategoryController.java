package com.vijitha.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class CategoryController
 */
public class CategoryController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CategoryController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String selection=request.getParameter("selection");
		HttpSession session = request.getSession(true);
    	String userLevel = session.getAttribute("userLevel").toString();
    	request.setAttribute("userLevel", userLevel);
    	RequestDispatcher view = null;
		switch (selection) {
		case "b":
			
			view=request.getRequestDispatcher("/books.jsp");
			
			
			break;
		case "s":
			view=request.getRequestDispatcher("/standards.jsp");
			break;
			
		case "p":
			view=request.getRequestDispatcher("/periodicals.jsp");
			break;
			
		case "r":
			view=request.getRequestDispatcher("/reports.jsp");
			break;
			
		case "t":
			view=request.getRequestDispatcher("/thesis.jsp");
			break;
		
		default:
			break;
		}
		
		view.forward(request, response);
	}

}
