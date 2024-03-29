package com.alan.controller;

import com.alan.services.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class HelloController {

    @Autowired
    private HelloService helloService;

    @RequestMapping("/hello")
    @ResponseBody
    public String helloWorld(){
        return helloService.sayHello();
    }
}
