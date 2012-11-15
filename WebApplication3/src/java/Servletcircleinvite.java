/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author mengli
 */
@WebServlet(name = "Servletcircleinvite", urlPatterns = {"/Servletcircleinvite"})
public class Servletcircleinvite extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        try
        {
            // JSP information
            response.setContentType("text/html; charset=gbk"); 
            String friendemail = request.getParameter("friendemail");
            String circleid=request.getParameter("circleid");
            PrintWriter out=response.getWriter();
            
            
           // connect to DB2
            Connection conn = null;
            Class.forName("com.ibm.db2.jcc.DB2Driver");
            String url = "jdbc:db2://Db2serv01.cs.stonybrook.edu:50000/teamdb11:retrieveMessagesFromServerOnGetMessage=true;";
            String user = "cseteam11";
            String pass = "Spring2012";
            conn = DriverManager.getConnection(url,user,pass);
            System.out.println("Connected and working!");
            
            //	DB2 information
            Statement stmt1 = conn.createStatement();
            String query1= "select * from FRIENDTABLE WHERE FRIENDEMAIL='"+friendemail+"'";
        //     String query1="SELECT * FROM FRIENDTABLE WHERE FRIENDEMAIL='" + friendemail + "'";
                System.out.println(query1);
                ResultSet rs1 = stmt1.executeQuery(query1);
                while(rs1.next())
                {
                    String friendemail_db=rs1.getString(2);
                     System.out.println(friendemail_db);
                     
                    
                     String query2= " INSERT INTO CIRCLEMEMBER  VALUES (circleid, friendemail)";
                     Statement stmt2=conn.createStatement();
                     ResultSet rs2=stmt2.executeQuery(query2);
                    while(rs2.next())
                    {
                            System.out.println("Invite  successed!");
                            response.sendRedirect("circle.jsp");
                    }
                        
                     
                      
                }
                  
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
    public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.doGet(request, response);
	}
    public void init() throws ServletException {
		// Put your code here
	}
    }	

