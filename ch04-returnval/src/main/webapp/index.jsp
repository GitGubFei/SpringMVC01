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
    <script src="js/jquery.min.js"></script>
    <script>


        $(function () {
            $("button").click(function () {
              //  $.ajax()
                $.ajax({
                    // url:"return-ajax.do",
                    url:"return-studnetajax.do",
                    url:"return-studnetarrajax.do",
                    url:"return-stringajax.do",
                    data:{name:"zhangsan",age:15},
                    type:"post",
                    // dateType:"json",
                    dateType:"text",
                    success:function (res) {
                        console.log(res);
                    }
                })
            })
        })
    </script>
</head>
<body>
<form action="returnString.do" method="post">
    姓名：<input type="text" name="uname"><br>
    年龄：<input type="text" name="uage"><br>
    <input type="submit" value="提交">
</form>
<br>
<button value="">发送请求</button>

</body>
</html>
