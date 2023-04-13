package com.fscc.loginservice.services;
import com.fscc.loginservice.shared.LoginDto;

public interface LoginService {

    public LoginDto getLogin(String email);

}