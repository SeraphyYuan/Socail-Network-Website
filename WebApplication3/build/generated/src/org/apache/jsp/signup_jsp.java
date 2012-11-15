package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class signup_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Signup Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form name = \"signupForm\" action = \"Servletsignup\" method=\"post\">\n");
      out.write("       \n");
      out.write("\t<table>\n");
      out.write("\t\t<tr>\n");
      out.write("\t\t\t<td>Email<input type=\"text\" name=\"email\" id=\"email\"><td/>\n");
      out.write("\t\t<tr/>\n");
      out.write("\t\t<tr>\n");
      out.write("                    <td>Password<input type=\"password\" name=\"password\" id=\"password\"><td/>\n");
      out.write("\t\t<tr/>\n");
      out.write("\t\t<tr>\n");
      out.write("                    <td>FirstName<input type=\"text\" name=\"FirstName\" id=\"FirstName\"><td/>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>LastName<input type=\"text\" name=\"LastName\" id=\"LastName\"><td/>\n");
      out.write("\t\t<tr/>\n");
      out.write("                                        <tr>\n");
      out.write("                                                <td>DOB<input type=\"text\" name=\"DOB\" id=\"DOB\"><td/>\n");
      out.write("\t\t<tr/>\n");
      out.write("\t\t<tr>\n");
      out.write("                                                <td>HomeAddress<input type=\"text\" name=\"HomeAddress\" id=\"HomeAddress\"><td/>\n");
      out.write("                                        </tr>\n");
      out.write("                                        \n");
      out.write("                                        <tr>\n");
      out.write("                                                    <td>Telephone<input type=\"text\" id=\"Telephone\"><td/>\n");
      out.write("\t\t<tr/>\n");
      out.write("\t\t\n");
      out.write("\t\t<tr>\n");
      out.write("                                                    <td>Preferences<input type=\"text\"  id=\"Preferences\"><td/>\n");
      out.write("\t\t<tr/>\n");
      out.write("\t\t\n");
      out.write("\t\t<tr>\n");
      out.write("\t\t\t<td><input type=\"submit\"  value=\"Submit\"><td/>\n");
      out.write("\t\t<tr/>\n");
      out.write("\t</table>\n");
      out.write("\t</form>\n");
      out.write("       \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
