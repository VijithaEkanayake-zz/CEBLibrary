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

import com.vijitha.dao.MemberDao;

/**
 * @author Vijitha
 *
 */
public class MemberpfController extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    private static String VIEW_MEMBER_PF = "/memberpf.jsp";
    
    
    private MemberDao dao;
    
    
    public MemberpfController(){
    	super();
    	dao=new MemberDao();
    }
    
    protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
    	
    }
    
    
    protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
    	String email = request.getParameter("email");
		RequestDispatcher view = request.getRequestDispatcher(VIEW_MEMBER_PF);
        request.setAttribute("member", dao.getMemberPfNoByEmail(email));
        view.forward(request, response);
		
    }
    
    
    

}
