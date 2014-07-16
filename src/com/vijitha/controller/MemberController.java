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
import javax.servlet.http.HttpSession;

import com.vijitha.dao.MemberDao;
import com.vijitha.model.Member;

/**
 * @author Vijitha
 *
 */
public class MemberController extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static String INSERT_OR_EDIT = "/Member.jsp";
    private static String LIST_MEMBER = "/listmember.jsp";
    private static String VIEW_MEMBER = "/individualmemberdetails.jsp";
    private static String VIEW_MEMBER_PF = "/memberpf.jsp";
    
    
    private MemberDao dao;
    
    
    public MemberController(){
    	super();
    	dao=new MemberDao();
    }
    
    protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
    	
    	String forward="";
    	String action=request.getParameter("action");
    	HttpSession session = request.getSession(true);
    	String userLevel = session.getAttribute("userLevel").toString();
    	request.setAttribute("userLevel", userLevel);
    	if(action.equalsIgnoreCase("delete")){
    		String memberId=request.getParameter("memberId");
    		dao.deleteMember(memberId);
    		forward = LIST_MEMBER;
    		request.setAttribute("members", dao.getAllMembers());
    	}else if (action.equalsIgnoreCase("edit")) {
			forward=INSERT_OR_EDIT;
			String memberId=request.getParameter("memberId");
			Member member=dao.getMemberById(memberId);
			request.setAttribute("member", member);
		}else if (action.equalsIgnoreCase("view")) {
			forward=VIEW_MEMBER;
			String memberId=request.getParameter("memberId");
			Member member=dao.getMemberById(memberId);
			request.setAttribute("member", member);
		}else if (action.equalsIgnoreCase("viewpf")) {
			forward=VIEW_MEMBER_PF;
			String email=request.getParameter("email");
			Member member=dao.getMemberById(email);
			request.setAttribute("member", member);
		}else if (action.equalsIgnoreCase("listMember")) {
			forward=LIST_MEMBER;
			request.setAttribute("members", dao.getAllMembers());		
		}else {
			forward=INSERT_OR_EDIT;
		}
    	
    	RequestDispatcher view=request.getRequestDispatcher(forward);
    	view.forward(request,response);
    	
    }
    
    
    protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
    	HttpSession session = request.getSession(true);
    	String userLevel = session.getAttribute("userLevel").toString();
    	request.setAttribute("userLevel", userLevel);
    	Member member = new Member();
    	member.setId(request.getParameter("id"));
		member.setPfNo(request.getParameter("pf_no"));
		member.setName(request.getParameter("name"));
		member.setDesignation(request.getParameter("designation"));
		member.setBranch(request.getParameter("branch"));
		member.setOfficeAddr(request.getParameter("officeAddr"));
		member.setHomeAddr(request.getParameter("homeAddr"));
		member.setContactNo(request.getParameter("contactNo"));
		member.setEmail(request.getParameter("email"));
		/*
		SimpleDateFormat formatter1= new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat formatter2 = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat formatter3 = new SimpleDateFormat("yyyy-MM-dd");
		
		try {
			Date doj = formatter1.parse(request.getParameter("doj"));
			member.setDoj(doj);
			Date doa = formatter2.parse(request.getParameter("doa"));
			member.setDoa(doa);
			Date dob = formatter3.parse(request.getParameter("dob"));
			member.setDob(dob);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		member.setCivilStatus(request.getParameter("civilStatus"));
		member.setGender(request.getParameter("gender"));
		member.setProf_qualification(request.getParameter("prof_qualifications"));
		
		*/
		member.setUserLevel("member");
		member.setPassword(request.getParameter("password"));
    	
		dao.checkMember(member);
		RequestDispatcher view = request.getRequestDispatcher(LIST_MEMBER);
        request.setAttribute("members", dao.getAllMembers());
        view.forward(request, response);
		
    }
    
    
    

}
