<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="<c:url value="/resources/css/style.css" />" rel="stylesheet">
<title>To Do List</title>
</head>
<body>
	<h3>To Do List</h3>
	<form action="AddChore" method="post">
	<table border=1>
	<c:forEach items="${chores}" var="chore" varStatus="status">
	<c:if test="${!chore.complete }">
	<tr>
		<td>${chore.chore }</td>
		<td>${chore.date}</td>
		<td>
			<a href="RemoveChore?index=${status.index}"><img src="images/delete.png"></img></a>
		</td>
	</tr>
	</c:if>
	</c:forEach>
	<tr><td><input type="text" name="newChore" /></td>
		<td><input type="submit" name="submit" value="Add" /></td></tr>
	</table>
	<h3>Completed Tasks</h3>
	<table border = 1>
	<c:forEach items="${chores }" var="chore" varStatus="status">
		<c:if test="${chore.complete }">
			<tr>
				<td>${chore.chore}</td>
				<td>${chore.date}</td>
			</tr>
		</c:if>
	</c:forEach>
	</table>
	
	</form>
</body>
</html>