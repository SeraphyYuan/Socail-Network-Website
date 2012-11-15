<%-- 
    Document   : advertisement
    Created on : 2012-3-17, 19:39:12
    Author     : mengli
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Advertisement</title>
    </head>
    <body>
        <h1>Advertisement</h1>
        <form name="AdvertisementFrom" action="Servletadvcreate" method="post">
        AdvertisementID:
  <INPUT TYPE="TEXT" NAME="advid" id="advid"><BR>
   AdvertisementType:
  <INPUT TYPE="TEXT" NAME="type" id="type"><BR>
   Company:
  <INPUT TYPE="TEXT" NAME="company" id="company"><BR>
    ItemName:
  <INPUT TYPE="TEXT" NAME="itemname" id="itemname"><BR>
    Price:
  <INPUT TYPE="TEXT" NAME="price" id="price"><BR>
    AvailabeNum:
  <INPUT TYPE="TEXT" NAME="num" id="num"><BR>
    <INPUT TYPE="SUBMIT" VALUE="Create"><BR>
    </form>
        
        <form name="AdvertisementFrom" action="Servletadvdelete" method="post">
        AdvertisementID:
  <INPUT TYPE="TEXT" NAME="advid" id="advid"><BR>
    <INPUT TYPE="SUBMIT" VALUE="Delete">
        </form>
        
        
    <form name="ItemReportForm"action="Servletlisting" method="post">
    AdvID:
  <INPUT TYPE="TEXT" NAME="itemid" id="itemid"><BR>
    <INPUT TYPE="SUBMIT" VALUE="ItemListing">
</form>
        
              
    <form name="RevenueForm"action="Servletincome"  method="post">
	 AdvID:
  <INPUT TYPE="TEXT" NAME="advid" id="advid"><BR>
    <INPUT TYPE="SUBMIT" VALUE="RevenueReport">
</form>
        
        <form name="TransactionForm"action="Servlettransaction"  method="post">
	 TransactionID:
  <INPUT TYPE="TEXT" NAME="dealid" id="dealid"><BR>
    <INPUT TYPE="SUBMIT" VALUE="TransactionReport">
</form>
        
       
    </body>
</html>
