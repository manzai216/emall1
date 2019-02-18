package org.web.emall.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.web.emall.ResponseModel;

public class LoginController {

    @GetMapping("/user/wxapp/login")
    public ResponseModel login(String key) {
        return new ResponseModel(0,null,"success");
    }
}
