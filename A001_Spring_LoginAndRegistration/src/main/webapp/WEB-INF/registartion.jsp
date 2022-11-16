<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration</title>
</head>
<body>
	<form:form action="register" modelAttribute="user" method="post">
		<table align="center">
			<tr>
				<td><form:label path="firstname">FirstName</form:label></td>
				<td><form:input path="firstname" name="firstname" id="firstname" /></td>
				<td><form:label path="lastname">LastName</form:label></td>
				<td><form:input path="lastname" name="lastname" id="lastname" /></td>
				<td><form:label path="email">Email</form:label></td>
				<td><form:input path="email" name="email" id="email" /></td>
				<td><form:label path="address">Address</form:label></td>
				<td><form:input path="address" name="address" id="address" /></td>
				<td><form:label path="password">Password</form:label></td>
				<td><form:input path="password" name="password" id="password" /></td>
				<td><form:label path="phno">Phno</form:label></td>
				<td><form:input path="phno" name="phno" id="phno" /></td>
			</tr>
			<tr>
				<td></td>
				<td><form:button name="register">Register</form:button>
				</td>
			<tr></tr>
			<tr>
                        <td></td>
                        <td><a href="home">Home</a>
                        </td>
                    </tr>
		</table>
	</form:form>
</body>
</html>