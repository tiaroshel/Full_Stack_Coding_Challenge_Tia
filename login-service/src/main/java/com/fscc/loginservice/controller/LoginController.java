package com.fscc.loginservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fscc.loginservice.data.LoginEntity;
import com.fscc.loginservice.services.LoginServiceImpl;
import com.fscc.loginservice.shared.LoginDto;

@RestController
@RequestMapping(path="/login")
public class LoginController {

    @Autowired
    private Environment env;

    @Autowired
    LoginServiceImpl loginService;

    @GetMapping(path="/status/check")
    public String status() {
        return "Working on port " + env.getProperty("server.port");
    }

    @PostMapping(path="/login-credentials")
    public LoginEntity validateUser(@RequestBody LoginDto userCredentials) {
        return null;
    }

    @GetMapping (path="/use")
    public LoginDto user(@RequestParam String email) {
        return loginService.getLogin(email);
    }
}


