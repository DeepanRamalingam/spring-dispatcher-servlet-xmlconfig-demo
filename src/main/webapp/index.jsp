<%@ page language="java"
    contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>Index Page</title>
</head>
<body>
<h2>Hello Deepan!</h2>
<a href="/xmlconfig/home">Go to home</a>
<a href="/xmlconfig/info">Go to info</a>

<form action="/xmlconfig/process" method="get">
<input type="text" name="t1"> <br>
<input type="text" name="t2"> <br>
<input type="submit" value="Submit">
</form> <br>

<form action="/xmlconfig/post/process" method="post" modelAttribute="user">
<input type="text" name="name"> <br>
<input type="text" name="position"> <br>
<input type="submit" value="Submit">
</form>
</body>
</html>
