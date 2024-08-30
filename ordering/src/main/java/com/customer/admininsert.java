package com.customer;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/admininsert")
public class admininsert extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String aname = request.getParameter("aname");
		String aemail = request.getParameter("aemail");
		String aphone = request.getParameter("aphone");
		String ausername = request.getParameter("auid");
		String apassword = request.getParameter("apsw"); 
		
		boolean isTrue;
		
		isTrue = AdminDBUtil.insertadmin(aname, aemail, aphone, ausername, apassword);
		
		if(isTrue == true) {
			RequestDispatcher dis = request.getRequestDispatcher("adsuccess.jsp");
			dis.forward(request, response);
		}
		else {
			RequestDispatcher dis2 = request.getRequestDispatcher("cunsuccess.jsp");
			dis2.forward(request, response);
		}
	}

}
