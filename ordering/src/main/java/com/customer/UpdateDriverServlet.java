package com.customer;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/UpdateDriverServlet")
public class UpdateDriverServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String did = request.getParameter("did");
		String dname = request.getParameter("dname");
		String demail = request.getParameter("demail");
		String dphone = request.getParameter("dphone");
		String daddress = request.getParameter("daddress");
		
		
boolean isTrue;
		
		isTrue = DriverDBUtil.updatedriver(did, dname, demail, dphone, daddress); 
		
		if(isTrue == true) {
			List<Driver> driDetails =DriverDBUtil.getDriverDetails(did);
			request.setAttribute("driDetails", driDetails);
			RequestDispatcher dis = request.getRequestDispatcher("driverprofile.jsp");
			dis.forward(request, response);
		}
		
		else {
			List<Driver> driDetails =DriverDBUtil.getDriverDetails(did);
			request.setAttribute("driDetails", driDetails);
			RequestDispatcher dis = request.getRequestDispatcher("cunsuccess.jsp");
			dis.forward(request, response);
		}
		
	}

}
