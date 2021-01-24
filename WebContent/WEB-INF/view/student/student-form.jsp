<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Registration Form</title>
</head>
<body>
	<form:form action="processForm" modelAttribute="student">
		First NAme:<form:input path="firstName"
			placeholder="What's your Name?" />
		<br />
		<br />
		Last NAme:<form:input path="lastName" placeholder="What's your Name?" />
		<br />
		<br />
		Country:<form:select path="country">
			<form:options items="${theCountryOptions }" />
			<br />
			<br />

		</form:select>
		Operating system: Linux <form:checkbox path="operatingSystems"
			value="Linux" />
		Ms Windows <form:checkbox path="operatingSystems" value="Windows" />
		Mac <form:checkbox path="operatingSystems" value="Mac" />

		<input type="submit" value="Go">
	</form:form>
</body>
</html>