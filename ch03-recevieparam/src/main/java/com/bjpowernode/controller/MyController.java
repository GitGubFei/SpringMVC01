package com.bjpowernode.controller;

import com.bjpowernode.vo.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class MyController {
    /**
     *
     * @return
     */
    @RequestMapping(value = "/first.do",method = RequestMethod.GET)
    public ModelAndView doSome(HttpServletRequest request){
        ModelAndView md=new ModelAndView();
        md.addObject("msg","java mvc 开发");
        md.addObject("fun","执行了first的get的方法"+request.getParameter("name"));
        md.setViewName("show");
        return  md;
    }
    @RequestMapping(value = "/second.do",method = RequestMethod.POST)
    public ModelAndView doSecond(String uname,int uage){
        ModelAndView md=new ModelAndView();
        md.addObject("myname",uname);
        md.addObject("myage",uage);
        md.setViewName("show");
        return  md;
    }

    @RequestMapping(value = "/thired.do",method = RequestMethod.POST)

    public ModelAndView doSThired(@RequestParam(value = "runame",required = false)String uname,@RequestParam(value = "ruage",required = false) int uage){
        ModelAndView md=new ModelAndView();
        md.addObject("myname",uname);
        md.addObject("myage",uage);
        md.setViewName("show");
        return  md;
    }
    @RequestMapping(value = "/four.do",method = RequestMethod.POST)

    public ModelAndView doFour(Student student){
        ModelAndView md=new ModelAndView();
        md.addObject("myname",student.getuName());
        md.addObject("myage",student.getuAge());
        md.setViewName("show");
        return  md;
    }
}
