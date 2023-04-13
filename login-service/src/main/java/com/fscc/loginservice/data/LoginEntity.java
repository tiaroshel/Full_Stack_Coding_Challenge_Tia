package com.fscc.loginservice.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class LoginEntity {

    @Id
    @Column(name = "email", nullable = false, unique = true)
    private String email; // primary key
    @Column(name = "password", nullable = false)
    private String password; // encrypted

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}