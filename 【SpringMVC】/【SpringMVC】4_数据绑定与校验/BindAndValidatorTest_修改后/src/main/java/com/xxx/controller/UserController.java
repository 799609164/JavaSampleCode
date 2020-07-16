package com.xxx.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
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
    // 其中 @Valid @ModelAttribute("user") User user 的 @Valid 意思是
    // 在把数据绑定到 @ModelAttribute("user") 后就进行验证
    // 后面跟着 Errors 对象保存校验信息，
    // 如果 errors 中有错误信息，则返回 register 页面，验证成功则跳转到 success 页面
    public String register(@Valid  @ModelAttribute("user") User user, Errors errors,Model model) {
        if(errors.hasErrors()){
            return "register";
        }
        model.addAttribute("user", user);
        return "success";
    }
}