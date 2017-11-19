<%--
  Created by IntelliJ IDEA.
  User: linlin
  Date: 2017/8/7
  Time: 17:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>添加图书</h2>
<form action="/BookServlet" method="post">
    图书名称：<input name="bookName"/>
    图书价格：<input name="bookPrice"/>
    <input name="添加" type="submit"/>
</form>

</body>
</html>
