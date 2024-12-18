package com.customer;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CustomerDBUtil {
	
	private static boolean isSucess;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
	
	public static boolean validate(String userName,String password) {
		
		
		
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			
			String sql = "select *from customer where username = '"+userName+"' and password = '"+password+"'";
			
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
	
	
	public static List<Customer> getCustomer(String userName){
		
		ArrayList<Customer> customer = new ArrayList<>();
		
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			
			String sql = "select *from customer where username = '"+userName+"'";
			
			rs = stmt.executeQuery(sql);
			
			//boolen method true 
			while(rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String email = rs.getString(3);
				String phone = rs.getString(4);
				String userU = rs.getString(5);
				String passU = rs.getString(6);
				
				
				
				Customer cus = new Customer(id,name,email,phone,userU,passU);
				customer.add(cus);
			}
			
		}
		
		catch(Exception e){
			
		}
		return customer;
	}
	

	
	public static boolean insertcustomer(String name,String email,String phone,String username,String passowrd) {
		
		boolean isSucess = false;
		
		//create db connection 
		
		
		
		try {
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			
			
			String sql = "insert into customer values(0,'"+name+"','"+email+"','"+phone+"','"+username+"','"+passowrd+"')";
			
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
	
	
	public static boolean updatecustomer(String id,String name,String email,String phone,String username,String password) {
		
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			
			String sql = "update customer set name='"+name+"',email='"+email+"',phone='"+phone+"',username='"+username+"',password='"+password+"'"
					+"where id='"+id+"'";
			
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
	
	 public static List<Customer> getCustomerDetails(String Id){
		 
		 int convertedID = Integer.parseInt(Id);
		 
		 ArrayList<Customer>cus = new ArrayList();
		 
		 try {
				con = DBConnect.getConnection();
				stmt = con.createStatement();
				
				String sql = "select* from customer where id='"+convertedID+"'";
		
				
				rs = stmt.executeQuery(sql);
				
				while(rs.next()) {
					int id = rs.getInt(1);
					String name = rs.getString(2);
					String email = rs.getString(3);
					String phone = rs.getString(4);
					String username = rs.getString(5);
					String password = rs.getString(6);
					
					Customer c = new Customer(id,name,email,phone,username,password);
					cus.add(c);
			 	}
				
				
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		 
		 return cus;
	 }
	 
	 public static boolean deleteCustomer(String id) {
		 
		 
		 
		 int convId = Integer.parseInt(id);
		 
		 try {
				con = DBConnect.getConnection();
				stmt = con.createStatement();
				
				String sql = "delete from customer where id='"+convId+"'";
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
