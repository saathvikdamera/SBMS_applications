<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>Book Details</h3>
<form action = "book" method="get">
Book Id :<input type="text" name="id">
<input type="submit" value="search">
</form>
<hr>
Book Id : ${book.bookId} <br>
Book Name : ${book.bookName} <br>
Book Price : ${book.price} <br>
</body>
</html>