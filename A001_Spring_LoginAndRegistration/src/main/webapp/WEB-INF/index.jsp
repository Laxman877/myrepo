<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
</head>
<body>
<%
 String user=(String)session.getAttribute("user");
%>
	<table>
		<tr>
			<td><%
		 
     	if(user == null)
     	{ %>
     		 <a href="userlogin">Login</a>
     	<%}
     	else
     	{ %>
     		Welcome , <%=user%> <a href="userLogout">Logout</a>
     	<%}
     
		%></td>
			<td><a href="userreg">Register</a></td>
		</tr>
		
	</table>
</body>
</html>