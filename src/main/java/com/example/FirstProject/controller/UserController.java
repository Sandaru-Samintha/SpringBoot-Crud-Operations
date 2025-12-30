package com.example.FirstProject.controller;


import com.example.FirstProject.dto.UserDto;
import com.example.FirstProject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/getUser")
    public String getUser(){
        return "Hi Sandaru Saminha";
    }

    @GetMapping("/getUsers")
    public List<UserDto> getUsers(){
        return userService.getAllUsers();
    }
    @PostMapping("/saveUser")
    public UserDto saveUser(@RequestBody UserDto userDto){
        return userService.saveUser(userDto);
    }
    @PutMapping ("/updateUser")
    public UserDto updateUser(@RequestBody UserDto userDto){
        return userService.updateUser(userDto);
    }
    @DeleteMapping("/deleteUser")
    public String deleteUser(){
        return "delete User";
    }
}
