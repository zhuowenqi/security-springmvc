package com.ryoma.security.controller;

import com.ryoma.security.common.Constant;
import com.ryoma.security.model.AuthenticationRequest;
import com.ryoma.security.model.UserDetail;
import com.ryoma.security.service.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class LoginController {

    @Autowired
    private AuthenticationService authenticationService;

    @PostMapping(value = "login", produces = "text/plain;charset=utf-8")
    public String login(AuthenticationRequest request, HttpSession session){
        UserDetail userDetail = authenticationService.authentication(request);
        session.setAttribute(Constant.SESSION_KEY, userDetail);
        return userDetail.getFullname() + "，欢迎你";
    }
}
