<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="login.jsp">Already a registered User....??</a>
	<form action="registerrequest" method="post">
		<label>UserName</label>
		<input type="text" name="username">
		<br>
		<label>FirstName</label>
		<input type="text" name="firstname">
		<br>
		<label>LastName</label>
		<input type="text" name="lastname">
		<br>
		<label>Email</label>
		<input type="text" name="email">
		<br>
		<label>Password</label>
		<input type="text" name="password">
		<br>
		<fieldset id="sex">
			<label>Gender</label><br>
			<input type="radio" name ="gender" value="m">Male<br>
			<input type="radio" name ="gender" value="f">Female<br>
			<input type="radio" name ="gender" value="o">Other<br>
		</fieldset>
		<fieldset id="tutor">
			<label>Occupation</label><br>
			<input type="radio" name ="tutor1" value="t">Tutor<br>
			<input type="radio" name ="tutor1" value="s">Student<br>
		</fieldset>
		<br>
		<input type="submit" name="submit" value="submit">
	</form>
</body>
</html>