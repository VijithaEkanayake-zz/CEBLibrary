/**
 * 
 */
package com.vijitha.controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.vijitha.dao.BookDao;
import com.vijitha.model.Book;

/**
 * @author Vijitha
 *
 */
public class BookController extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static String INSERT_OR_EDIT = "/admin/AddBook.jsp";
    private static String LIST_BOOK = "/listbooks.jsp";
    private static String VIEW_BOOK = "/viewbookdetails.jsp";
    
    
    private BookDao dao;
    
    public BookController(){
    	super();
    	dao= new BookDao();
    }
    
    protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
    	String forward="";
    	String action=request.getParameter("action");
    	HttpSession session = request.getSession(true);
    	String userLevel = session.getAttribute("userLevel").toString();
    	request.setAttribute("userLevel", userLevel);
    	if(action.equalsIgnoreCase("delete")){
    		String bookId=request.getParameter("bookId");
    		dao.deleteBook(bookId);
    		forward = LIST_BOOK;
    		request.setAttribute("books", dao.getAllBooks());
    	}else if (action.equalsIgnoreCase("edit")) {
			forward=INSERT_OR_EDIT;
			String bookId=request.getParameter("bookId");
			Book book=dao.getBookById(bookId);
			request.setAttribute("book", book);
		}else if (action.equalsIgnoreCase("viewbook")) {
			forward=VIEW_BOOK;
			String bookId=request.getParameter("bookId");
			Book book=dao.getBookById(bookId);
			int available_copies=dao.getAvailableCopies(book);
			request.setAttribute("book", book);
			request.setAttribute("available_copies", available_copies);
		}else if (action.equalsIgnoreCase("listBooks")) {
			forward=LIST_BOOK;
			request.setAttribute("books", dao.getAllBooks());		
		}else {
			forward=INSERT_OR_EDIT;
		}
    	
    	RequestDispatcher view=request.getRequestDispatcher(forward);
    	view.forward(request,response);
    }
    
    protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
    	Book book = new Book();
    	book.setId(request.getParameter("id"));
		book.setTitle(request.getParameter("title"));
		book.setIsbn(request.getParameter("isbn"));
		book.setAuthor1(request.getParameter("author1"));
		book.setAuthor2(request.getParameter("author2"));
		book.setAuthor3(request.getParameter("author3"));
		book.setAuthor4(request.getParameter("author4"));
		book.setCorporateBody1(request.getParameter("cbody1"));
		book.setCorporateBody2(request.getParameter("cbody2"));
		book.setCorporateBody3(request.getParameter("cbody3"));
		book.setCorporateBody4(request.getParameter("cbody4"));
		book.setYearofPublication(Integer.parseInt(request.getParameter("yop")));
		book.setSeries(request.getParameter("series"));
		book.setClassNo(request.getParameter("classno"));
		book.setRackNo(request.getParameter("rackno"));
		book.setNoofBooks(Integer.parseInt(request.getParameter("count")));
		
		SimpleDateFormat formatter1= new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat formatter2 = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date doa = formatter1.parse(request.getParameter("doa"));
			book.setDateofArrival(doa);
			String does = formatter2.format(new java.util.Date());
			Date doe = formatter2.parse(does);
			book.setEnteredDate(doe);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		book.setPublisher(request.getParameter("publisher"));		
		book.setEdition(Integer.parseInt(request.getParameter("edition")));
		book.setDescription(request.getParameter("description"));
		book.setKeywords(request.getParameter("keywords"));
		book.setRecordType("recordtype");
		book.setBibliographicLevel(request.getParameter("blevel"));
		book.setHeading(request.getParameter("heading"));
		book.setHeadingIdentifier(request.getParameter("identifier"));
		book.setTypeofMaterial(request.getParameter("tmaterial"));
		book.setAbstractofBook(request.getParameter("abstractofBook"));
		book.setBroadHeading(request.getParameter("bheading"));
		book.setGeoCode(request.getParameter("geocode"));
		book.setEnteredBy(request.getParameter("enteredby"));
		book.setNotes(request.getParameter("notes"));
    	
		dao.checkBook(book);
		HttpSession session = request.getSession(true);
    	String userLevel = session.getAttribute("userLevel").toString();
		RequestDispatcher view = request.getRequestDispatcher(LIST_BOOK);
		request.setAttribute("userLevel", userLevel);
        request.setAttribute("books", dao.getAllBooks());
        view.forward(request, response);
		
    }


}
