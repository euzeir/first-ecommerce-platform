package com.euris.firstecommerceplatform.controllers;

import com.euris.firstecommerceplatform.models.User;
import com.euris.firstecommerceplatform.repositories.ItemRepository;
import com.euris.firstecommerceplatform.repositories.UserRepository;
import com.euris.firstecommerceplatform.services.CreateUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ItemRepository itemRepository;

    @PostMapping("/user")
    public User createUser(@RequestBody CreateUser cu) {
        return userRepository.save(cu.getUser());
    }

    @GetMapping("/findAllUsers")
    public List<User> findAllUsers() {
       return userRepository.findAll();
    }
}
