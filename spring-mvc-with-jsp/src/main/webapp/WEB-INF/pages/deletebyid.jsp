<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
${delete}
<form action="/product/delete" method="post">
<input type="number" name="id">
<input type="submit" value="delete">

</body>
</html>