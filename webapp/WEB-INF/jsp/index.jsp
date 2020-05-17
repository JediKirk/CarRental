<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <title>Title</title>
</head>
<body>
<form action="/CarRental_war_exploded/cars/car_add" method="post">
    <input name="registeredCarNumber" >
    <input name="engineType">
    <input name="yearOfIssue" >
    <input name="brand" >
    <input name="model">
    <input name="rentalDayPrice" >
    <input name="carClass">
    <button type="submit">Submit</button>
</form>

</body>
</html>
