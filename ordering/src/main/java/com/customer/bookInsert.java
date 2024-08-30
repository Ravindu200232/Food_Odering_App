package com.customer;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/bookInsert")
public class bookInsert extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		
		String fType = request.getParameter("fType");
		int qty = Integer.valueOf(request.getParameter("qty"));
		
		int price = 0;
		
		if(fType.equals("ps")) {
			
			price  = 100 * qty;
		}
		
		else if(fType.equals("dqcsb")) {
			price  = 90 * qty;
		}
		
		else if(fType.equals("hot")) {
			price  = 90 * qty;
		}
		
        else if(fType.equals("mfs")) {
        	price  = 110 * qty;
		}
		
        else if(fType.equals("Pizza")) {
        	price  = 130 * qty;
		}
		
        else if(fType.equals("kecc")) {
        	price  = 120 * qty;
        }
		
        else if(fType.equals("cwcc")) {
        	price  = 100 * qty;
        }
		
        else if(fType.equals("fgf")) {
        	price  = 140 * qty;
        }
		
        else if(fType.equals("ljstfm")) {
        	price  = 150 * qty;
        }
		
        else if(fType.equals("bkcf")) {
        	price  = 170 * qty;
        }
		
        else if(fType.equals("kpcn")) {
        	price  = 130 * qty;
        }
		
        else if(fType.equals("dm")) {
        	price  = 190 * qty;
        }
		
        else if(fType.equals("sc")) {
        	price  = 200 * qty;
        }
		
        else if(fType.equals("cfait")) {
        	price  = 120 * qty;
        }
		
        else if(fType.equals("mbap")) {
        	price  = 100 * qty;
        }
		
        else if(fType.equals("sm")) {
        	price  = 130 * qty;
        }
		
        else if(fType.equals("kmpwg")) {
        	price  = 160 * qty;
        }
		
        else if(fType.equals("sssb")) {
        	price  = 140 * qty;
        }
		
        else if(fType.equals("bkff")) {
        	price  = 130 * qty;
        }
		
        else if(fType.equals("scbrm")) {
        	price  = 150 * qty;
        }
		
		int bprice = price;
		
		String bname = request.getParameter("bname");
		String bphone = request.getParameter("bphone");
		String bemail = request.getParameter("bemail");
		String baddress = request.getParameter("baddress");
		
		boolean isTrue;
		
        isTrue = BookingDBUtil.insertbook(fType, qty, bprice, bname, bphone, bemail, baddress);
		
        if(isTrue == true) {
        	
        	
                request.setAttribute("bname", bname);
                request.setAttribute("fType", fType);
        	    request.setAttribute("bphone", bphone);
        	    request.setAttribute("bemail", bemail);
        	    request.setAttribute("baddress", baddress);
        	    request.setAttribute("qty", qty);
        	    request.setAttribute("totalPrice", bprice);
        	
        	
			RequestDispatcher dis = request.getRequestDispatcher("bsuccess.jsp");
			dis.forward(request, response);
		}
		else {
			RequestDispatcher dis2 = request.getRequestDispatcher("bunsuccess.jsp");
			dis2.forward(request, response);
		}
        
        
        
        
	}

}
