//package com.example.demoApplication.controller;
//
//import com.example.demoApplication.model.User;
//import com.example.demoApplication.service.UserServiceImpl;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RequestMapping("/user")
//@RestController
//public class UserController {
//    @Autowired
//    private UserServiceImpl userService;
//
//    @PostMapping("/")
////    public void createUser(@RequestBody User user) {
//        userService.createUser(user);
//    }
//
//    //uzair bhai n bnwaya tha
////@GetMapping("/")
////public List<User>findAll() {
////    return userService.findAll();
////}
//    @GetMapping("/")
//    public String doSomething() {
//        return "hello";
//    }
//
//    @GetMapping("/findAll")
//    public List<User> findAll() {
//        return userService.findAll();
//    }
//
//    @GetMapping("/findById/{userId}")
//    public User findById(@PathVariable Long userId) {
////User byId=userService.findById(userId);
////return byId;
//        return userService.findById(userId);
//    }
//
//    @PutMapping("/updateById/userId")
//    public User updateById(@PathVariable Long userId, @RequestBody User user) {
//        User rUser = userService.updateById(userId, user);
//        return rUser;
//    }
//
//    @DeleteMapping("/deleteById/{userId}")
//    public void deleteById(@PathVariable Long userId){
//  userService.deleteById(userId);
//    }
//}
