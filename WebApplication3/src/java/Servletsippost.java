
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.*;
import java.util.ArrayList;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpSession;
@WebServlet(name = "Servletsippost", urlPatterns = {"/Servletsippost"})
public class Servletsippost extends HttpServlet {

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
                                                            HttpSession session = request.getSession();
			response.setContentType("text/html; charset=gbk"); 
                                                            String hostemail=session.getAttribute("hostemail").toString();
			// PrintWriter out = response.getWriter();
                         
                         
                         
			// connect to DB2
			Connection conn = null;
			Class.forName("com.ibm.db2.jcc.DB2Driver");
			String url = "jdbc:db2://Db2serv01.cs.stonybrook.edu:50000/teamdb11:retrieveMessagesFromServerOnGetMessage=true;";
			String user = "cseteam11";
			String pass = "Spring2012";
			conn = DriverManager.getConnection(url,user,pass);
			System.out.println("Connected and working!");
		
			
                                                            
                                                            //DB2 information
                                                             String postid_db="";
                                                             String postdate_db="";
                                                             String postcontent_db="";
                                                           
                                                           
                                                              ArrayList<String> postcontentlist = new ArrayList<String>();
                                                              ArrayList<String>postdatelist=new ArrayList<String>();
                        
                        
			Statement stmt1 = conn.createStatement();
			String query1 = "SELECT * FROM SIPPOST WHERE POSTEREMAIL='"+ hostemail + "' ";
			System.out.println(query1);
			ResultSet rs1 = stmt1.executeQuery(query1);
                                                             while(rs1.next())
                                                             {
                                                                 postid_db=rs1.getString(1);
                                                                 postdate_db=rs1.getString(2);
                                                                 postcontent_db=rs1.getString(3);
                                                                 
                                                            
                                                                 postdatelist.add(""+postdate_db);
                                                                 postcontentlist.add(""+postcontent_db);
                                                                 
                                                                 request.setAttribute("hostemail", hostemail);
                                                                 request.setAttribute("postid_list", postid_db);
                                                                 request.setAttribute("postdate_list", postdatelist);
                                                                 request.setAttribute("postcontent_list", postcontentlist);
                                                                 System.out.println(postid_db);
                                                                 System.out.println(postdate_db);
                                                                 System.out.println(postcontent_db);
                                                                 
                                                               
                                                             }
                                                        
                                                              request.getRequestDispatcher("sippostdisplay.jsp").forward(request,response);
                                                             
                                                             
                                                             
                                                             
                                                           
                                                            
                                                            
                                                           
                                                            
                                                           
                                                               
                                                                
			// close connect
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
