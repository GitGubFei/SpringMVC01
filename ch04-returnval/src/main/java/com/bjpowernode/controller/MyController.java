package com.bjpowernode.controller;

import com.bjpowernode.vo.Student;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@Controller
public class MyController {
    /**
     *
     * @return
     */
    @RequestMapping(value = "/returnString.do")
    public String doSome(HttpServletRequest request, String uname, int uage){
        request.setAttribute("myname",uname);
        request.setAttribute("myage",uage);
        System.out.println(uname+""+uage);
        return "show";
    }
    @RequestMapping(value = "/return-ajax.do")
    public void doReturnAjax(HttpServletRequest request, HttpServletResponse response, String name, int age) throws IOException {
        System.out.println(name+""+age );
        Student stu=new Student();
        stu.setuName(name);
        stu.setuAge(age);
        String json="";
         ObjectMapper om=new ObjectMapper();
         json=om.writeValueAsString(stu);
         response.setContentType("application/json;charset=utf-8");
        PrintWriter pw=response.getWriter();
        pw.println(json);
        pw.flush();
        pw.close();
    }


    @RequestMapping(value = "/return-studnetajax.do")
    @ResponseBody
    public Student doReturnAjax2(String name, int age) throws IOException {
        System.out.println(name+""+age );
        Student stu=new Student();
        stu.setuName(name);
        stu.setuAge(age);
        stu.setuAge(200);
        System.out.println(stu.getuAge());
        return stu;
    }
    @RequestMapping(value = "/return-studnetarrajax.do")
    @ResponseBody
    public List<Student> doReturnAjax3(String name, int age) throws IOException {
        List<Student> list=new ArrayList<>();
        Student stu=new Student();
        stu.setuName(name);
        stu.setuAge(age);
        list.add(stu);
        stu.setuName("wangwu");
        stu.setuAge(200);
        list.add(stu);
        return list;
    }

    @RequestMapping(value = "/return-stringajax.do",produces = "text/plain;charset=utf-8")
    @ResponseBody
    public String doReturnStrAjax()  {
        return "张三此地无银3百两";
    }

}
