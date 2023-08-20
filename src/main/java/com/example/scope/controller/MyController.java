package com.example.scope.controller;

import com.example.scope.myComponent.*;
import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : KaelvihN
 * @date : 2023/8/19 20:44
 */

@RestController
public class MyController {
    @Lazy
    @Resource
    private BeanForApplication beanForApplication;

    @Lazy
    @Resource
    private BeanForRequest beanForRequest;

    @Lazy
    @Resource
    private BeanForSession beanForSession;

    @GetMapping(value = "/test", produces = "text/html")
    public String test(HttpServletRequest request, HttpSession session) {
        // 设置 session 过期时间为 60 秒
        session.setMaxInactiveInterval(60);
        // ServletContext sc = request.getServletContext();
        return "<ul>" +
                "<li>request scope: " + beanForRequest + "</li>" +
                "<li>session scope: " + beanForSession + "</li>" +
                "<li>application scope: " + beanForApplication + "</li>" +
                "</ul>";
    }

}
