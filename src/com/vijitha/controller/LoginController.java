/**
 * 
 */
package com.vijitha.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.vijitha.dao.MemberDao;
import com.vijitha.model.Member;
import com.vijitha.util.FineCalculator;

/**
 * @author Vijitha
 *
 */
public class LoginController extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private MemberDao dao;
	
	
	
	public LoginController(){
		super();
		dao= new MemberDao();
	}
	
	public void doGet(HttpServletRequest request,HttpServletResponse response){
		
		
	}
	
	public void doPost(HttpServletRequest request,HttpServletResponse response){
		Member member = new Member();
		String submittedPfNo=request.getParameter("username");
		member.setPfNo(submittedPfNo);
		member.setPassword(request.getParameter("password"));
		String returnDate = new FineCalculator().calculateReturnDate();
		member = dao.login(member);	
		try{
			if(member!=null){
			if(((member.getPfNo()).equals(submittedPfNo)) && ((member.getUserLevel()).equals("admin"))){
				HttpSession session=request.getSession(true);
				session.setAttribute( "username", member.getName());
				session.setAttribute("userLevel", member.getUserLevel());
				session.setAttribute("name", member.getName());
				session.setAttribute("pfNo", member.getPfNo());
				session.setAttribute("returnDate", returnDate);
				request.setAttribute("userLevel", member.getUserLevel());
				RequestDispatcher view=request.getRequestDispatcher("admin/home.jsp");
		    	view.forward(request,response);
				//response.sendRedirect("home.jsp"); //logged-in page 
		    	
			}else if(((member.getPfNo()).equals(submittedPfNo)) && ((member.getUserLevel()).equals("member"))){
				HttpSession session=request.getSession(true);
				session.setAttribute( "username", member.getName());
				session.setAttribute("userLevel", member.getUserLevel());
				session.setAttribute("name", member.getName());
				session.setAttribute("pfNo", member.getPfNo());
				request.setAttribute("userLevel", member.getUserLevel());
				RequestDispatcher view=request.getRequestDispatcher("home.jsp");
		    	view.forward(request,response);
			}
			
			}else{
				RequestDispatcher view=request.getRequestDispatcher("invalidLogin.jsp");
		    	view.forward(request,response);
				//response.sendRedirect("invalidLogin.jsp"); //error page 
			}
		}catch(Exception e){
			e.printStackTrace();
			System.out.println(e); 
		}
	}
	

}
