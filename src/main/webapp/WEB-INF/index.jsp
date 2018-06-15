<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Home Page</title>
</head>
<body>
	<form method = "POST" action="/submit">
	Your Name: <input type = text name = "name"><br>
	Location: <select name = "location">
  <option value="sanjose">San Jose</option>
  <option value="burbank">Burbank</option>
  <option value="seattle">Seattle</option>
</select><br>
		Favorite Language: <select name = "language">
  <option value="python">Python</option>
  <option value="java">Java</option>
  <option value="mean">MEAN</option>
</select><br>
	Comment(optional):<textarea name = "comment"></textarea><br>
	<input type = submit value = "Submit">
	</form>
	
</body>
</html>