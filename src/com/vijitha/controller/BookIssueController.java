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

import com.vijitha.dao.BookIssueDao;
import com.vijitha.model.BookIssues;

/**
 * Servlet implementation class BookIssueController
 */
@WebServlet("/BookIssueController")
public class BookIssueController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static String INSERT = "/issuebook.jsp";
	private static String LIST_ISSUES = "/listissuedbooks.jsp";
	
	
	private BookIssueDao dao;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BookIssueController() {
        super();
        dao = new BookIssueDao();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String forward="";
    	String action=request.getParameter("action");
    	
    	if(action.equalsIgnoreCase("delete")){
    		String bookId=request.getParameter("bookId");
    		dao.removeBookIssue(bookId);
    		forward = LIST_ISSUES;
    		request.setAttribute("bookissues", dao.getAllIssuedBooks());
		}else if (action.equalsIgnoreCase("listBooks")) {
			forward=LIST_ISSUES;
			request.setAttribute("books", dao.getAllIssuedBooks());		
		}else {
			forward=INSERT;
		}
    	
    	RequestDispatcher view=request.getRequestDispatcher(forward);
    	view.forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		BookIssues bookIssue = new BookIssues();
    	bookIssue.setAccNo(request.getParameter("acc_no"));
		bookIssue.setMemberId(request.getParameter("member_id"));
		
		SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd");
		
		try {
			Date doi = formatter.parse(request.getParameter("doi"));
			bookIssue.setIssuedDate(doi);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		bookIssue.setIssuer(request.getParameter("issuer"));		
		dao.issueBook(bookIssue);
		RequestDispatcher view = request.getRequestDispatcher(LIST_ISSUES);
        request.setAttribute("bookissues", dao.getAllIssuedBooks());
        view.forward(request, response);
	}

}
