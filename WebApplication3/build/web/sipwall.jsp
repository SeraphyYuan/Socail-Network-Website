<%-- 
    Document   : sipwall
    Created on : 2012-3-17, 15:26:12
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
        <h1>SIP WALL</h1>
        
          <form name="wall" action="Servletsippost" method="post">

  PostContent:
  <INPUT TYPE="TEXT" NAME="postcontent" id="postcontent"><BR>
  <INPUT TYPE="SUBMIT" VALUE="Post"><BR>
  </form>
        
        
   <form name="wall" action="Servletsipcomment" method="post">
  
  CommentContent:
  <INPUT TYPE="TEXT" NAME="commentcontent" id="commentcontent"><BR>
 <INPUT TYPE="SUBMIT" VALUE="Comment">
</form>
    </body>
</html>
