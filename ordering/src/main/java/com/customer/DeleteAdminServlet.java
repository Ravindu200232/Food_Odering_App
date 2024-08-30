package com.customer;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/DeleteAdminServlet")
public class DeleteAdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("aid");
		
		boolean isTrue;
		
        isTrue = AdminDBUtil.deleteAdmin(id);
		
		if(isTrue == true) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("admininsert.jsp");
			dispatcher.forward(request, response);
			
		}
		
		else {
			List<Admin>admDetails = AdminDBUtil.getAdminDetails(id);
			request.setAttribute("admDetails", admDetails);
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("adminprofile.jsp");
			dispatcher.forward(request, response);
		}
	}

}
