
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
@WebServlet(name = "Servlesipsearch", urlPatterns = {"/Servletsipsearch"})
public class Servletsipsearch extends HttpServlet {

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
			String sipid = request.getParameter("sipid");
			
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
			String query = "SELECT * FROM NEWSIP WHERE SIPID='"+ sipid + "' ";
			
			System.out.println(query);
			ResultSet rs = stmt.executeQuery(query);
                                                            System.out.print(rs.getRow());
			if(rs.getRow()!=0)
			{
                                                                                
				System.out.println("SIPNAME:" + rs.getString(2).trim()+ "	" + "SIPID:" + rs.getString(1).trim());
				
			}
                                                            else
                                                            {
                                                                       System.out.println(sipid+" does not exsit");
                                                                       response.sendRedirect("sip.jsp");
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
