<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit To Do Activity</title>
</head>
<body>
	<h1>Edit Book Form</h1>
	<c:url var="formAction" value="/todo/update" />
	<form:form modelAttribute="todo" action="${formAction}" method="post">
		<fieldset>
			<legend>Edit a To Do</legend>
			<form:hidden path="id" />
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
			<label for="starMeter">Star Meter: </label>
			<form:input id="starMeter" path="starMeter"/>
		</p>
			<p id="buttons">
				<input id="reset" type="reset" tabindex="4"> <input
					id="submit" type="submit" tabindex="5" value="Update To Do">
			</p>
		</fieldset>
	</form:form>
	</div>
</body>
</html>