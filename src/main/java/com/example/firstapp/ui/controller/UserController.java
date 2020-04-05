package com.example.firstapp.ui.controller;

import com.example.firstapp.ui.model.request.UserDetailsRequestModel;
import com.example.firstapp.ui.model.response.UserRest;
import org.springframework.web.bind.annotation.*;

// use spring annotations to bind each method to http request

@RestController
@RequestMapping("users") // http://localhost:8080/users
public class UserController {
    @GetMapping // for this method to respond to http request, we use GetMapping Annotation
    public String getUser() {
        return "get user was called";
    }

    @PostMapping
    public UserRest createUser(@RequestBody UserDetailsRequestModel userDetail) {
        return null;
    }

    @PutMapping
    public String updateUser() {
        return "update user was called";
    }

    @DeleteMapping
    public String deleteUser() {
        return "delete user was called";
    }
}
