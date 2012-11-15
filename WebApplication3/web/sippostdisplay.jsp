<%-- 
    Document   : sippostdisplay
    Created on : 2012-3-20, 16:50:27
    Author     : mengli
--%>

<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>SIPPOST DISPLAY!</h1>
         <%
        

       String owner = (String)request.getAttribute("hostemail");
       String postid = (String)request.getAttribute("postid_list");
        ArrayList postdatelist=(ArrayList)request.getAttribute("postdate_list");
        ArrayList postcontentlist=(ArrayList)request.getAttribute("postcontent_list");
     
                            out.println("Wallowner:"+owner);
                            out.println("postid:"+postid);
                            out.println("         Postdate:"+postdatelist.get(0));
                            out.println("         Postcontent:"+postcontentlist.get(0));
                        
        %>
    </body>
</html>
