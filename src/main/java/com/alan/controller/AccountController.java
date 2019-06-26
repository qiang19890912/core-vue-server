package com.alan.controller;

import com.alan.core.ResWrapper;
import com.alan.dto.LoginResult;
import com.alan.requestdto.LoginRequest;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Controller
@RequestMapping("/account")
public class AccountController {

//    @ResponseBody
//    @PostMapping("/login")
//    public ResWrapper login(Map<String,String> paramMap){
//
//        return ResWrapper.Success(new LoginResult(paramMap.get("username"),paramMap.get("password")));
//    }
//
    @ResponseBody
    @PostMapping("/login")
    public ResWrapper login(LoginRequest loginRequest, HttpServletRequest request){

//        System.out.println(request.getHeader("Content-Type"));
        return ResWrapper.Success(new LoginResult(loginRequest.getUsername(),loginRequest.getPassword()));
    }

//    @ResponseBody
//    @PostMapping("/login")
//    public ResWrapper login(String username,String password){
//
//        return ResWrapper.Success(new LoginResult(username,password));
//    }
}
