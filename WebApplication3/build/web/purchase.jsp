<%-- 
    Document   : purchase
    Created on : 2012-3-17, 18:22:50
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
        <h1>Purchase Wall</h1>
                <form name="PurchaseWall" action="Servletpurchase" method="post">
 ADVID:
 <INPUT TYPE="TEXT" NAME="itemid" id="id"><BR>
  Number:
  <INPUT TYPE="TEXT" NAME="number" id="number"><BR>
  <INPUT TYPE="SUBMIT" VALUE="Submit"><BR>
  </form>
    </body>
</html>
