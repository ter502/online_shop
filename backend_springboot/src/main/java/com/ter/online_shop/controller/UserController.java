package com.ter.online_shop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ter.online_shop.entity.User;
import com.ter.online_shop.services.UserService;

@RestController
@RequestMapping("/api")
@CrossOrigin("http://localhost:3000")
public class UserController {
    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }
    
    @PostMapping("/users")
    public User addUser(@RequestBody com.ter.online_shop.entity.User user){
        user.setId(0);
        return userService.save(user);
    }

    @GetMapping("/users")
    public List<User> getAllUser(){
        return userService.findAll();
    }

    @GetMapping("/users/{id}")
    public User getUser(@PathVariable int id){
        User user = userService.findById(id);
        return  user;
    }

    @PutMapping("/users")
    public User updateUser(@RequestBody com.ter.online_shop.entity.User user){
        return userService.save(user);
    }

    @DeleteMapping("/users/{id}")
    public String deleteUser(@PathVariable int id){
        User myUser = userService.findById(id);

        if(myUser == null){
            throw new RuntimeException("User Not Found ID = "+id);
        }

        userService.deleteById(id);
        
        return "Deleted User ID = "+id+" Successful";
    }

}
