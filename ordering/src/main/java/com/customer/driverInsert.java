package com.customer;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/driverInsert")
public class driverInsert extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String dname = request.getParameter("dname");
		String dphone = request.getParameter("dphone");
		String demail = request.getParameter("demail");
		String daddress = request.getParameter("daddress");
		
		boolean isTrue;
		
		isTrue = DriverDBUtil.insertdriver(dname, dphone, demail, daddress);
		
		if(isTrue == true) {
			RequestDispatcher dis = request.getRequestDispatcher("dsuccess.jsp");
			dis.forward(request, response);
		}
		else {
			RequestDispatcher dis2 = request.getRequestDispatcher("dunsuccess.jsp");
			dis2.forward(request, response);
		}
	}

}
