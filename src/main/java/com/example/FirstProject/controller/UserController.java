package com.example.FirstProject.controller;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "api/v1/user")
public class UserController {
    @GetMapping("/getUser")
    public String getUser(){
        return "Hi Sandaru Saminha";
    }
    @PostMapping("/saveUser")
    public String saveUser(){
        return "save User";
    }
    @PutMapping ("/updateUser")
    public String updateUser(){
        return "update User";
    }
    @DeleteMapping("/deleteUser")
    public String deleteUser(){
        return "delete User";
    }
}
