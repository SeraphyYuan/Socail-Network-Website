/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.dbconnection;

/**
 *
 * @author mengli
 */


   
    

@WebServlet(name = "Servletcircledelete", urlPatterns = {"/Servletcircledelete"})
public class Servletcircledelete extends HttpServlet {

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
				
		try{
			// JSP information
			response.setContentType("text/html; charset=gbk"); 
			 String circleid= request.getParameter("circleid");
                                                           
			
			// connect to DB2
			Connection conn = null;
			Class.forName("com.ibm.db2.jcc.DB2Driver");
			String url = "jdbc:db2://Db2serv01.cs.stonybrook.edu:50000/teamdb11:retrieveMessagesFromServerOnGetMessage=true;";
			String user = "cseteam11";
			String pass = "Spring2012";
			conn = DriverManager.getConnection(url,user,pass);
			System.out.println("Connected and working!");
		
                                                              
                                                           
                        
                        
			//DB2 information
                                                             Statement st1=conn.createStatement();
                                                            String query1 ="SELECT * FROM CIRCLE";
                                                           System.out.println(query1);
                                                           ResultSet rs1=st1.executeQuery(query1);
                                                            int rownum1=rs1.getRow();
                                                            String query = "DELETE FROM CIRCLE WHERE CIRCLEID='" + circleid + "'";
                                                            System.out.println(query);
                                                            ResultSet rs2=st1.executeQuery(query);
                                                            int rownum2=rs2.getRow();
                                                            if(rownum1==rownum2)
                                                            {
                                                                 System.out.println("circle has been deleted"+circleid);
                                                                 response.sendRedirect("userpage.jsp");
                                                            }
                                                            else
                                                            {
                                                                System.out.println("circle has not been deleted");
                                                            }
                                                                
		} catch (Exception e) {
			e.printStackTrace();}
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.doGet(request, response);
	}

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}
