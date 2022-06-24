<%--
  Created by IntelliJ IDEA.
  User: 21207
  Date: 2021/8/24
  Time: 14:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    
    <title>第一个mvc</title>
</head>
<body>
<form action="second.do" method="post">
    姓名：<input type="text" name="uname"><br>
    年龄：<input type="text" name="uage"><br>
    <input type="submit" value="提交">
</form>
<br>

<form action="thired.do" method="post">
    姓名：<input type="text" name="runame"><br>
    年龄：<input type="text" name="ruage"><br>
    <input type="submit" value="提交">
</form><br>

<form action="four.do" method="post">
    姓名：<input type="text" name="uName"><br>
    年龄：<input type="text" name="uAge"><br>
    <input type="submit" value="提交">
</form>
</body>
</html>
