/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author mengli
 */
@WebServlet(name = "Servletpurchase", urlPatterns = {"/Servletpurchase"})
public class Servletpurchase extends HttpServlet {
            public void destroy() {
		super.destroy(); 
    
            }
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                try
                {
                    // JSP information
	response.setContentType("text/html; charset=gbk"); 
                    HttpSession session = request.getSession();
                    String hostemail=session.getAttribute("hostemail").toString();
                    System.out.println(hostemail);
                    String dealid=request.getParameter("itemid");
                    
                    
                    
                     
                    // connect to DB2
                    Connection conn = null;
                    Class.forName("com.ibm.db2.jcc.DB2Driver");
                    String url = "jdbc:db2://Db2serv01.cs.stonybrook.edu:50000/teamdb11:retrieveMessagesFromServerOnGetMessage=true;";
                    String user = "cseteam11";
                    String pass = "Spring2012";
                    conn = DriverManager.getConnection(url,user,pass);
                    System.out.println("Connected and working!");
                    System.out.println(hostemail);
                    
                    //	DB2 information
                    Statement stmt = conn.createStatement();
                    String query="SELECT * FROM SALES WHERE ADVID='"+dealid+"'";
                   
                    String itemid_db="";
                    String  date_db="";
                    String num_db="";
                    String dealer_db="";
                    System.out.println(query);
                    ResultSet rs = stmt.executeQuery(query);
                    
                    while(rs.next())
                    {
                          
                          itemid_db=rs.getString(1).trim();
                          date_db=rs.getString(2);
                          num_db=rs.getString(4);
                          dealer_db=rs.getString(5);
                          
                          System.out.println("id_db:" + rs.getString(1).trim()+ "	" );
                          request.setAttribute("itemid", itemid_db);
                          request.setAttribute("date", date_db);
                          request.setAttribute("num", num_db);
                          request.setAttribute("dealer", dealer_db);
                    }
                    request.getRequestDispatcher("purchasedisplay.jsp").forward(request,response);

             
                    // close connect
                    conn.close();
                        
                }catch(Exception e)
                {
                    e.printStackTrace();
                }
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                    this.doGet(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
  public void init() throws ServletException {
		// Put your code here
	}
}
