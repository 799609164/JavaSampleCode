package com.xxx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xxx.entity.User;

@Controller
public class UserController {

    // 进入注册页面
    @RequestMapping(value = "/registerform")
    public String registerform(Model model) {
        model.addAttribute("user", new User());
        return "register";
    }

    // 注册请求的响应方法
    @RequestMapping(value = "/register")
    public String register(@ModelAttribute("user") User user, Model model) {
        model.addAttribute("user", user);
        return "success";
    }
}