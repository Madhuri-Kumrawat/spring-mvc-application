<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Registration Form</title>
<style>
.error {
	color: red
}
</style>
</head>
<body>
	Fill Out the Form
	<form:form action="processForm" modelAttribute="customer">
		First NAme:<form:input path="firstName"
			placeholder="What's your Name?" />
		<br />
		<br />
		Last NAme (*):<form:input path="lastName"
			placeholder="What's your Name?" />
		<form:errors path="lastName" cssClass="error" />
		<br /><br />
		Free PAsses :<form:input path="freePasses" />
		<form:errors path="freePasses" cssClass="error" />
		<br /><br />
		Postal Code :<form:input path="postalCode" />
		<form:errors path="postalCode" cssClass="error" />
		<br />
		<br />
		Course Code :<form:input path="courseCode" />
		<form:errors path="courseCode" cssClass="error" />
		<br />
		<input type="submit" value="Go">
	</form:form>
</body>
</html>