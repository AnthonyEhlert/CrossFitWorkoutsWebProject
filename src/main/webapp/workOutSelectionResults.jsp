<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Generated Workout</title>
</head>
<body>
    <p>You selected a <strong>${userWorkOut.getWorkOutType()}</strong> work out <br /> <br />
    </p>
    <h3> Here is your randomly generated work out:</h3><br>
    <p>
        Movement 1 = ${userWorkOut.getMovement1()}<br><br>
        Movement 2 = ${userWorkOut.getMovement2()}<br><br>
        Movement 3 = ${userWorkOut.getMovement3()}<br><br>
    </p>
    <a href="index.jsp">Go Back To Main Menu</a>
    <br><br>
    <a href="workOutSelection.jsp">Choose a Different Type of Work Out</a>
</body>
</html>