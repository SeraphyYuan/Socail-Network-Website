<%-- 
    Document   : circle
    Created on : 2012-3-15, 11:21:31
    Author     : mengli
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Circle</title>
    </head>
    <body>
        <h1>Circle Interface</h1>
 <form name="creatcircleFrom" action="Servletcircle" method="post">
  CircleName:
  <INPUT TYPE="TEXT" NAME="circlename" id="circlename"><BR>
  CircleId:
  <INPUT TYPE="TEXT" NAME="circleid" id="circleid"><BR>
    Owner:
    <INPUT TYPE="TEXT" NAME="owner" id="owener"><BR>
   CircleMember:
   <INPUT TYPE="TEXT" NAME="circlemember" id="circlemember"><BR>
  <INPUT TYPE="SUBMIT" VALUE="Create">
  </form>
        
        
        
   <form name="creatcircleFrom" action="Servletcircledelete" method="post">
        CircleId:
  <INPUT TYPE="TEXT" NAME="circleid" id="circleid"><BR>
    <INPUT TYPE="SUBMIT" VALUE="Delete">
    
    
    
</form>
   <form name="Servletcircleinvite" action="Servletcircleinvite" method="post">
     FriendEmail:
  <INPUT TYPE="TEXT" NAME="friendemail" id="friendemail"><BR>
   CircleID:
  <INPUT TYPE="TEXT" NAME="circleid" id="circleid"><BR>
    <INPUT TYPE="SUBMIT" VALUE="Invite ">
</form>
        
        
        
  <form name="creatcircleFrom" action="Servletcircleremove" method="post">
     FriendEmail:
  <INPUT TYPE="TEXT" NAME="friendemail" id="friendemail"><BR>
   CircleID:
  <INPUT TYPE="TEXT" NAME="circleid" id="circleid"><BR>
    <INPUT TYPE="SUBMIT" VALUE="Remove ">
</form>
    </body>
</html>
