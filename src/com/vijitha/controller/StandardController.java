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

import com.vijitha.dao.StandardDao;
import com.vijitha.model.Standards;

/**
 * @author Vijitha
 *
 */
public class StandardController extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static String INSERT_OR_EDIT = "admin/Standard.jsp";
    private static String LIST_STANDARD = "/liststandards.jsp";
    private static String VIEW_STANDARD = "/viewstandardsdetails.jsp";
    
    
    private StandardDao dao;
    
    public StandardController(){
    	super();
    	dao= new StandardDao();
    }
    
    protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
    	String forward="";
    	String action=request.getParameter("action");
    	HttpSession session = request.getSession(true);
    	String userLevel = session.getAttribute("userLevel").toString();
    	request.setAttribute("userLevel", userLevel);
    	if(action.equalsIgnoreCase("delete")){
    		String standardId=request.getParameter("standardId");
    		dao.deleteStandard(standardId);
    		forward = LIST_STANDARD;
    		request.setAttribute("standards", dao.getAllStandards());
    	}else if (action.equalsIgnoreCase("edit")) {
			forward=INSERT_OR_EDIT;
			String standardId=request.getParameter("standardId");
			Standards standard=dao.getStandardById(standardId);
			request.setAttribute("standard", standard);
		}else if (action.equalsIgnoreCase("viewstandard")) {
			forward=VIEW_STANDARD;
			String standardId=request.getParameter("standardId");
			Standards standard=dao.getStandardById(standardId);
			//System.out.println("description is : "+standard.getDescription());
			//int available_copies=dao.getAvailableCopies(standard);
			request.setAttribute("standards", standard);
			//request.setAttribute("available_copies", available_copies);
		}else if (action.equalsIgnoreCase("liststandards")) {
			forward=LIST_STANDARD;
			request.setAttribute("standards", dao.getAllStandards());		
		}else {
			forward=INSERT_OR_EDIT;
		}
    	
    	RequestDispatcher view=request.getRequestDispatcher(forward);
    	view.forward(request,response);
    }
    
    protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
    	Standards standard = new Standards();
    	standard.setRefNo(request.getParameter("refNo"));
    	standard.setType(request.getParameter("type"));
    	standard.setEdition(Integer.parseInt(request.getParameter("edition")));
    	standard.setAmendment(request.getParameter("amendment"));
    	standard.setDescription(request.getParameter("description"));
    	standard.setYearOfAmended(request.getParameter("yop"));
    	standard.setYearOfPublished(request.getParameter("yoa"));
    	standard.setEnteredBy(request.getParameter("enteredby"));
    	standard.setLocation(request.getParameter("location"));
    	standard.setKeywords(request.getParameter("keywords"));
		
		
		SimpleDateFormat formatter1= new SimpleDateFormat("yyyy-MM-dd");
		
		try {
			
			String does = formatter1.format(new java.util.Date());
			Date doe = formatter1.parse(does);
			standard.setEnteredDate(doe);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		dao.checkStandard(standard);
		HttpSession session = request.getSession(true);
    	String userLevel = session.getAttribute("userLevel").toString();
		RequestDispatcher view = request.getRequestDispatcher(LIST_STANDARD);
		request.setAttribute("userLevel", userLevel);
        request.setAttribute("standards", dao.getAllStandards());
        view.forward(request, response);
		
    }


}
