package com.library.app.web.controllers;


import com.library.app.domain.UserDomain;
import com.library.app.domain.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api")
public class UserController {

    @Autowired
    private UserService userService;


    @PostMapping("/user")
    public ResponseEntity<UserDomain> save(@RequestBody UserDomain user){
        return new ResponseEntity<>(userService.save(user), HttpStatus.OK);

    }

}
