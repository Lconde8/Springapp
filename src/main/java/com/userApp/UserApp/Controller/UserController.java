package com.userApp.UserApp.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/user-form")
    public String userForm(){
        return "user-form";
    }
}
