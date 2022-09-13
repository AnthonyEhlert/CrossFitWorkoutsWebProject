<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CrossFit Total Results</title>
</head>
<body>
    <p>Deadlift = ${userCrossfitTotal.getDeadlift()} <br />
    Back Squat = ${userCrossfitTotal.getBackSquat()} <br />
    Strict Press = ${userCrossfitTotal.getStrictPress()} <br />
    <br><br>
    </p>
    <h3>Total = ${userCrossfitTotal.getTotal()}</h3>
    <a href="index.jsp">Go Back To Main Menu</a>
    <br><br>
    <a href="crossfitTotal.jsp">Recalculate Your CrossFit Total</a>
</body>
</html>