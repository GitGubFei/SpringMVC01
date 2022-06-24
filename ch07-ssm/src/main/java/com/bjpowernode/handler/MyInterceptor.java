package com.bjpowernode.handler;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyInterceptor implements HandlerInterceptor {
    /**
     *
     * @param request
     * @param response
     * @param handler 被拦截的对象
     * @return 返回值 true 请求通过 false 请求截止；
     * @throws Exception
     *
     * 特点：
     *      1.在控制器方法之前执行（用户请求首先到达此方法）
     *      2.在这个方法中获取请求信息，验证是否符合要求，可以验证用户是否登陆，验证用户是否有权限访问某个地址，
     *      如果验证失败，可以截断请求，请求不能被处理。
     *      如果验证成功，可以放行请求，此时控制器方法才能执行
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("拦截器MyInterceptor的preHandle方法");
        //request.getRequestDispatcher("/tips.jsp").forward(request,response);
        return true;
    }

    /**
     *
     * @param request
     * @param response
     * @param handler 被拦截处理对象
     * @param modelAndView 处理器方法返回值
     * @throws Exception
     *
     * 特点：
     *      1.在处理器方法之后执行
     *      2.能够获取到处理器方法的返回值ModelAndView，可以修改ModelAndView中的数据和视图，能够影响最后的执行结果
     *      3.对原来的结果进行二次修正
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("拦截器MyInterceptor的postHandle方法");
    }

    /**
     * 最后执行的方法
     * @param request
     * @param response
     * @param handler 被拦截的处理器对象
     * @param ex
     * @throws Exception 程序中发生的异常
     *
     * 特点：
     *      1.请求完成处理之后执行的，框架中规定当你的属兔处理完成后，对视图执行了forward，认为请求处理完成
     *      2.一般是用来做资源回收工作
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("拦截器MyInterceptor的afterCompletion方法");
    }
}
