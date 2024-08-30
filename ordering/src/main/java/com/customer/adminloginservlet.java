package com.customer;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/adminloginservlet")
public class adminloginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String ausername = request.getParameter("auid");
		String apassword = request.getParameter("apass");
		boolean isTrue;
		
		
		isTrue = AdminDBUtil.validate(ausername, apassword);
		
		if(isTrue == true) {
			List<Admin>admDetails = AdminDBUtil.getadmin(ausername);
			request.setAttribute("admDetails", admDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("adminprofile.jsp");
			dis.forward(request,response);
			
		}
		else {
			out.println("<script type = 'text/javascript'>");
			out.println("alert('your username or password is incorrect');");
			out.print("location='adminlogin.jsp'");
			out.print("</script>");
			
		}
		
	}

}
