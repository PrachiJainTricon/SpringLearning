<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding = "ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Home Page</title>
</head>
<body>
<h2>This is home page</h2>
<h2>Called by Home controller</h2>
<h2>url /home</h2>
<%
    String name = (String)request.getAttribute("name");
    Integer id = (Integer)request.getAttribute("id");

%>
<h1>My name is <%= name%> </h1>
<h1> My Id is <%= id%></h1>


</body>
</html>
