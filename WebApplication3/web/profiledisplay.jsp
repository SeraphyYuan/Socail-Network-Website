<%-- 
    Document   : profiledisplay
    Created on : 2012-3-20, 17:37:24
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
        <h1>Profile Display</h1>
        
        <%
    String firstname=(String)request.getAttribute("firstname");
    String lastname=(String)request.getAttribute("lastname");
    String email=(String)request.getAttribute("email");
    String birthday=(String)request.getAttribute("birthday");
    String homeadd=(String)request.getAttribute("homeadd");
    String cellnum=(String)request.getAttribute("cell");
    String preferences=(String)request.getAttribute("preference");
    
out.println("Firstname:"+firstname);
out.println("Lastname:"+lastname);
out.println("Email:"+email);
out.println("Birthday:"+birthday);
out.println("HomeAddress:"+homeadd);
out.println("CellNumber:"+cellnum);
out.println("Preferences:"+preferences);
%>
    </body>
</html>
