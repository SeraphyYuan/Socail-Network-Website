/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author mengli
 */
public class dbconnection {
   
	public static Connection getDBconnection()
	{
		Connection conn=null;
		try{
			Class.forName("com.ibm.db2.jcc.DB2Driver");
			String url="jdbc:db2://Db2serv01.cs.stonybrook.edu:50000/teamdb46:retrieveMessagesFromServerOnGetMessage=true;";
			String user="cseteam11";
			String pass="Spring2012";
			conn=DriverManager.getConnection(url,user,pass);
			System.out.println("Connected and working!");
			
		}catch (Exception e){
			
			e.printStackTrace();
		}
		return conn;

	}



}
