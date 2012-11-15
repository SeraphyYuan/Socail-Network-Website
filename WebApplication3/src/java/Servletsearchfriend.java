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
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author mengli
 */
@WebServlet(name = "Servletsearchfriend", urlPatterns = {"/Servletsearchfriend"})
public class Servletsearchfriend extends HttpServlet {


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
			String friendemail = request.getParameter("email");
			 PrintWriter out = response.getWriter();
                         
                         
                         
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
			String query1 = "SELECT * FROM FRIENDTABLE WHERE FRIENDEMAIL='"+ friendemail + "' ";
			System.out.println(query1);
			ResultSet rs1 = stmt1.executeQuery(query1);
                                                             rs1.next();
                                                             String friendemail_db=rs1.getString("FRIENDEMAIL");
                                                            System.out.print(rs1.getString("FRIENDEMAIL"));
                                                            
                                                    
                                                                out.println("<html>");
                                                                out.println("<head>");
                                                                out.println("<title>Friend Informaition</title>");            
                                                                out.println("</head>");
                                                                out.println("<body>");
                                                                out.println("<h2>Friendship Report</h2>");
                                                                out.println("<h4>Friend:"+friendemail_db+" is friend of user</h4>");
                                                                out.println("<h4>FriendEmail: " + friendemail_db + "</h4>");
                                                                out.println("</body>");
                                                                out.println("</html>");
                                                        
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
