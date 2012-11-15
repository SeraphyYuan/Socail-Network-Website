<%-- 
    Document   : signup
    Created on : Mar 13, 2012, 4:03:53 PM
    Author     : mengli
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Signup Page</title>
    </head>
    <body>
        <form name = "signupForm" action = "Servletsignup" method="post">
       
	<table>
		<tr>
			<td>Email<input type="text" name="email" id="email"><td/>
		<tr/>
		<tr>
                                            <td>Password<input type="password" name="password" id="password"><td/>
		<tr/>
		<tr>
                    <td>FirstName<input type="text" name="FirstName" id="FirstName"><td/>
                </tr>
                <tr>
                    <td>LastName<input type="text" name="LastName" id="LastName"><td/>
		<tr/>
                                        <tr>
                                                <td>DOB<input type="text" name="DOB" id="DOB"><td/>
		<tr/>
		<tr>
                                                <td>HomeAddress<input type="text" name="HomeAddress" id="HomeAddress"><td/>
                                        </tr>
                                        
                                        <tr>
                                                    <td>Telephone<input type="text" id="Telephone"><td/>
		<tr/>
		
		<tr>
                                                    <td>Preferences<input type="text"  id="Preferences"><td/>
		<tr/>
		
		<tr>
			<td><input type="submit"  value="Submit"><td/>
		<tr/>
	</table>
	</form>
       
    </body>
</html>
