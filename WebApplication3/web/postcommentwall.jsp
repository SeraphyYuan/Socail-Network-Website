<%-- 
    Document   : wall
    Created on : 2012-3-16, 21:49:45
    Author     : mengli
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>WALL Page</title>
    </head>
    <body>
        <h1>Post and Comment</h1>
  <form name="wall" action="Servletpost" method="post">

  PostContent:
  <INPUT TYPE="TEXT" NAME="postcontent" id="postcontent"><BR>
  <INPUT TYPE="SUBMIT" VALUE="Post"><BR>
  </form>
        
        
        
   <form name="wall" action="Servletcomment" method="post">
  
  CommentContent:
  <INPUT TYPE="TEXT" NAME="commentcontent" id="commentcontent"><BR>
 <INPUT TYPE="SUBMIT" VALUE="Comment">
</form>
    </body>
</html>
