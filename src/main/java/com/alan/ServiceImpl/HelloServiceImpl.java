package com.alan.ServiceImpl;

import com.alan.Services.HelloService;
import org.springframework.stereotype.Component;

@Component
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello() {
        return "Hello world";
    }
}
