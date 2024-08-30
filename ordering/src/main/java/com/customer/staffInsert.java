package com.customer;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/staffInsert")
public class staffInsert extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String sname = request.getParameter("sname");
		String sphone = request.getParameter("sphone");
		String semail = request.getParameter("semail");
		String saddress = request.getParameter("saddress");
		
		boolean isTrue;
		
		isTrue = StaffDBUtil.insertstaff(sname,sphone,semail,saddress);
		
		if(isTrue == true) {
			RequestDispatcher dis = request.getRequestDispatcher("staffssuccess.jsp");
			dis.forward(request, response);
		}
		else {
			RequestDispatcher dis2 = request.getRequestDispatcher("sunsuccess.jsp");
			dis2.forward(request, response);
		}
	}

}
