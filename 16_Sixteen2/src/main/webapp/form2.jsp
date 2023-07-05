<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
</head>
<body bgcolor="lightgreen">
		<h1 style="color:blue; text-align:center">PRODUCT INFORMATION DETAILS</h1>
	<center>
		<form method="post" action="./second">
	     
      	<h2 style='color: blue; text-align:center;'> WELCOME :: ${param.uname}</h2>
		 	

   	
		
			<table>
			
				<tr>
					<th>BRAND</th>
					<td><input type='text' name='pbrand' /></td>
				</tr>
				<tr>
					<th>QUANTITY</th>
					<td><input type='text' name='pqty' /></td>
				</tr>
				<tr>
					<th></th>
					<td><input type='submit' value="submit"/></td>
				</tr>
		
			</table>
	</center>
</body>
</html>