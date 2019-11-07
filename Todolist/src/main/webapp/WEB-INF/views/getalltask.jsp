<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>   
<html>
<head>
<style>
table {
	font-family: arial, sans-serif;
	border-collapse: collapse;
	width: 100%;
}

button {
	font-family: arial, sans-serif;
	border-collapse: collapse;
	width: 100%;
	color: white;
	background: maroon;
}

td, th {
	border: 1px solid #dddddd;
	text-align: left;
	padding: 8px;
}

tr:nth-child(even) {
	background-color: #dddddd;
}
</style>

</head>
<body>
	<h2> details</h2>
	<table border="1">
		<thead>
			<tr>
				<th> id</th>
				<th>user</th>
				<th>description</th>
				<th>delete</th>
			</tr>
		</thead>

		<tbody>
			<c:forEach items="${data}" var="task">
				<tr>
					<%-- <td><a href="/Todolist/user/updateUser?userId=${user.getId()}"><c:out value="${user.getId()}" /></a></td> --%>
					<td><c:out value="${user.getId()}" /></td>
					<td><c:out value="${user.getuser()}" /></td>
					<td><c:out value="${user.getdescription()}" /></td>
					<!-- button as a link  -->
					<td><button
							onclick="window.location.href='/Todolist/user/deletetask?id=${user.getId()'"
							value="delete">delete</button></td>
				</tr>
			</c:forEach>

		</tbody>
	</table>

</body>
</html>