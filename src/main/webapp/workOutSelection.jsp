<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CrossFit Work Out Selection</title>
</head>
<body>
    <h1>Work Out Type</h1>
    <p>Please choose the type of work out you would like:<p>
    <form action="getWorkOutServlet" method="post">
        <input type="radio" id="gymnastics" name="user_choice" value="gymnastics">
        <label for="gymnastics">Gymnastics</label><br><br>
        <input type="radio" id="weightlifting" name="user_choice" value="weightlifting">
        <label for="weightlifting">Weightlifting</label><br><br>
        <input type="radio" id="cardio" name="user_choice" value="cardio">
        <label for="cardio">Cardio</label><br><br>
        <input type="submit" value="Submit">
        <input type="reset">
    </form>

</body>
</html>