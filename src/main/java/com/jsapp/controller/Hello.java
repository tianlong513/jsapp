package com.jsapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: demo
 * @description:
 * @author:
 * @create: 2018-11-29 13:42
 **/
@RestController
public class Hello {
    @GetMapping(value = "hello")
    public  String hello(){
        return "helloWorld!!!";
    }

    @GetMapping(value = "hell2")
    public  String hell2(){
        return "helloWorld!!!";
    }
}
