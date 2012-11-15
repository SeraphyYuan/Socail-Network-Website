<%-- 
    Document   : userpage
    Created on : 2012-3-14, 20:38:13
    Author     : mengli
--%>

<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>User Page</title>
    </head>
    <body>
        <h1>Welcome to socail network!</h1>
            
  <form action="login.jsp">
	<table>
      <tr>
       <td><button>Log out</button><td/>
      </tr>
  	</table>
   </form>
 
      <form name="friendsearchForm" action="searchfriend.jsp" >
	<table>
		<tr>
			<td><input type="submit" value="SearchFriend"></td>
		</tr>
	</table>
</form>  
        
<form action="circle.jsp" >
	<table>
		<tr>
			<td><input type="submit" value="Circle"></td>
		</tr>
	</table>
</form>
<form name="profileForm" action="Servletprofile" method="post">
	<table>
		<tr>
			<td><input type="submit" value="ProfilePage"></td>
		</tr>
	</table>
</form>
  <form name="WallForm" action="postcommentwall.jsp" >
	<table>
		<tr>
			<td><input type="submit" value="PostWall"></td>
		</tr>
	</table>
</form>
      
  <form name="SIPForm" action="sip.jsp" >
	<table>
		<tr>
			<td><input type="submit" value="SIP"></td>
		</tr>
	</table>
</form>
        
         <form name="MessageForm" action="message.jsp" >
	<table>
		<tr>
			<td><input type="submit" value="Message"></td>
		</tr>
	</table>
</form>
        
<form name="PurchaseForm" action="purchase.jsp" >
	<table>
		<tr>
			<td><input type="submit" value="Purchase"></td>
		</tr>
	</table>
</form>
        
       
        
<form name="AdvertisementForm" action="advertisement.jsp" >
	<table>
		<tr>
			<td><input type="submit" value="Advertisement"></td>
		</tr>
	</table>
</form>
    </body>
</html>
