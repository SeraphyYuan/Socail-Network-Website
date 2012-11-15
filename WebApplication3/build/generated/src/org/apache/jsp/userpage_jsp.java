package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;

public final class userpage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>User Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Welcome to socail network!</h1>\n");
      out.write("            \n");
      out.write("  <form action=\"login.jsp\">\n");
      out.write("\t<table>\n");
      out.write("      <tr>\n");
      out.write("       <td><button>Log out</button><td/>\n");
      out.write("      </tr>\n");
      out.write("  \t</table>\n");
      out.write("   </form>\n");
      out.write(" \n");
      out.write("      <form name=\"friendsearchForm\"action=\"searchfriend.jsp\" >\n");
      out.write("\t<table>\n");
      out.write("\t\t<tr>\n");
      out.write("\t\t\t<td><input type=\"submit\" value=\"SearchFriend\"></td>\n");
      out.write("\t\t</tr>\n");
      out.write("\t</table>\n");
      out.write("</form>  \n");
      out.write("        \n");
      out.write("<form action=\"circle.jsp\" >\n");
      out.write("\t<table>\n");
      out.write("\t\t<tr>\n");
      out.write("\t\t\t<td><input type=\"submit\" value=\"Circle\"></td>\n");
      out.write("\t\t</tr>\n");
      out.write("\t</table>\n");
      out.write("</form>\n");
      out.write("<form name=\"profileForm\"action=\"Servletprofile\" method=\"post\">\n");
      out.write("\t<table>\n");
      out.write("\t\t<tr>\n");
      out.write("\t\t\t<td><input type=\"submit\" value=\"ProfilePage\"></td>\n");
      out.write("\t\t</tr>\n");
      out.write("\t</table>\n");
      out.write("</form>\n");
      out.write("  <form name=\"WallForm\"action=\"postcommentwall.jsp\" >\n");
      out.write("\t<table>\n");
      out.write("\t\t<tr>\n");
      out.write("\t\t\t<td><input type=\"submit\" value=\"PostWall\"></td>\n");
      out.write("\t\t</tr>\n");
      out.write("\t</table>\n");
      out.write("</form>\n");
      out.write("        </form>\n");
      out.write("  <form name=\"SIPForm\"action=\"sip.jsp\" >\n");
      out.write("\t<table>\n");
      out.write("\t\t<tr>\n");
      out.write("\t\t\t<td><input type=\"submit\" value=\"SIP\"></td>\n");
      out.write("\t\t</tr>\n");
      out.write("\t</table>\n");
      out.write("</form>\n");
      out.write("        \n");
      out.write("         <form name=\"MessageForm\"action=\"message.jsp\" >\n");
      out.write("\t<table>\n");
      out.write("\t\t<tr>\n");
      out.write("\t\t\t<td><input type=\"submit\" value=\"Message\"></td>\n");
      out.write("\t\t</tr>\n");
      out.write("\t</table>\n");
      out.write("</form>\n");
      out.write("        \n");
      out.write("<form name=\"PurchaseForm\"action=\"purchase.jsp\" >\n");
      out.write("\t<table>\n");
      out.write("\t\t<tr>\n");
      out.write("\t\t\t<td><input type=\"submit\" value=\"Purchase\"></td>\n");
      out.write("\t\t</tr>\n");
      out.write("\t</table>\n");
      out.write("</form>\n");
      out.write("        \n");
      out.write("        </form>\n");
      out.write("        \n");
      out.write("<form name=\"AdvertisementForm\"action=\"advertisement.jsp\" >\n");
      out.write("\t<table>\n");
      out.write("\t\t<tr>\n");
      out.write("\t\t\t<td><input type=\"submit\" value=\"Advertisement\"></td>\n");
      out.write("\t\t</tr>\n");
      out.write("\t</table>\n");
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
