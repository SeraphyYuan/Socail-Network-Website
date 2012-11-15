<%-- 
    Document   : sip
    Created on : 2012-3-17, 0:50:00
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
        <h1>SIP</h1>
        <form name="SIPFrom" action="Servletsip" method="post">
  SIPName:
  <INPUT TYPE="TEXT" NAME="sipname" id="sipname"><BR>
  SIPId:
  <INPUT TYPE="TEXT" NAME="sipid" id="sipid"><BR>
    Moderators:
    <INPUT TYPE="TEXT" NAME="moderator" id="moderator"><BR>
   Member:
   <INPUT TYPE="TEXT" NAME="member" id="member"><BR>
  <INPUT TYPE="SUBMIT" VALUE="Create">
  </form>
   
        <form name="SIPFrom" action="Servletsipinvite" method="post">
            UserEmail:
            <INPUT TYPE="TEXT" NAME="email" id="email"><BR>
            <INPUT TYPE="SUBMIT" VALUE="Invite">
        </form>
      
        
        
          <form name="SIPFrom" action="Servletsipsearch" method="post">
           SIPId:
            <INPUT TYPE="TEXT" NAME="sipid" id="sipid"><BR>
            <INPUT TYPE="SUBMIT" VALUE="Search">
        </form>
        
         <form name="SIPFrom" action="Servletsipjoin" method="post">
           SIPId:
            <INPUT TYPE="TEXT" NAME="sipid" id="sipid"><BR>
            UserEmail:
              <INPUT TYPE="TEXT" NAME="email" id="email"><BR>
            <INPUT TYPE="SUBMIT" VALUE="Join">
        </form>
        
     <form action="sipwall.jsp" >
	<table>
		<tr>
			<td><input type="submit" value="SIPWALL"></td>
		</tr>
	</table>
</form>
    </body>
</html>
