package com.example.demoApplication.controller;

import com.example.demoApplication.model.User;
import com.example.demoApplication.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
@Autowired
    private UserService userService;

@PostMapping("/")
public void createUser(@RequestBody User user){
    userService.createUser(user);
}
@GetMapping
public List<User>findAll() {
    return userService.findAll();
}
@GetMapping("/findById/{userId")
public User findById(@PathVariable Long userId){
User byId=userService.findById(userId);
return byId;
}
@PutMapping("/updateById/userId")
    public User updateById(@PathVariable Long userId , @RequestBody User user){
User rUser=userService.updateById(userId,user);
return rUser;
}
}
