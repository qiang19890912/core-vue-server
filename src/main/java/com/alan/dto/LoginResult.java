package com.alan.dto;

import lombok.Data;

@Data
public class LoginResult {

    private String username;
    private String password;

    public LoginResult(String username,String password){
        this.username = username;
        this.password = password;
    }



}
