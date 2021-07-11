<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bonusberechnung</title>
</head>
<body>
<body>
	<h1>Bonusberechnung</h1>
	<form action="helloServlet" method="post">
		

		<table style="with: 50%">

			<tr>
				<td>Name eingeben</td>
				<td><input type="text" name="yourName" size="20"></td>
			</tr>
			<tr>
				<td>Jahr</td>
				<td><input type="text" name="Jahr" /></td>
			</tr>
			<tr>
				<td>Gehalt</td>
				<td><input type="text" name="Gehalt" /></td>
			</tr>
		</table>
		<input type="submit" value="Bonus berechnen" />
	</form>
</body>
</body>
</html>