</head>

<body>

	<h2>create task</h2>

	<form action="/Todolist/list" method="post">
		<table>
			<tr>
				<!-- column one  -->
				<td>id :</td>
				<!-- column two -->
				<td><input type="number" name="id"
					value="${ user.id}"></td>
				<td><p style="color: red;">${ id }</p></td>
			</tr>

			<tr>
				<!-- column one  -->
				<td>user :</td>
				<!-- column two -->
				<td><input type="text" name="user" value="${ user.user}"></td>
				<td><p style="color: red;">${ user }</p></td>
			</tr>

			<tr>
				<!-- column one  -->
				<td>description :</td>
				<!-- column two -->
				<td><input type="text" name="description" value="${ user.description}"></td>
				<td><p style="color: red;">${ description }</p></td>
			</tr>

						<tr>
				<td><input type="submit" value="click me"></td>
			</tr>

		</table>

	</form>
</body>
</html>
			