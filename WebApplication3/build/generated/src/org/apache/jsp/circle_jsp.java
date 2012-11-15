package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class circle_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Circle</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Circle Interface</h1>\n");
      out.write(" <form name=\"creatcircleFrom\" action=\"Servletcircle\" method=\"post\">\n");
      out.write("  CircleName:\n");
      out.write("  <INPUT TYPE=\"TEXT\" NAME=\"circlename\" id=\"circlename\"><BR>\n");
      out.write("  CircleId:\n");
      out.write("  <INPUT TYPE=\"TEXT\" NAME=\"circleid\" id=\"circleid\"><BR>\n");
      out.write("    Owner:\n");
      out.write("    <INPUT TYPE=\"TEXT\" NAME=\"owner\" id=\"owener\"><BR>\n");
      out.write("   CircleMember:\n");
      out.write("   <INPUT TYPE=\"TEXT\" NAME=\"circlemember\" id=\"circlemember\"><BR>\n");
      out.write("  <INPUT TYPE=\"SUBMIT\" VALUE=\"Create\">\n");
      out.write("  </form>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("   <form name=\"creatcircleFrom\" action=\"Servletcircledelete\" method=\"post\">\n");
      out.write("        CircleId:\n");
      out.write("  <INPUT TYPE=\"TEXT\" NAME=\"circleid\" id=\"circleid\"><BR>\n");
      out.write("    <INPUT TYPE=\"SUBMIT\" VALUE=\"Delete\">\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("</form>\n");
      out.write("   <form name=\"Servletcircleinvite\" action=\"Servletcircleinvite\" method=\"post\">\n");
      out.write("     FriendEmail:\n");
      out.write("  <INPUT TYPE=\"TEXT\" NAME=\"friendemail\" id=\"friendemail\"><BR>\n");
      out.write("   CircleID:\n");
      out.write("  <INPUT TYPE=\"TEXT\" NAME=\"circleid\" id=\"circleid\"><BR>\n");
      out.write("    <INPUT TYPE=\"SUBMIT\" VALUE=\"Invite \">\n");
      out.write("</form>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("  <form name=\"creatcircleFrom\" action=\"Servletcircleremove\" method=\"post\">\n");
      out.write("     FriendEmail:\n");
      out.write("  <INPUT TYPE=\"TEXT\" NAME=\"friendemail\" id=\"friendemail\"><BR>\n");
      out.write("   CircleID:\n");
      out.write("  <INPUT TYPE=\"TEXT\" NAME=\"circleid\" id=\"circleid\"><BR>\n");
      out.write("    <INPUT TYPE=\"SUBMIT\" VALUE=\"Remove \">\n");
      out.write("</form>\n");
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
