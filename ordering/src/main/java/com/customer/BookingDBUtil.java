package com.customer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class BookingDBUtil {
	
	
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	

public static boolean insertbook(String fType,int qty,double bprice,String bname,String bphone,String bemail,String baddress) {
		
		boolean isSucess = false;
		
		
		
		
		
		try {
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			
			
			String sql = "insert into book values(0,'"+fType+"','"+qty+"','"+bprice+"','"+bname+"','"+bphone+"','"+bemail+"','"+baddress+"')";

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

}
