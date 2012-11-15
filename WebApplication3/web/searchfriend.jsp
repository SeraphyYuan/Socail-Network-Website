<%-- 
    Document   : searchfriend
    Created on : 2012-3-18, 23:49:27
    Author     : mengli
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>FriendSearch</h1>
        
                <form name="FriendSearchFrom" action="Servletsearchfriend" method="post">
       FriendEmail:
  <INPUT TYPE="TEXT" NAME="email" id="email"><BR>
    <INPUT TYPE="SUBMIT" VALUE="Search">
        </form>
    </body>
</html>
