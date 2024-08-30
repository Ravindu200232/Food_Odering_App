package com.customer;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/StaffLoginServlet")
public class StaffLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String semail = request.getParameter("semail");
        String sphone = request.getParameter("sphone");
        
        
        try {

            List<Staff>stfDetails = StaffDBUtil.validate(semail, sphone);
            request.setAttribute("stfDetails", stfDetails);

        }
        catch(Exception e) {
            e.printStackTrace();
        }

        //redirect driveraccount.jsp

        RequestDispatcher stf = request.getRequestDispatcher("staffprofile.jsp");
        stf.forward(request,response);
	}

}
