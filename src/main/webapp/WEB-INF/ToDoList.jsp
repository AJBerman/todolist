<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>To Do List</title>
</head>
<body>
	<h3>To Do List</h3>
	<form action="AddChore" method="post">
	<table border=1>
	<c:forEach items="${chores}" var="chore" varStatus="status">
	<tr>
		<td><c:if test="${!chore.complete }"> ${chore.chore} </c:if>
			<c:if test="${chore.complete }" > <strike> ${chore.chore }</strike> </c:if>
		</td>
		<td>${chore.date}</td>
		<td>
			<c:if test="${!chore.complete}" >
			<a href="RemoveChore?index=${status.index}">X</a>
			</c:if>
		</td>
	</tr>
	</c:forEach>
	<tr><td><input type="text" name="newChore" /></td>
		<td><input type="submit" name="submit" value="Add" /></td></tr>
	</table>
	</form>
</body>
</html>