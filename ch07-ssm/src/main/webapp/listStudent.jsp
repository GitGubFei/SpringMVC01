<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <title>功能入口</title>
    <script type="text/javascript" src="static/jquery/jquery-2.1.0.min.js"></script>
    <script>
        $(function (){
            $("#searStu").click(function (){

                $.getJSON("student/getAllStudent.do",function(res){
                    console.log(res);
                    let student_table = $("#studentTable");
                    student_table.find("tr:not(:first)").remove();
                    $.each(res, function (index,student) {


                        let tr = "<tr>";
                        tr+="<td>"+student.stu_id+"</td>";
                        tr+="<td>"+student.stu_name+"</td>";
                        tr+="<td>"+student.stu_age+"</td>";
                        tr+="<td>"+student.stu_gender+"</td>";
                        tr+=" <td>"+student.stu_phone+"</td>";
                        student_table.append(tr);

                        // student_table.append("<tr>")
                        //     .append("<td>"+student.stu_id+"</td>")
                        //     .append("<td>"+student.stu_name+"</td>")
                        //     .append("<td>"+student.stu_age+"</td>")
                        //     .append("<td>"+student.stu_gender+"</td>")
                        //     .append("<td>"+student.stu_phone+"</td>").append("</tr>");
                    })

                })
            })
        })
    </script>
</head>
<body>
<div align="center">
    <input type="button" id="searStu" value="查询学生">
    <table id="studentTable">
        <tr>
            <td>学号</td>
            <td>姓名</td>
            <td>性别</td>
            <td>年龄</td>
            <td>手机</td>
        </tr>
    </table>
</div>
</body>
</html>
