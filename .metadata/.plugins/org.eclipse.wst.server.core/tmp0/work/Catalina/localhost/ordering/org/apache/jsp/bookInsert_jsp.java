/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.88
 * Generated at: 2024-05-19 11:12:37 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class bookInsert_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(3);
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <!-- Important to make website responsive -->\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <title></title>\r\n");
      out.write("\r\n");
      out.write("    <!-- Link our CSS file -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"homestyle.css\">\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("    <!-- Navbar Section Starts Here -->\r\n");
      out.write("    <section class=\"navbar\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"logo\">\r\n");
      out.write("                <a href=\"#\" title=\"Logo\">\r\n");
      out.write("                    <img src=\"images/logo.png\" alt=\"Restaurant Logo\" class=\"img-responsive\">\r\n");
      out.write("                </a>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"menu text-right\">\r\n");
      out.write("                <ul>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"index.html\">Home</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"categories.html\">Categories</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"foods.html\">Foods</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"#\">Contact</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"clearfix\"></div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </section>\r\n");
      out.write("    <!-- Navbar Section Ends Here -->\r\n");
      out.write("\r\n");
      out.write("    <!-- fOOD sEARCH Section Starts Here -->\r\n");
      out.write("    <section class=\"food-search\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            \r\n");
      out.write("            <h2 class=\"text-center text-white\">Fill this form to confirm your order.</h2>\r\n");
      out.write("\r\n");
      out.write("            <form action=\"insertbook\"   method=\"post\"  class=\"order\">\r\n");
      out.write("                <fieldset>\r\n");
      out.write("                    <legend>Selected Food</legend>\r\n");
      out.write("                    \r\n");
      out.write("                    <div class=\"food-menu-img\">\r\n");
      out.write("                        <img src=\"images/menu-pizza.jpg\" alt=\"Chicke Hawain Pizza\" class=\"img-responsive img-curve\">\r\n");
      out.write("                    </div>\r\n");
      out.write("    \r\n");
      out.write("                    <div class=\"food-menu-desc\">\r\n");
      out.write("                        <h3>Food Title</h3>\r\n");
      out.write("                        <select name=\"fType\" id=\"fType\" class=\"input-responsive\">\r\n");
      out.write("                    <option value=\"dqcsb\">Dairy Queen Chicken Strip Basket</b></option>\r\n");
      out.write("                    <option value=\"ps\">Panera Soup</option>\r\n");
      out.write("                    <option value=\"hot\">Hardee's Original Thickburger</option>\r\n");
      out.write("                    <option value=\"mfs\">McDonald's Filet-O-Fish Sandwich</option>\r\n");
      out.write("                    <option value=\"Pizza\">Little Caesars Crazy Bread</option>\r\n");
      out.write("                    <option value=\"kecc\">KFC Extra Crispy Chicken</option>\r\n");
      out.write("                    <option value=\"cwcc\">Culver's Wisconsin Cheese Curds</option>\r\n");
      out.write("                    <option value=\"fgf\">Five Guys Fries</option>\r\n");
      out.write("                    <option value=\"wbp\">Wendy's Baked Potato</option>\r\n");
      out.write("                    <option value=\"ljstfm\">Long John Silver's Two-Piece Fish Meal</option>\r\n");
      out.write("                    <option value=\"bkcf\">Burger King Chicken Fries</option>\r\n");
      out.write("                    <option value=\"kpcn\">KFC Popcorn Chicken Nuggets</option>\r\n");
      out.write("                    <option value=\"dm\">Dunkin' Munchkins</option>\r\n");
      out.write("                    <option value=\"sc\">Subway Cookies</option>\r\n");
      out.write("                    <option value=\"cfait\">Chick-fil-A Iced Tea</option>\r\n");
      out.write("                    <option value=\"mbap\">McDonald's Baked Apple Pie</option>\r\n");
      out.write("                    <option value=\"sm\">Starbucks Macchiato</option>\r\n");
      out.write("                    <option value=\"kmpwg\">KFC Mashed Potatoes with Gravy</option>\r\n");
      out.write("                    <option value=\"sssb\">Shake Shack SmokeShack Burger</option>\r\n");
      out.write("                    <option value=\"bkff\">Burger King French Fries</option>\r\n");
      out.write("                    <option value=\"scbrm\">Subway Chicken & Bacon Ranch Melt</option>\r\n");
      out.write("                  \r\n");
      out.write("                    \r\n");
      out.write("                    </select>\r\n");
      out.write("                        \r\n");
      out.write("                        \r\n");
      out.write("\r\n");
      out.write("                        <div class=\"order-label\">Quantity</div>\r\n");
      out.write("                        <input type=\"number\" name=\"qty\" class=\"input-responsive\" value=\"1\" required>\r\n");
      out.write("                        \r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                </fieldset>\r\n");
      out.write("                \r\n");
      out.write("                <fieldset>\r\n");
      out.write("                    <legend>Delivery Details</legend>\r\n");
      out.write("                    <div class=\"order-label\">Full Name</div>\r\n");
      out.write("                    <input type=\"text\" name=\"bname\" placeholder=\"E.g. Ravindu Bandara\" class=\"input-responsive\" required>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"order-label\">Phone Number</div>\r\n");
      out.write("                    <input type=\"tel\" name=\"bphone\" placeholder=\"E.g. 07130xxxxxx\" class=\"input-responsive\" required>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"order-label\">Email</div>\r\n");
      out.write("                    <input type=\"email\" name=\"bemail\" placeholder=\"E.g. ravi@gmail.com\" class=\"input-responsive\" required>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"order-label\">Address</div>\r\n");
      out.write("                    <textarea name=\"baddress\" rows=\"10\" placeholder=\"E.g. Street, City, Country\" class=\"input-responsive\" required></textarea>\r\n");
      out.write("\r\n");
      out.write("                    <input type=\"submit\" name=\"submit\" value=\"Confirm Order\" class=\"btn btn-primary\">\r\n");
      out.write("                </fieldset>\r\n");
      out.write("\r\n");
      out.write("            </form>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("    </section>\r\n");
      out.write("    <!-- fOOD sEARCH Section Ends Here -->\r\n");
      out.write("\r\n");
      out.write("    <!-- social Section Starts Here -->\r\n");
      out.write("    <section class=\"social\">\r\n");
      out.write("        <div class=\"container text-center\">\r\n");
      out.write("            <ul>\r\n");
      out.write("                <li>\r\n");
      out.write("                    <a href=\"#\"><img src=\"https://img.icons8.com/fluent/50/000000/facebook-new.png\"/></a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                    <a href=\"#\"><img src=\"https://img.icons8.com/fluent/48/000000/instagram-new.png\"/></a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                    <a href=\"#\"><img src=\"https://img.icons8.com/fluent/48/000000/twitter.png\"/></a>\r\n");
      out.write("                </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("    </section>\r\n");
      out.write("    <!-- social Section Ends Here -->\r\n");
      out.write("\r\n");
      out.write("    <!-- footer Section Starts Here -->\r\n");
      out.write("    <section class=\"footer\">\r\n");
      out.write("        <div class=\"container text-center\">\r\n");
      out.write("            <p>All rights reserved. Designed By <a href=\"#\">Ravindu</a></p>\r\n");
      out.write("        </div>\r\n");
      out.write("    </section>\r\n");
      out.write("    <!-- footer Section Ends Here -->\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
