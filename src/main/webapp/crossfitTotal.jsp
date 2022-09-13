<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Calculate Your CrossFit Total</title>
</head>
<body>
    <h1>CrossFit Total Calculator</h1>
    <form action="getCrossfitTotalServlet" method="post">
    <h2>Enter you values for each of the below movements:</h2>
    <label for="deadlift">Deadlift:</label><br>
    <input type="number" step="0.1"id="deadlift" name="deadlift" value="0"><br><br>
    <label for="backsquat">Back Squat:</label><br>
    <input type="number" step="0.1"id="backsquat" name="backsquat" value="0"><br><br>
    <label for="strictpress">Strict Press:</label><br>
    <input type="number" step= "0.1"id="strictpress" name="strictpress" value="0"><br><br>
    <input type="submit" value="Calculate">
    <input type="reset">
    </form>
</body>
</html>