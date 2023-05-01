<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding = "ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Help Page</title>
</head>
<body>
<%
    String name = (String)request.getAttribute("name");
    Integer rollno = (Integer) request.getAttribute("rollno");
    LocalDateTime time =(LocalDateTime)request.getAttribute("time");
%>
<h2>This is my name <%= name%></h2>
<h2>This is help page</h2>
<h2>my rollno is <%=rollno%></h2>
<h1>Date and Time is <%= time.toString()%></h1>
</body>
</html>
