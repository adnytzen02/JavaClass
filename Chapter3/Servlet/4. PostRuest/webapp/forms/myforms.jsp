
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="http://localhost:8080/postBook" method="post" >
    <label>Book Id:</label>
    <input type="number" name="bookId">
    <br>
    <label>Book Name:</label>
    <input type="text" name="name">
    <br>
    <lebel>Price:</lebel>
    <input type="number" name="price">
    <br>
    <lebel>Author:</lebel>
    <input type="text" name="author">
    <br>
    <input type="submit" value="submit">
</form>
</body>
</html>
