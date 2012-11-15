<%-- 
    Document   : purchasedisplay
    Created on : 2012-3-21, 13:31:59
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
        <h1>Purchase Display!</h1>
        <h3>Purchase Successful!</h3>
        <% String item=(String)request.getAttribute("itemid");
        String date=(String)request.getAttribute("date");
        String number=(String)request.getAttribute("num");
        String dealer=(String)request.getAttribute("dealer");
        out.println("Dealer:"+dealer);
        out.println("Itemid:"+item);
        out.print("Number:"+number);
        out.print("Date:"+date);
                %>
    </body>
</html>
