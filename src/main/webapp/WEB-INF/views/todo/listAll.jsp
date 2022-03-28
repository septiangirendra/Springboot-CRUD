<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>Document</title>
</head>
<body>
	<h1>To Do List</h1> 
	<a href='<c:url value="add"/>'>Add To Do</a> 
	<table border=1>
		<tr>
			<th>ID</th>
			<th>User</th>
			<th>Description</th>
			<th>Target Date</th>
			<th>Star Meter</th>
			<th>&nbsp;</th>
			<th>&nbsp;</th>
		</tr>
		<c:forEach items="${todos}" var="todo"> 
		<tr>
			<td>${todo.id}</td>
			<td>${todo.user}</td>
			<td>${todo.description}</td>
			<td>${todo.targetDate}</td>
			<td>${todo.starMeter}</td>
			<td><a type="button" class="btn btn-success" href="edit/${todo.id}">Edit</a></td>
			<td><a type="button" class="btn btn-warning" href="delete/${todo.id}">Delete</a></td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>
