package com.uwang.ssm.controller;

import com.uwang.ssm.model.User;
import com.uwang.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/")
public class UserContorller {

    @Autowired
    private UserService userService;


    @GetMapping
    public String index(Model model){
        List<User> userList = userService.findAll();
        if(userList.size() > 0){
            model.addAttribute("userList", userList);
        }
        return "index";
    }
}
