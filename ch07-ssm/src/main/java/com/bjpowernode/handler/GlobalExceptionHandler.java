package com.bjpowernode.handler;

import com.bjpowernode.exception.AgeException;
import com.bjpowernode.exception.NameException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(value = NameException.class)
    public ModelAndView doNameException(Exception exception){
        ModelAndView mv=new ModelAndView();
        mv.addObject("msg","名字必须是李四");
        mv.addObject("ex",exception);
        mv.setViewName("nameError");
        return mv;


    }
    @ExceptionHandler(value = AgeException.class)
    public ModelAndView doAgeException(Exception exception){
        ModelAndView mv=new ModelAndView();
        mv.addObject("msg","年龄有误");
        mv.addObject("ex",exception);
        mv.setViewName("ageError");
        return mv;
    }

    @ExceptionHandler
    public ModelAndView doOtherException(Exception exception){
        ModelAndView mv=new ModelAndView();
        mv.addObject("msg","未知异常");
        mv.addObject("ex",exception);
        mv.setViewName("defaultError");
        return mv;


    }
}
