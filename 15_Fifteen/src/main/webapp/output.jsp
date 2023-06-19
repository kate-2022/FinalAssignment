<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix='c'%>  

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Output</title>
</head>
	<body bgcolor='lightgreen'>		
	<br/>
	<br/>
	<br/>
	<c:choose>
		 <c:when test= "${result ne null||! empty result}">
				<table border='1' align= "center">
					<caption>STUDENT RECORD</caption>			
						<tr>
						<th>ID</th>
						<th>NAME</th>
						<th>AGE</th>
						<th>ADRESS</th>
						</tr>				
						<tr>
							<td>${result.sid}</td>
							<td>${result.sname}</td>
							<td>${result.sage}</td>
							<td>${result.saddress}</td>
						</tr>
					
				</table>
			
 		 </c:when>
 		 <c:otherwise>
 		 	<h1 style='color:red; text-align: center;'>No Record to display</h1>
 		 </c:otherwise>
   </c:choose>	
	</body>
</html>