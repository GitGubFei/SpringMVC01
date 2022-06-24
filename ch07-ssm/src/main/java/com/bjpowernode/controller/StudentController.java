package com.bjpowernode.controller;

import com.bjpowernode.domain.Student;
import com.bjpowernode.exception.AgeException;
import com.bjpowernode.exception.MyUserException;
import com.bjpowernode.exception.NameException;
import com.bjpowernode.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("student")
public class StudentController {
    @Resource
    private StudentService service;
    @RequestMapping("/addStudent.do")
    public ModelAndView addStudent(Student student) throws MyUserException {
        String tip="注册失败";
        ModelAndView mv=new ModelAndView();
        if (!student.getStu_name().equals("李四")){throw new NameException("姓名错误");
        }
        if (student.getStu_age()<=0||student.getStu_age()>80){throw new AgeException("年龄有误");
        }
        System.out.println(student);
       int res= service.addStudent(student);
       if (res>0){
           tip="学生【"+student.getStu_name()+"】注册成功";
       }
       mv.addObject("tips",tip);
       mv.setViewName("resault");
       return mv;
    }

    @RequestMapping("/getAllStudent.do")
    @ResponseBody
    public List<Student> getStudent(){
        List<Student>stulist= service.findAllStudent();
//        for(Student stu:stulist){
//            System.out.println(stu.getStu_name());
//        }
        System.out.println("拦截器");
        return  stulist;
    }

}
