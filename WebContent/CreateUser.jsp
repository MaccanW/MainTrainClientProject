<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Skapa Användare</title>
</head>
<body>

	<form action="/MainTrainClientProject/CreateUserServlet" method="post">
		<table>
		<tr>
			<td><input name="userName"> userName </td><br>
			</tr>
			<tr><td><input name="passWord"> passWord </td></tr></td><br>
			<tr><td><input type="submit"></td></tr>
		</table>
	</form>
</body>
</html>