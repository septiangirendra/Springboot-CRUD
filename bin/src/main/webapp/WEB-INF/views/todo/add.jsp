<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add a To Do</title>
</head>
<body>
	<h1>Add Book Form</h1>
	<form:form modelAttribute="todo" action="save" method= "post"> 
	<fieldset>
		<legend>Add a To Do Activities</legend>
		<p>
			<label for="user">User: </label>
			<form:input id="user" path="user" />
		</p>
		<p>
			<label for="description">Description: </label>
			<form:input id="description" path="description" />
		</p>
		<p>
			<label for="targetDate">Target Dater: </label>
			<form:input id="targetDate" path="targetDate"/>
		</p>
		<p>
			<label for="starMeter">Start Meter: </label>
			<form:input id="starMeter" path="starMeter"/>
		</p>
		<p id="button"><input type="reset" id="reset" tabindex="4"/><input type="submit" id="submit" tabindex="5" value="Add To Do"/></p>
	</fieldset>
	</form:form>
</body>
</html>