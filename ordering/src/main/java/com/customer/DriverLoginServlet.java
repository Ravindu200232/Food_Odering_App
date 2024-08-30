package com.customer;

import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/DriverLoginServlet")
public class DriverLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String demail = request.getParameter("demail");
        String dphone = request.getParameter("dphone");
	
	
	try {

        List<Driver>driDetails = DriverDBUtil.validate(demail, dphone);
        request.setAttribute("driDetails", driDetails);

    }
    catch(Exception e) {
        e.printStackTrace();
    }
	
	//redirect driveraccount.jsp

    RequestDispatcher dis = request.getRequestDispatcher("driverprofile.jsp");
    dis.forward(request,response);
	
	}

}
