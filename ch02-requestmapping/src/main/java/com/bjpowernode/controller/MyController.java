package com.bjpowernode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class MyController {
    /**
     *
     * @return
     */
    @RequestMapping(value = "/some.do",method = RequestMethod.GET)
    public ModelAndView doSome(HttpServletRequest request){
        ModelAndView md=new ModelAndView();
        md.addObject("msg","java mvc 开发");
        md.addObject("fun","执行了dosome的方法"+request.getParameter("name"));
        md.setViewName("show");
        return  md;
    }
}
