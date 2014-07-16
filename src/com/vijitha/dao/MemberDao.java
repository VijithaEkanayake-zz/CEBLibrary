/**
 * 
 */
package com.vijitha.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.vijitha.model.Member;
import com.vijitha.util.DbConnection;

/**
 * @author Vijitha
 *
 */
public class MemberDao {
	
	private Connection connection;
	
	public MemberDao(){
		try {
			connection=DbConnection.getConnection();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void checkMember(Member member){
		try {
			PreparedStatement ps=connection.prepareStatement("select member_id from member where member_id = ? ");
			ps.setString(1, member.getId());
			ResultSet rs=ps.executeQuery();
			
			if(rs.next()){
				updateMember(member);
			}else{
				addMember(member);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void addMember(Member member){
		try {
			PreparedStatement ps=connection.prepareStatement("INSERT INTO member (member_id,pf_no,name,designation,branch,off_addr,private_addr,contact_no,email,user_level,password) VALUES(?,?,?,?,?,?,?,?,?,?,?);");
			ps.setString(1, member.getId());
			ps.setString(2, member.getPfNo());
			ps.setString(3, member.getName());
			ps.setString(4, member.getDesignation());
			ps.setString(5, member.getBranch());
			ps.setString(6, member.getOfficeAddr());
			ps.setString(7, member.getHomeAddr());
			ps.setString(8, member.getContactNo());
			ps.setString(9, member.getEmail());
			ps.setString(10, member.getUserLevel());
			ps.setString(11, member.getPassword());
			ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//TODO implement member update function
	public void updateMember(Member member){
		try {
			PreparedStatement ps=connection.prepareStatement("UPDATE member SET member_id=?,pf_no=?,name=?,designation=?,branch=?,off_addr=?,private_addr=?,contact_no=?,email=?,user_level=?,password=? WHERE member_id=? ");
			ps.setString(1, member.getId());
			ps.setString(2, member.getPfNo());
			ps.setString(3, member.getName());
			ps.setString(4, member.getDesignation());
			ps.setString(5, member.getBranch());
			ps.setString(6, member.getOfficeAddr());
			ps.setString(7, member.getHomeAddr());
			ps.setString(8, member.getContactNo());
			ps.setString(9, member.getEmail());
			ps.setString(10, member.getUserLevel());
			ps.setString(11, member.getPassword());
			ps.setString(12, member.getId());
			ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//TODO
	public void deleteMember(String id){
		 try {
	            PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM member where member_id=?");
	            // Parameters start with 1
	            preparedStatement.setString(1, id);
	            preparedStatement.executeUpdate();

	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	}
	
	public List<Member> getAllMembers(){
		List<Member> members=new ArrayList<Member>();
		
		
		try {
			Statement st = connection.createStatement();
			ResultSet rs=st.executeQuery("SELECT * FROM member");
			while(rs.next()){
				Member member=new Member();
				member.setId(rs.getString("member_id"));
				member.setPfNo(rs.getString("pf_no"));
				member.setName(rs.getString("name"));
				member.setDesignation(rs.getString("designation"));
				member.setBranch(rs.getString("branch"));
				member.setOfficeAddr(rs.getString("off_addr"));
				member.setHomeAddr(rs.getString("private_addr"));
				member.setContactNo(rs.getString("contact_no"));
				member.setEmail(rs.getString("email"));
				member.setUserLevel(rs.getString("user_level"));
				member.setPassword(rs.getString("password"));
				members.add(member);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	System.out.println(members.size() +"  ::::::::::::::::::");
		return members;
	}
	
	public Member getMemberById(String memberId){
		Member member=new Member();
		
		try {
			PreparedStatement ps=connection.prepareStatement("SELECT * FROM member WHERE member_id = ?");
			ps.setString(1, memberId);
			ResultSet rs=ps.executeQuery();
			
			if(rs.next()){
				member.setId(rs.getString("member_id"));
				member.setPfNo(rs.getString("pf_no"));
				member.setName(rs.getString("name"));
				member.setDesignation(rs.getString("designation"));
				member.setBranch(rs.getString("branch"));
				member.setOfficeAddr(rs.getString("off_addr"));
				member.setHomeAddr(rs.getString("private_addr"));
				member.setContactNo(rs.getString("contact_no"));
				member.setEmail(rs.getString("email"));
				member.setUserLevel(rs.getString("user_level"));
				member.setPassword(rs.getString("password"));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return member;
	}
	
	public Member getMemberPfNoByEmail(String email){
		Member member=new Member();
		
		try {
			PreparedStatement ps=connection.prepareStatement("SELECT * FROM member WHERE email = ?");
			ps.setString(1, email);
			ResultSet rs=ps.executeQuery();
			
			if(rs.next()){
				member.setId(rs.getString("member_id"));
				member.setPfNo(rs.getString("pf_no"));
				member.setName(rs.getString("name"));
				member.setDesignation(rs.getString("designation"));
				member.setBranch(rs.getString("branch"));
				member.setOfficeAddr(rs.getString("off_addr"));
				member.setHomeAddr(rs.getString("private_addr"));
				member.setContactNo(rs.getString("contact_no"));
				member.setEmail(rs.getString("email"));
				member.setUserLevel(rs.getString("user_level"));
				member.setPassword(rs.getString("password"));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return member;
	}
	
	public Member login(Member member){
		
		
		try {
			PreparedStatement ps=connection.prepareStatement("SELECT * FROM member WHERE pf_no= ? AND password = ?");
			ps.setString(1, member.getPfNo());
			ps.setString(2, member.getPassword());
			ResultSet rs=ps.executeQuery();
			
			
			if(rs.next()){
				member.setId(rs.getString("member_id"));
				member.setName(rs.getString("name"));
				member.setUserLevel(rs.getString("user_level"));
				member.setPfNo(rs.getString("pf_no"));
				
			}else{
				 System.out.println("Sorry, you are not a registered user! Please sign up first");
				 member=null;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return member;
	}
	
	

}
