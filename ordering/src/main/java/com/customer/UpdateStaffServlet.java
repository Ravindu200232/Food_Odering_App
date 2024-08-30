package com.customer;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/UpdateStaffServlet")
public class UpdateStaffServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String sid = request.getParameter("sid");
		String sname = request.getParameter("sname");
		String semail = request.getParameter("semail");
		String sphone = request.getParameter("sphone");
		String saddress = request.getParameter("saddress");
		
boolean isTrue;
		
		isTrue = StaffDBUtil.updatestaff(sid, sname, semail, sphone, saddress); 
		
		if(isTrue == true) {
			List<Staff> stfDetails =StaffDBUtil.getStaffDetails(sid);
			request.setAttribute("stfDetails", stfDetails);
			RequestDispatcher dis = request.getRequestDispatcher("staffprofile.jsp");
			dis.forward(request, response);
		}
		
		else {
			List<Staff> stfDetails =StaffDBUtil.getStaffDetails(sid);
			request.setAttribute("stfDetails", stfDetails);
			RequestDispatcher dis = request.getRequestDispatcher("staffprofile.jsp");
			dis.forward(request, response);
		}
	}

}
