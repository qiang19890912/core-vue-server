package com.alan.controller;

import com.alan.core.ResWrapper;
import com.alan.dto.LoginResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/account")
public class AccountController {

    @ResponseBody
    @PostMapping("/login")
    public ResWrapper login(String username, String password){

        return ResWrapper.Success(new LoginResult(username,password));
    }
}
