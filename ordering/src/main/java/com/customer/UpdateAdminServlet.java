package com.customer;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/UpdateAdminServlet")
public class UpdateAdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String aid = request.getParameter("aid");
		String aname = request.getParameter("aname");
		String aemail = request.getParameter("aemail");
		String aphone = request.getParameter("aphone");
		String ausername = request.getParameter("auname");
		String apassword = request.getParameter("apass");
		
		
boolean isTrue;
		
		isTrue = AdminDBUtil.updateAdmin(aid, aname, aemail, aphone, ausername, apassword); 
		
		if(isTrue == true) {
			
			List<Admin> admDetails =AdminDBUtil.getAdminDetails(aid);
			request.setAttribute("admDetails", admDetails);
			RequestDispatcher dis = request.getRequestDispatcher("adminprofile.jsp");
			dis.forward(request, response);
		}
		
		else {
			
			List<Admin> admDetails =AdminDBUtil.getAdminDetails(aid);
			request.setAttribute("admDetails", admDetails);
			RequestDispatcher dis = request.getRequestDispatcher("adminprofile.jsp");
			dis.forward(request, response);
		}
		
	}

}
