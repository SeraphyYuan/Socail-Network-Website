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
import javax.servlet.http.HttpSession;
import model.dbconnection;

/**
 *
 * @author mengli
 */


   
    

@WebServlet(name = "Servletsignup", urlPatterns = {"/Servletsignup"})
public class Servletsignup extends HttpServlet {

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
			 String semail= request.getParameter("email");
                                                            String sfirstname=request.getParameter("FirstName");
                                                            String slastname=request.getParameter("LastName");
                                                            String spassword=request.getParameter("password");
                                                            String sdob=request.getParameter("DOB");
                                                            String shomeaddr=request.getParameter("HomeAddress");
                                                            String stellnum=request.getParameter("Telephone");
                                                            String spreference=request.getParameter("Preferences");
			
                                                            
                                                            
                                                            
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
                                                            String sql = 
                                                            "insert into USER values (?,?,?,?,?,?,?,?)";
                                                            PreparedStatement pst = 
                                                            conn.prepareStatement(sql);
                                                            pst.setString(1, sfirstname);
                                                            pst.setString(2, slastname);
                                                            pst.setString(3, semail);
                                                            pst.setString(4, spassword);
                                                            pst.setString(5, sdob);
                                                            pst.setString(6, shomeaddr);
                                                            pst.setString(7, stellnum);
                                                            pst.setString(8, spreference);
                                                            int numRowsChanged = pst.executeUpdate();
                                                            System.out.println("numRowsChanged"+numRowsChanged);
                                                            if(numRowsChanged!=0)
                                                            {
                                                                System.out.println("Login successed!");
                                                                response.sendRedirect("userpage.jsp");
                                                            }
                                                           
                                                          
                                                            pst.close();                        
			conn.close();
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
