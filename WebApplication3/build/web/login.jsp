<%-- 
    Document   : index
    Created on : Mar 13, 2012, 2:38:04 PM
    Author     : mengli
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Interface</title>
    </head>
    <body>
<form name="loginForm" action="Servletlogin" method="post">
  Email:
  <INPUT TYPE="TEXT" NAME="emailaddr"><BR>
  Password:
  <INPUT TYPE="TEXT" NAME="password"><BR>
  <INPUT TYPE="SUBMIT" VALUE="Sign in">
</form>
        
  <form action="signup.jsp">
  <button>sign up</button>
  </form>
    </body>
</html>