<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="counter" class="Obj.Counter" scope="page"></jsp:useBean>
<html>
<head>
    <title>Title</title>
</head>
<body>
<% counter.increaseCount(); %>
    <p>You are visitor number <%= counter.getCount()%></p>
</body>
</html>