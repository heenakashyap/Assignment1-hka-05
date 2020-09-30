<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>Please enter the below details</h1>
	<form action="/assignment/submit" method="POST">

		<table width="50%">
			<tr>
				<td>First Name:</td>
				<td><input type="text" name="firstName"></td>
			</tr>

			<tr>
				<td>Last Name:</td>
				<td><input type="text" name="lastName"></td>
			</tr>

			<tr>
				<td>age:</td>
				<td><input type="text" name="age"></td>
			</tr>

			<tr>
				<td>First Number:</td>
				<td><input type="text" name="property1"></td>
			</tr>

			<tr>
				<td>Second Number:</td>
				<td><input type="text" name="property2" /></td>
			</tr>
		</table>

		<input type="submit" value="Submit" />
	</form>
</body>

</html>