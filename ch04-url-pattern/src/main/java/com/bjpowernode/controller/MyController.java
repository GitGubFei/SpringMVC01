package com.bjpowernode.controller;

import com.bjpowernode.vo.Student;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@Controller
public class MyController {
    /**
     * @return
     */
    @RequestMapping(value = "/returnString.do")
    public ModelAndView doSome(int uage,String uname) {
        ModelAndView mv=new ModelAndView();
        mv.addObject("myname",uname);
        mv.addObject("myage",uage);
        mv.setViewName("show");
        return mv;
    }
}
