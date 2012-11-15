<%-- 
    Document   : postdisplay
    Created on : 2012-3-20, 10:49:21
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
        <h1>PostDisplay</h1>
        <form>
        <%
        

       String owner = (String)request.getAttribute("hostemail");
       String postid = (String)request.getAttribute("postid_list");
        ArrayList postdatelist=(ArrayList)request.getAttribute("postdate_list");
        ArrayList postcontentlist=(ArrayList)request.getAttribute("postcontent_list");
     
                            out.println("Wallowner:"+owner);
                            out.println("postid:"+postid);
                            out.println("         Postdate:"+postdatelist);
                            out.println("         Postcontent:"+postcontentlist.get(0));
                        
        %>
        </form>
    </body>
</html>
