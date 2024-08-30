package com.customer;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AdminDBUtil {
	private static boolean isSucess;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
	
	public static boolean validate(String auserName,String apassword) {
		
		
		
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			
			String sql = "select* from admin where ausername = '"+auserName+"' and apassword = '"+apassword+"'";
			
			rs = stmt.executeQuery(sql);
			
			if(rs.next()) {
				isSucess = true;
			}
			else {
				isSucess = false;
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return isSucess;
		
	}
	
	
	public static List<Admin> getadmin(String auserName){
		
		ArrayList<Admin> admin = new ArrayList<>();
		
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			
			String sql = "select* from admin where ausername = '"+auserName+"'";
			
			rs = stmt.executeQuery(sql);
			
			//boolen method true 
			while(rs.next()) {
				int id = rs.getInt(1);
				String aname = rs.getString(2);
				String aemail = rs.getString(3);
				String aphone = rs.getString(4);
				String auserU = rs.getString(5);
				String apassU = rs.getString(6);
				
				
				
				Admin adm = new Admin(id,aname,aemail,aphone,auserU,apassU);
				admin.add(adm);
			}
			
		}
		
		catch(Exception e){
			
		}
		return admin;
	}
	

	
	public static boolean insertadmin(String aname,String aemail,String aphone,String ausername,String apassowrd) {
		
		boolean isSucess = false;
		
		//create db connection 
		
		
		
		try {
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			
			
			String sql = "insert into admin values(0,'"+aname+"','"+aemail+"','"+aphone+"','"+ausername+"','"+apassowrd+"')";
			
			int rs = stmt.executeUpdate(sql);
			
			if(rs > 0) {
				
				isSucess = true;
			}
			else {
				isSucess = false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		return isSucess;
	}
	
	public static boolean updateAdmin(String aid,String aname,String aemail,String aphone,String ausername,String apassword) {


	try {
		con = DBConnect.getConnection();
		stmt = con.createStatement();
		
		String sql = "update admin set aname='"+aname+"',aemail='"+aemail+"',aphone='"+aphone+"',ausername='"+ausername+"',apassword='"+apassword+"'"
				+"where aid='"+aid+"'";
		
		int rs = stmt.executeUpdate(sql);
		
		if(rs>0) {
			isSucess = true;
		}
		else {
			isSucess = false;
		}
		
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	
	
	return isSucess;
	
	}
	
	public static List<Admin> getAdminDetails(String Id){
		 
		 int convertedID = Integer.parseInt(Id);
		 
		 ArrayList<Admin>adm = new ArrayList();
		 
		 try {
				con = DBConnect.getConnection();
				stmt = con.createStatement();
				
				String sql = "select* from admin where aid='"+convertedID+"'";
		
				
				rs = stmt.executeQuery(sql);
				
				while(rs.next()) {
					int id = rs.getInt(1);
					String aname = rs.getString(2);
					String aemail = rs.getString(3);
					String aphone = rs.getString(4);
					String ausername = rs.getString(5);
					String apassword = rs.getString(6);
					
					Admin c = new Admin(id,aname,aemail,aphone,ausername,apassword);
					adm.add(c);
				}
				
				
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		 
		 return adm;
	 }
	
 public static boolean deleteAdmin(String id) {
		 
		 
		 
		 int convId = Integer.parseInt(id);
		 
		 try {
				con = DBConnect.getConnection();
				stmt = con.createStatement();
				
				String sql = "delete from admin where aid='"+convId+"'";
				int rs = stmt.executeUpdate(sql);
				
				if(rs>0) {
					isSucess = true;
				}
				else {
					isSucess = false;
				}
				
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		 
		 return isSucess;
	 }
}
