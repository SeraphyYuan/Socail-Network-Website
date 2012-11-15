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
@WebServlet(name = "Servletprofile", urlPatterns = {"/Servletprofile"})
public class Servletprofile extends HttpServlet {
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
                   
                     
                    // connect to DB2
                    Connection conn = null;
                    Class.forName("com.ibm.db2.jcc.DB2Driver");
                    String url = "jdbc:db2://Db2serv01.cs.stonybrook.edu:50000/teamdb11:retrieveMessagesFromServerOnGetMessage=true;";
                    String user = "cseteam11";
                    String pass = "Spring2012";
                    conn = DriverManager.getConnection(url,user,pass);
                    System.out.println("Connected and working!");
                   
                    
                    //DB2 information
                    String firstname_db="";
                    String lastname_db="";
                    String email_db="";
                    String birthday_db="";
                    String homeadd_db="";
                    String cell_db="";
                    String preference="";
                    
                    
                    
                    Statement st1=conn.createStatement();
                    String query="SELECT * FROM USER WHERE EMAIL='"+hostemail+ "'";
                     ResultSet rs=st1.executeQuery(query);
                     
                     while(rs.next())
                     {
                         firstname_db=rs.getString(1);
                         lastname_db=rs.getString(2);
                         email_db=rs.getString(3);
                         birthday_db=rs.getString(5);
                         homeadd_db=rs.getString(6);
                         cell_db=rs.getString(7);
                         preference=rs.getString(8);
                         
                         request.setAttribute("firstname", firstname_db);
                         request.setAttribute("lastname",lastname_db);
                         request.setAttribute("email", email_db);
                         request.setAttribute("birthday", birthday_db);
                         request.setAttribute("homeadd", homeadd_db);
                         request.setAttribute("cell", cell_db);
                         request.setAttribute("preference", preference);
                         
                         System.out.print(firstname_db);
                        
                     }
                      request.getRequestDispatcher("profiledisplay.jsp").forward(request,response);
                    
                      
                        
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
