package com.vijitha.controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.vijitha.dao.BookReturnsDao;
import com.vijitha.model.BookReturns;

/**
 * Servlet implementation class BookReturnController
 */
@WebServlet("/BookReturnController")
public class BookReturnController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	//private static String INSERT = "/returnbook.jsp";
	private static String ADMIN_HOME = "/admin/home.jsp";
	
	
	private BookReturnsDao dao;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BookReturnController() {
        super();
        dao = new BookReturnsDao();
        
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
		HttpSession session = request.getSession(true);
    	String userLevel = session.getAttribute("userLevel").toString();
    	request.setAttribute("userLevel", userLevel);
		BookReturns bookReturns = new BookReturns();
    	bookReturns.setAccNo(request.getParameter("bookId"));
		bookReturns.setMemberId(request.getParameter("memberId"));
		bookReturns.setFine(Integer.parseInt(request.getParameter("amount")));
		java.text.DateFormat df = new java.text.SimpleDateFormat("yyyy-MM-dd");
		
		SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd");
		
		try {
			Date dor = formatter.parse(df.format(new java.util.Date()));
			bookReturns.setReturnedDate(dor);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		bookReturns.setReceiver(session.getAttribute("username").toString());		
		System.out.println("session name : "+session.getAttribute("username").toString());
		dao.returnBook(bookReturns);
		RequestDispatcher view = request.getRequestDispatcher(ADMIN_HOME);
        //request.setAttribute("bookissues", dao.getAllIssuedBooks());
        view.forward(request, response);
	}

}
