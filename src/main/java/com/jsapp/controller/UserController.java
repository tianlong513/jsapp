package com.jsapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @program: demo
 * @description:
 * @author:
 * @create: 2018-11-29 13:55
 **/
@Controller
public class UserController {
    @GetMapping(value = "login")
    public ModelAndView login() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("login");
        return mav;
    }
}
