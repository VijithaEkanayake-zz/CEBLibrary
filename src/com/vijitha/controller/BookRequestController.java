package com.vijitha.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.vijitha.dao.BookRequestDao;

/**
 * Servlet implementation class BookRequestController
 */
@WebServlet("/BookRequestController")
public class BookRequestController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	private BookRequestDao bookRequestDao;
	
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BookRequestController() {
        super();
        bookRequestDao = new BookRequestDao();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
