package com.example.FirstProject.controller;


import com.example.FirstProject.dto.UserDto;
import com.example.FirstProject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "api/v1/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/getUser")
    public String getUser(){
        return "Hi Sandaru Saminha";
    }
    @PostMapping("/saveUser")
    public UserDto saveUser(@RequestBody UserDto userDto){
        return userService.saveUser(userDto);
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
