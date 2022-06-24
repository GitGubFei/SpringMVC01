<%--
  Created by IntelliJ IDEA.
  User: 21207
  Date: 2021/9/3
  Time: 16:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="static/bootstrap/bootstrap.min.css" rel="stylesheet"/>
</head>
<body>
<div><!-- 添加学生信息的模态框 -->
    <form action="student/addStudent.do" id="showstuinfo" method="post">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                        <h4 class="modal-title" id="myModalLabel">添加学生信息</h4>
                    </div>
                    <div class="modal-body">
                        <div class="form-group">
                            <!-- <label for="stuid">学号:</label> -->
                            <input type="text" class="form-control" name="stuid" placeholder="请输入学号">
                        </div>

                        <div class="form-group">
                            <!--<label for="stuname">名字:</label> -->
                            <input type="text" class="form-control"  name="stu_name" placeholder="请输入姓名">
                        </div>
                        <div class="form-group">
                            <!--<label for="stuage">年龄:</label> -->
                            <input type="text" class="form-control"  name="stu_age" placeholder="请输入年龄">
                        </div>
                        <div class="form-group">
                            <label for="gender">性别:</label>
                            <label><input type="radio" checked value="男" name="stu_gender" />男</label>&nbsp;&nbsp;
                            <label><input type="radio"  value="女" name="stu_gender" />女</label>
                        </div>
                        <div class="form-group">
                            <!--<label for="stuphone">手机:</label> -->
                            <input type="text" class="form-control"  name="stu_phone" placeholder="请输入手机">
                        </div>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                        <input type="submit" class="btn btn-primary" value="提交">
                    </div>
                </div><!-- /.modal-content -->
            </div><!-- /.modal -->

    </form>
</div>
</body>
</html>
