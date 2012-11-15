package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class advertisement_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Advertisement</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Advertisement</h1>\n");
      out.write("        <form name=\"AdvertisementFrom\" action=\"Servletadvcreate\" method=\"post\">\n");
      out.write("        AdvertisementID:\n");
      out.write("  <INPUT TYPE=\"TEXT\" NAME=\"advid\" id=\"advid\"><BR>\n");
      out.write("   AdvertisementType:\n");
      out.write("  <INPUT TYPE=\"TEXT\" NAME=\"type\" id=\"type\"><BR>\n");
      out.write("   Company:\n");
      out.write("  <INPUT TYPE=\"TEXT\" NAME=\"company\" id=\"company\"><BR>\n");
      out.write("    ItemName:\n");
      out.write("  <INPUT TYPE=\"TEXT\" NAME=\"itemname\" id=\"itemname\"><BR>\n");
      out.write("    Price:\n");
      out.write("  <INPUT TYPE=\"TEXT\" NAME=\"price\" id=\"price\"><BR>\n");
      out.write("    AvailabeNum:\n");
      out.write("  <INPUT TYPE=\"TEXT\" NAME=\"num\" id=\"num\"><BR>\n");
      out.write("    <INPUT TYPE=\"SUBMIT\" VALUE=\"Create\"><BR>\n");
      out.write("    </form>\n");
      out.write("        \n");
      out.write("        <form name=\"AdvertisementFrom\" action=\"Servletadvdelete\" method=\"post\">\n");
      out.write("        AdvertisementID:\n");
      out.write("  <INPUT TYPE=\"TEXT\" NAME=\"advid\" id=\"advid\"><BR>\n");
      out.write("    <INPUT TYPE=\"SUBMIT\" VALUE=\"Delete\">\n");
      out.write("        </form>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("    <form name=\"ItemReportForm\"action=\"Servletlisting\" method=\"post\">\n");
      out.write("    AdvID:\n");
      out.write("  <INPUT TYPE=\"TEXT\" NAME=\"itemid\" id=\"itemid\"><BR>\n");
      out.write("    <INPUT TYPE=\"SUBMIT\" VALUE=\"ItemListing\">\n");
      out.write("</form>\n");
      out.write("        \n");
      out.write("              \n");
      out.write("    <form name=\"RevenueForm\"action=\"Servletincome\"  method=\"post\">\n");
      out.write("\t AdvID:\n");
      out.write("  <INPUT TYPE=\"TEXT\" NAME=\"advid\" id=\"advid\"><BR>\n");
      out.write("    <INPUT TYPE=\"SUBMIT\" VALUE=\"RevenueReport\">\n");
      out.write("</form>\n");
      out.write("        \n");
      out.write("        <form name=\"TransactionForm\"action=\"Servlettransaction\"  method=\"post\">\n");
      out.write("\t TransactionID:\n");
      out.write("  <INPUT TYPE=\"TEXT\" NAME=\"dealid\" id=\"dealid\"><BR>\n");
      out.write("    <INPUT TYPE=\"SUBMIT\" VALUE=\"TransactionReport\">\n");
      out.write("</form>\n");
      out.write("        \n");
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
