<%-- 
    Document   : commentdisplay
    Created on : 2012-3-20, 16:20:15
    Author     : mengli
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Comment Page</title>
    </head>
    <body>
        <h1>CommentDisplay</h1>
        <%
                String hostemail=(String)request.getAttribute("hostemail");
                String postid=(String)request.getAttribute("postid");
                String commentid=(String)request.getAttribute("commentid");
                String commentdate=(String)request.getAttribute("commentdate");
                String commentcontent=(String)request.getAttribute("commentcontent");
                String commenter=(String)request.getAttribute("commenteremail");
               
               out.println("Wallowner:"+hostemail);
                out.println("postid:"+postid);
                out.println("commentid:"+commentid);
                out.println("commenter:"+commenter);
                out.println("commentdate:"+commentdate);
                out.println("content:"+commentcontent);
        %>
    </body>
</html>
