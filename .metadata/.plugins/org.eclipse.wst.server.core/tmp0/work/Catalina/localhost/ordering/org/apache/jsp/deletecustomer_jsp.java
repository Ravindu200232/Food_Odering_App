/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.88
 * Generated at: 2024-05-19 11:12:14 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class deletecustomer_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/C:/Users/ravin/OneDrive/Desktop/ordering/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/ordering/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153365282000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1713978399782L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(3);
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

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
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
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
      out.write("    \r\n");
      out.write("     \r\n");
      out.write("    \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("    <!-- Important to make website responsive -->\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <title></title>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!-- Link our CSS file -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-alpha1/dist/css/bootstrap.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-alpha1/dist/js/bootstrap.bundle.min.js\">\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    <link rel=\"stylesheet\" href=\"profile.css\">\r\n");
      out.write("     <link rel=\"stylesheet\" href=\"homestyle.css\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write("  \r\n");
      out.write("   <!-- Navbar Section Starts Here -->\r\n");
      out.write("    <section class=\"navbar\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"logo\">\r\n");
      out.write("                <a href=\"#\" title=\"Logo\">\r\n");
      out.write("                    <img src=\"images/logo.png\" alt=\"Restaurant Logo\" class=\"img-responsive\">\r\n");
      out.write("                </a>\r\n");
      out.write("                \r\n");
      out.write("                <div class=\"customer-info\">\r\n");
      out.write("            \r\n");
      out.write("            </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("\r\n");
      out.write("            <div class=\"menu text-right\">\r\n");
      out.write("                <ul>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"useraccount.jsp\">Home</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                   \r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"clearfix\"></div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </section>\r\n");
      out.write("    <!-- Navbar Section Ends Here -->\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("    <!-- user profile Section Starts Here -->\r\n");
      out.write("    <section class=\"userp\">\r\n");
      out.write("    \r\n");
      out.write("    <div class=\"container rounded bg-white mt-5 mb-5\">\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("        <div class=\"col-md-3 border-right\">\r\n");
      out.write("            <div class=\"d-flex flex-column align-items-center text-center p-3 py-5\"><img class=\"rounded-circle mt-5\" width=\"150px\" src=\"https://st3.depositphotos.com/15648834/17930/v/600/depositphotos_179308454-stock-illustration-unknown-person-silhouette-glasses-profile.jpg\"><span class=\"font-weight-bold\">");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("</span><span> </span></div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"col-md-5 border-right\">\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("            <div class=\"p-3 py-5\">\r\n");
      out.write("                <div class=\"d-flex justify-content-between align-items-center mb-3\">\r\n");
      out.write("                    <h4 class=\"text-right\">Profile Settings</h4>\r\n");
      out.write("                \r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("           \r\n");
      out.write("                \r\n");
      out.write("                ");

                
                String id=request.getParameter("id");
                String name=request.getParameter("name");
                String email=request.getParameter("email");
                String phone=request.getParameter("phone");
                String uname=request.getParameter("uname");
                String pass=request.getParameter("pass");
               
                
      out.write("\r\n");
      out.write("                \r\n");
      out.write("                <form action=\"deletcus\" method=\"post\">\r\n");
      out.write("                \r\n");
      out.write("                <div class=\"row mt-3\">\r\n");
      out.write("                \r\n");
      out.write("                    \r\n");
      out.write("                    <div class=\"col-md-12\"><label class=\"labels\">id</label><input type=\"text\" name=\"cusid\" class=\"form-control\" placeholder=\"enter phone number\" readonly=\"readonly\" value=\"");
      out.print(id );
      out.write("\"></div>\r\n");
      out.write("                    \r\n");
      out.write("                    <div class=\"col-md-12\"><label class=\"labels\">Name</label><input type=\"text\" name=\"name\" class=\"form-control\" readonly  value=\"");
      out.print(name );
      out.write("\"></div>\r\n");
      out.write("                    <div class=\"col-md-12\"><label class=\"labels\">email</label><input type=\"text\" name=\"email\" class=\"form-control\" readonly  value=\"");
      out.print(email );
      out.write("\"></div>\r\n");
      out.write("                    <div class=\"col-md-12\"><label class=\"labels\">Phone</label><input type=\"text\" name=\"phone\" class=\"form-control\" readonly  value=\"");
      out.print(phone );
      out.write("\"></div>\r\n");
      out.write("                    <div class=\"col-md-12\"><label class=\"labels\">User name</label><input type=\"text\" name=\"uname\" class=\"form-control\" readonly value=\"");
      out.print(uname );
      out.write("\"></div>\r\n");
      out.write("                    <div class=\"col-md-12\"><label class=\"labels\">Password</label><input type=\"text\" name=\"pass\" class=\"form-control\" readonly value=\"");
      out.print(pass );
      out.write("\"></div>\r\n");
      out.write("                    \r\n");
      out.write("                               \r\n");
      out.write("               \r\n");
      out.write("                </div>\r\n");
      out.write("            \r\n");
      out.write("                \r\n");
      out.write("               <div class=\"mt-5 text-center\"><button class=\"btn btn-primary profile-button\" type=\"button\"><input type=\"submit\" value=\"Delete profile\"></button></div>\r\n");
      out.write("               \r\n");
      out.write("               </form>\r\n");
      out.write("            \r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"col-md-4\">\r\n");
      out.write("            \r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("    \r\n");
      out.write("        \r\n");
      out.write("    </section>\r\n");
      out.write("    <!-- fOOD Menu Section Ends Here -->\r\n");
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
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("    <!-- footer Section Starts Here -->\r\n");
      out.write("    <section class=\"footer\">\r\n");
      out.write("        <div class=\"container text-center\">\r\n");
      out.write("            <p>All rights reserved. Designed By <a href=\"#\">Ravindu B Subasinha</a></p>\r\n");
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

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    boolean _jspx_th_c_005fforEach_005f0_reused = false;
    try {
      _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f0.setParent(null);
      // /deletecustomer.jsp(70,308) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVar("cus");
      // /deletecustomer.jsp(70,308) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/deletecustomer.jsp(70,308) '${cusDetails}'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${cusDetails}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
        if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cus.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</p></span><span class=\"text-black-50\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cus.email}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforEach_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
      _jspx_th_c_005fforEach_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fforEach_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fforEach_005f0_reused);
    }
    return false;
  }
}
