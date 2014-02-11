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
    
    
    private BookDao dao;
    
    public BookController(){
    	super();
    	dao= new BookDao();
    }
    
    protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
    	String forward="";
    	String action=request.getParameter("action");
    	
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
		book.setAuthor(request.getParameter("author"));
		book.setClassNo(request.getParameter("classno"));
		book.setRackNo(request.getParameter("rackno"));
		book.setNoofBooks(Integer.parseInt(request.getParameter("count")));
		
		SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd");
		
		try {
			Date doa = formatter.parse(request.getParameter("doa"));
			book.setDateofArrival(doa);
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
		book.setHeadingIdentifier(request.getParameter("identifier"));
		book.setTypeofMaterial(request.getParameter("tmaterial"));
    	
		dao.checkBook(book);
		RequestDispatcher view = request.getRequestDispatcher(LIST_BOOK);
        request.setAttribute("books", dao.getAllBooks());
        view.forward(request, response);
		
    }


}
