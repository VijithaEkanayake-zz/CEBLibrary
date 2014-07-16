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

import com.vijitha.dao.BookIssueDao;
import com.vijitha.dao.BookRequestDao;
import com.vijitha.model.BookIssues;
import com.vijitha.model.BookRequest;

/**
 * Servlet implementation class BookRequestController
 */
@WebServlet("/BookRequestController")
public class BookRequestController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static String VIEW_REQUEST = "/bookrequestdetails.jsp";
	private static String VIEW_ALL_REQUEST = "/allbookrequestdetails.jsp";
	private static String LIST_ISSUES = "/listissuedbooks.jsp";
	
	private BookRequestDao bookRequestDao;
	private BookIssueDao bookIssueDao;
	
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BookRequestController() {
        super();
        bookRequestDao = new BookRequestDao();
        bookIssueDao = new BookIssueDao();
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
		
		BookRequest bookRequest = new BookRequest();
		String forward="";
    	String action=request.getParameter("action");
    	HttpSession session = request.getSession(true);
    	String userLevel = session.getAttribute("userLevel").toString();
    	request.setAttribute("userLevel", userLevel);
    	if(action.equalsIgnoreCase("viewrequest")){
    		forward=VIEW_REQUEST;
    		bookRequest.setBookId(request.getParameter("bookId"));
    		
    		String username = session.getAttribute("pfNo").toString();
    		bookRequest.setMemberId(username);
    		
    		SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd");
    		
    		try {
    			String dors = formatter.format(new java.util.Date());
    			Date dor = formatter.parse(dors);
    			bookRequest.setReqDate(dor);
    		} catch (ParseException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}
    		bookRequestDao.requestBook(bookRequest);
    		request.setAttribute("bookrequests", bookRequestDao.getRequestesBooks(username));
    		
    	}else if (action.equalsIgnoreCase("listrequestbooks")) {
			forward=VIEW_ALL_REQUEST;
			request.setAttribute("allbookrequests", bookRequestDao.getAllRequestesBooks());
		}else if (action.equalsIgnoreCase("issue")) {
			forward=LIST_ISSUES;
			String requestId=request.getParameter("requestId");
			bookRequest = bookRequestDao.getBookRequestById(requestId);
			BookIssues bookIssue = new BookIssues();
			System.out.println("acc_no"+bookRequest.getBookId());
	    	bookIssue.setAccNo(bookRequest.getBookId());
			bookIssue.setMemberId(bookRequest.getMemberId());
			
			SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd");
    		
    		try {
    			String dois = formatter.format(new java.util.Date());
    			Date doi = formatter.parse(dois);
    			bookIssue.setIssuedDate(doi);
    		} catch (ParseException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}
    		
    		SimpleDateFormat formatter2= new SimpleDateFormat("yyyy-MM-dd");
    		try {
    			Date dor = formatter2.parse((String) session.getAttribute("returnDate"));
    			bookIssue.setLegalReturnDate(dor);
    		} catch (ParseException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}
    		
    		String username = session.getAttribute("username").toString();
			bookIssue.setIssuer(username);		
			bookIssueDao.issueRequestedBook(bookIssue);
			request.setAttribute("bookissues", bookIssueDao.getAllIssuedBooks());
			bookRequestDao.deleteRequest(requestId);
		}else if (action.equalsIgnoreCase("reject")) {
			forward=VIEW_ALL_REQUEST;
			String requestId=request.getParameter("requestId");
			bookRequest = bookRequestDao.getBookRequestById(requestId);
			bookRequestDao.updateRequestAvailableCopies(bookRequest);
			bookRequestDao.deleteRequest(requestId);
			request.setAttribute("allbookrequests", bookRequestDao.getAllRequestesBooks());
		}
		
		
		
		RequestDispatcher view = request.getRequestDispatcher(forward);
        view.forward(request, response);
	}

}
