package com.customer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StaffDBUtil {
	private static boolean isSucess;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
	
	
	public static List<Staff> validate(String semail,String sphone){



        //check database and assign values

        ArrayList<Staff> stf = new ArrayList<>();



        try {

            con = DBConnect.getConnection();
            stmt = con.createStatement();

            String sql = "select* from staff where semail = '"+semail+"' and sphone = '"+sphone+"'";

            rs = stmt.executeQuery(sql);

            //boolen method true
            if(rs.next()) {
                int id = rs.getInt(1);
                String name = rs.getString(2);
                String phone = rs.getString(3);
                String email = rs.getString(4);
                String address = rs.getString(5);


                Staff c = new Staff(id,name,phone,email,address);
                stf.add(c);
            }
        }

        catch(Exception e) {
            e.printStackTrace();
        }


        return stf;

    }
	
	
	

public static boolean insertstaff(String sname,String sphone,String semail,String saddress) {
		
		
		
	
		
		
		
		try {
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "insert into staff values(0,'"+sname+"','"+sphone+"','"+semail+"','"+saddress+"')";
			
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

    public static boolean updatestaff(String sid,String sname,String semail,String sphone,String saddress) {
    	
    	try {
			con = DBConnect.getConnection(); 
			stmt = con.createStatement();
			
			String sql = "update staff set sname='"+sname+"',semail='"+semail+"',sphone='"+sphone+"',saddress='"+saddress+"'"
					+"where staffid='"+sid+"'";
			
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
    
    public static List<Staff> getStaffDetails(String Id){
		 
		 int convertedID = Integer.parseInt(Id);
		 
		 ArrayList<Staff>stf = new ArrayList();
		 
		 try {
				con = DBConnect.getConnection();
				stmt = con.createStatement();
				
				String sql = "select* from staff where staffid='"+convertedID+"'";
		
				
				rs = stmt.executeQuery(sql);
				
				while(rs.next()) {
					int sid = rs.getInt(1);
					String sname = rs.getString(2);
					String sphone = rs.getString(3);
					String semail = rs.getString(4);
					String saddress = rs.getString(5);
					
					
					Staff c = new Staff(sid,sname,sphone,semail,saddress);
					stf.add(c);
				}
				
				
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		  
		 return stf;
	 }
    
    public static boolean deleteStaff(String id) {
		 
		 
		 
		 int convId = Integer.parseInt(id);
		 
		 try {
				con = DBConnect.getConnection();
				stmt = con.createStatement();
				
				String sql = "delete from staff where staffid='"+convId+"'";
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
