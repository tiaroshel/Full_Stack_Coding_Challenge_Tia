package com.fscc.loginservice.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fscc.loginservice.repository.LoginRepository;
import com.fscc.loginservice.shared.LoginDto;

@Component
public class LoginServiceImpl implements LoginService {

    @Autowired 
    LoginRepository LoginRepository;
    
    public LoginDto getLogin(String email) {
        if(LoginRepository.existsById(email)) {
            String password = LoginRepository.findById(email).get().getPassword();
            return new LoginDto(email, password);
        }
        return null;
    }
}