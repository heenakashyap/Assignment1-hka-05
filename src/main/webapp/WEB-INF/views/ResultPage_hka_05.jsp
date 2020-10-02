<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ page import="java.util.*"%>
<%@ page import="com.csis3275.assignment_1_hka_05.models.*"%>

<%!Integer additionResult = 0;%>
<%!Double increment = 0.0;%>
<%!String fullName = "";%>
<%!String age = "";%>
<%!String interfaceMethod1 = "";%>
<%!String interfaceMethod2 = "";%>
<%!String errorMessage = "No Error";%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Assignment page 2</title>

<style>
table, th, td {
	border: 1px solid black;
	border-collapse: collapse;
}

th, td {
	padding: 5px;
	text-align: left;
}

tr:nth-child(even) {
	background-color: #dddddd;
}
</style>

</head>
<body>

	<h1>Result</h1>

	<%
		Object childClass2 = request.getAttribute("childClass2");
			if (childClass2 != null) {
		System.out.println("Child class 2 instance received in jsp is not null");
		ChildClass2_hka_05 temp = (ChildClass2_hka_05) childClass2;
		fullName = temp.getFullName();
		age = temp.getAge();
		additionResult = temp.add();
		increment = temp.salaryChange();
		interfaceMethod1 = temp.method1();
		interfaceMethod2 = temp.method2();
		errorMessage = temp.getErrorMessage();
			}
	%>

	<table style="width: 50%">
		<tr>
			<th>Name</th>
			<th>Age</th>
		</tr>
		<tr>
			<td><%=fullName%></td>
			<td><%=age%></td>
		</tr>

	</table>

	<p>
		<b>Multiply and addition and interface method result can be found
			below</b>
	</p>

	<table style="width: 50%">
		<tr>
			<td>Total Salary of both years</td>
			<td><%=additionResult%></td>
		</tr>
		<tr>
			<td>Salary Change in percentage</td>
			<td><%=increment%> %</td>
		</tr>
		<tr>
			<td>Interface Method 1</td>
			<td><%=interfaceMethod1%></td>
		</tr>
		<tr>
			<td>Interface Method 1</td>
			<td><%=interfaceMethod2%></td>
		</tr>

		<tr>
			<td>Error Message</td>
			<td><%=errorMessage%></td>
		</tr>


	</table>

</body>





</html>