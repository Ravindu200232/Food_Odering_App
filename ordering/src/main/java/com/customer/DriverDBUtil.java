package com.customer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DriverDBUtil {
	private static boolean isSucess;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
public static List<Driver> validate(String demail,String dphone){
		
		
		
		//check database and assign values
		
		ArrayList<Driver> dri = new ArrayList<>();
		
	
		
		try {
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			
			String sql = "select* from driver where demail = '"+demail+"' and dphone = '"+dphone+"'";
			
			rs = stmt.executeQuery(sql);
			
			//boolen method true 
			if(rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String phone = rs.getString(3);
				String email = rs.getString(4);
				String address = rs.getString(5);
				
				
				Driver c = new Driver(id,name,phone,email,address);
				dri.add(c);
			}
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		return dri;
		
	}



public static boolean insertdriver(String dname,String dphone,String demail,String daddress) {
		
		
		
		
		
		try {
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "insert into driver values(0,'"+dname+"','"+dphone+"','"+demail+"','"+daddress+"')";
			
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

   public static boolean updatedriver(String did,String dname,String demail,String dphone,String daddress) {
	   
	   try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			
			String sql = "update driver set dname='"+dname+"',demail='"+demail+"',dphone='"+dphone+"',daddress='"+daddress+"'"
					+"where did='"+did+"'";
			
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
   
   public static List<Driver> getDriverDetails(String Id){
		 
		 int convertedID = Integer.parseInt(Id);
		 
		 ArrayList<Driver>dri = new ArrayList();
		 
		 try {
				con = DBConnect.getConnection();
				stmt = con.createStatement();
				
				String sql = "select* from driver where did='"+convertedID+"'";
		
				
				rs = stmt.executeQuery(sql);
				
				while(rs.next()) {
					int did = rs.getInt(1);
					String dname = rs.getString(2);
					String dphone = rs.getString(3);
					String demail = rs.getString(4);
					String daddress = rs.getString(5);
					
					
					Driver c = new Driver(did,dname,dphone,demail,daddress);
					dri.add(c);
				}
				
				
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		 
		 return dri;
	 }
   
   
   public static boolean deleteDriver(String id) {
		 
		 
		 
		 int convId = Integer.parseInt(id);
		 
		 try {
				con = DBConnect.getConnection();
				stmt = con.createStatement();
				
				String sql = "delete from driver where did='"+convId+"'";
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
