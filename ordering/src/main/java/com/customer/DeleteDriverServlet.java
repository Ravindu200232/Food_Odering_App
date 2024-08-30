package com.customer;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/DeleteDriverServlet")
public class DeleteDriverServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		String id = request.getParameter("did");
		
         boolean isTrue;
		
        isTrue = DriverDBUtil.deleteDriver(id);
		
		if(isTrue == true) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("driverinsert.jsp");
			dispatcher.forward(request, response);
			
		}
		
		else {
			List<Driver>driDetails = DriverDBUtil.getDriverDetails(id);
			request.setAttribute("driDetails", driDetails);
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("driverprofile.jsp");
			dispatcher.forward(request, response);
		}
	}

}
