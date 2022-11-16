<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Login</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
	crossorigin="anonymous"></script>
<style type="text/css">
body {
	margin: 0;
	padding: 0;
	background: #DDD;
	font-size: 16px;
	color: #222;
	font-family: 'Roboto', sans-serif;
	font-weight: 300;
}
#login-box {
	position: relative;
	margin: 5% auto;
	width: 600px;
	height: 400px;
	background: #FFF;
	border-radius: 2px;
	box-shadow: 0 2px 4px rgba(0, 0, 0, 0.4);
}
.left {
	position: absolute;
	top: 0;
	left: 0;
	box-sizing: border-box;
	padding: 80px;
	width: 600px;
	height: 400px;
}
h1 {
	margin: 0 0 20px 0;
	font-weight: 300;
	font-size: 28px;
}
input[type="text"], input[type="password"] {
	display: block;
	box-sizing: border-box;
	margin-bottom: 20px;
	padding: 4px;
	width: 220px;
	height: 32px;
	border: none;
	border-bottom: 1px solid #AAA;
	font-family: 'Roboto', sans-serif;
	font-weight: 400;
	font-size: 15px;
	transition: 0.2s ease;
}
input[type="text"]:focus, input[type="password"]:focus {
	border-bottom: 2px solid #16a085;
	color: #16a085;
	transition: 0.2s ease;
}
input[type="submit"] {
	margin-top: 28px;
	width: 120px;
	height: 32px;
	background: #16a085;
	border: none;
	border-radius: 2px;
	color: #FFF;
	font-family: 'Roboto', sans-serif;
	font-weight: 500;
	text-transform: uppercase;
	transition: 0.1s ease;
	cursor: pointer;
}
input[type="submit"]:hover, input[type="submit"]:focus {
	opacity: 0.8;
	box-shadow: 0 2px 4px rgba(0, 0, 0, 0.4);
	transition: 0.1s ease;
}
input[type="submit"]:active {
	opacity: 1;
	box-shadow: 0 1px 2px rgba(0, 0, 0, 0.4);
	transition: 0.1s ease;
}
.or {
	position: absolute;
	top: 180px;
	left: 280px;
	width: 40px;
	height: 40px;
	background: #DDD;
	border-radius: 50%;
	box-shadow: 0 2px 4px rgba(0, 0, 0, 0.4);
	line-height: 40px;
	text-align: center;
}
.right {
	position: absolute;
	top: 0;
	right: 0;
	box-sizing: border-box;
	padding: 40px;
	width: 200px;
	height: 400px;
	background: url('https://goo.gl/YbktSj');
	background-size: cover;
	background-position: center;
	border-radius: 0 2px 2px 0;
}
.right .loginwith {
	display: block;
	margin-bottom: 40px;
	font-size: 28px;
	color: #FFF;
	text-align: center;
}
button.social-signin {
	margin-bottom: 20px;
	width: 220px;
	height: 36px;
	border: none;
	border-radius: 2px;
	color: #FFF;
	font-family: 'Roboto', sans-serif;
	font-weight: 500;
	transition: 0.2s ease;
	cursor: pointer;
}
button.social-signin:hover, button.social-signin:focus {
	box-shadow: 0 2px 4px rgba(0, 0, 0, 0.4);
	transition: 0.2s ease;
}
button.social-signin:active {
	box-shadow: 0 1px 2px rgba(0, 0, 0, 0.4);
	transition: 0.2s ease;
}
button.social-signin.facebook {
	background: #32508E;
}
button.social-signin.twitter {
	background: #55ACEE;
}
button.social-signin.google {
	background: #DD4B39;
}
button.social-login {
	margin-bottom: 20px;
	width: 120px;
	height: 36px;
	border: none;
	border-radius: 4px;
	color: #FFF;
	font-family: 'Roboto', sans-serif;
	font-weight: 500;
	transition: 0.2s ease;
	cursor: pointer;
}
button.social-login.twitter {
	background: #55ACEE;
}
</style>
</head>
<body>

	<div id="login-box">

		<div class="left">
			<h1 align="center">User Profile</h1>
			<ul>
			
				<table>

					<tr>
					<tr>
						<th>UserName</th>
					</tr>
					<tr>
						<td>${dt.getFname()}</td>
					</tr>
					<tr>
						<th>LastName</th>
					</tr>
					<tr>
						<td>${dt.getLname()}</td>
					</tr>
					<tr>
						<th>Email</th>
					</tr>
					<tr>
						<td>${dt.getEmail()}</td>
					</tr>
					</tr>

				</table>

			</ul>
			<a href="home"><input type="button" class="btn btn-primary" data-dismiss="modal"
						value="Cancel"></a>
		</div>

	</div>

</body>
</html>