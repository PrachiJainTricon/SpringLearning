<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding = "ISO-8859-1"%>

<%@ page import="com.spring.mvc.*, java.util.*, java.io.* , java.time.*" %>
<%@ page isELIgnored = "false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Help Page</title>
</head>
<body>
    <%
        /*String name = (String)request.getAttribute("name");
        Integer rollno = (Integer) request.getAttribute("rollno");
        LocalDateTime time =(LocalDateTime)request.getAttribute("time"); */
    %>
    <!--<h2>This is my name <%--<%= name%> --%></h2> -->
    <h2>This is help page</h2>
   <!-- <h2>my rollno is <%-- <%=rollno%> --%></h2> -->
   <!-- <h2>Date and Time is <%-- <%= time.toString()%> --%></h2> -->

   <h1>Jsp expression to print value directly</h1>
   <h2>This is my name ${name}</h2>
   <h2>This is my rollno ${rollno}</h2>
   <h2>This is Date and Time ${time} </h2>

   <hr>
   <h1>collection using jsp expression</h1>

   <h2>collection traversing using jsp expression</h2>
   <c:forEach var="item" items="${marks}">
       <!-- <h3>${item}</h3> -->

       <h3><c:out value="${item}"></c:out></h3>

   </c:forEach>

    <h1>
</body>
</html>
