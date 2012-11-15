<%-- 
    Document   : message
    Created on : 2012-3-17, 16:22:35
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
        <h1>MessageWall</h1>
         <form name="MessageWall" action="Servletmessage" method="post">
 MessageID:
 <INPUT TYPE="TEXT" NAME="id" id="id"><BR>
  MessageContent:
  <INPUT TYPE="TEXT" NAME="content" id="content"><BR>
   MessageReceiver:
  <INPUT TYPE="TEXT" NAME="receiver" id="receive"><BR>
  <INPUT TYPE="SUBMIT" VALUE="Send"><BR>
  </form>
    </body>
</html>
