<%-- 
    Document   : messagedisplay
    Created on : 2012-3-21, 13:12:29
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
        <h1>Message Display!</h1>
        <%
String sender=(String)request.getAttribute("sender");
String content=(String)request.getAttribute("content");
String date=(String)request.getAttribute("date");
String receiver=(String)request.getAttribute("receiver");

out.println("Sender:"+sender);
out.println("Content:"+content);
out.println("Date"+date);
out.println("Receiver:"+receiver);
%>
    </body>
</html>
