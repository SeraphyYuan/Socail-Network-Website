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
@WebServlet(name = "Servletsipjoin", urlPatterns = {"/Servletsipjoin"})
public class Servletsipjoin extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        try
        {
            // JSP information
            response.setContentType("text/html; charset=gbk"); 
            String sipid = request.getParameter("sipid");
            String useremail=request.getParameter("email");
            
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
          
          
            
            String query1= "select * from NEWSIP  WHERE SIPID='"+sipid+"'";
        //     String query1="SELECT * FROM FRIENDTABLE WHERE FRIENDEMAIL='" + friendemail + "'";
        
           
            System.out.println(query1);
            ResultSet rs = stmt.executeQuery(query1);
            if(rs.getRow()!=0)
            {
                System.out.println(rs.getRow());
                 String sql = "insert into MEMBERSIP values (?,?)";
                PreparedStatement pst = conn.prepareStatement(sql);
                pst.setString(1, useremail);
                pst.setString(2, sipid);
                
            }
            if(rs.getRow()==0)
            {
                System.out.println(rs.getRow());
                System.out.println("no such sip");
                response.sendRedirect("sip.jsp");
                System.out.println();
            }
           
                                                            
                            
            
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

