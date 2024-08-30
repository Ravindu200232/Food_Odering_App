package com.customer;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/DeleteStaffServlet")
public class DeleteStaffServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("sid");
		
         boolean isTrue;
		
        isTrue = StaffDBUtil.deleteStaff(id);
		
		if(isTrue == true) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("staffinsert.jsp");
			dispatcher.forward(request, response);
			
		}
		
		else {
			List<Staff>stfDetails = StaffDBUtil.getStaffDetails(id);
			request.setAttribute("stfDetails", stfDetails);
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("staffprofile.jsp");
			dispatcher.forward(request, response);
		}
	}

}
