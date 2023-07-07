<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Bootstrap demo</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ"
	crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<h1>Products info</h1>
		<hr>
		<p style="color: blue;">${msg}</p>
		<form:form action="save" modelAttribute="search" method="post">
			<table>
				<tr>
					<td>Name :</td>
					<td><form:input path="name" /></td>
				</tr>
				<tr>
					<td>Price :</td>
					<td><form:input path="price" /></td>
				<tr>
					<td>Quantity :</td>
					<td><form:input path="quantity" /></td>
				</tr>
				<tr>
					<td><input type="submit" value="Save"
						class="btn btn-primary btn-sm" /></td>
						<td><a href="load">Show records</a></td>
				</tr>
			</table>
		</form:form>
	</div>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe"
		crossorigin="anonymous"></script>
</body>
</html>