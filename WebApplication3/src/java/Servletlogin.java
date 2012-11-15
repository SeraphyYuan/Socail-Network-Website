
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpSession;
@WebServlet(name = "Servletlogin", urlPatterns = {"/Servletlogin"})
public class Servletlogin extends HttpServlet {

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
			String username = request.getParameter("emailaddr");
			String password = request.getParameter("password");
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
			Statement stmt = conn.createStatement();
			String query = "SELECT * FROM USER WHERE EMAIL='" + username + "'";
			//String query = "SELECT * FROM USERREGISTER WHERE USERNAME='Alice'";
			System.out.println(query);
			ResultSet rs = stmt.executeQuery(query);
			String username_db = "";
			String password_db = "";
			while(rs.next())
			{
				System.out.println("Username_db:" + rs.getString(3).trim()+ "	" + "Password_db:" + rs.getString(4).trim());
				username_db = rs.getString(3).trim();
				password_db = rs.getString(4).trim(); 
			}
			System.out.println("Username:" + username + "	" + "Password:" + password);
			
			// redirect webpage
                                                            HttpSession session = request.getSession();
			if (username.equals(username_db) && password.equals(password_db))
			{
				System.out.println("Login successed!");
				response.sendRedirect("userpage.jsp");
                                                                                session.setAttribute("hostemail", username_db);
                                                                                
			}
			else
			{
				System.out.println("Login failed!");
				response.sendRedirect("userpage.jsp");
			}
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
