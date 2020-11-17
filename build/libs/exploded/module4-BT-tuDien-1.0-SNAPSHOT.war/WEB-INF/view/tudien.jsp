<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 17/11/2020
  Time: 9:04 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<p>VN</p>
<p>${requestScope["trans"]}</p> <br>
<p>EN</p>
<p>${requestScope["input"]}</p> <br>

<form action="/posttudien" method="post">
    <input type="text" name="input">
    <input type="submit" value="ok">

</form>
</body>
</html>
