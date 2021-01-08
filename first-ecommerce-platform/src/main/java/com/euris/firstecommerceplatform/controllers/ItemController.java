package com.euris.firstecommerceplatform.controllers;

import com.euris.firstecommerceplatform.models.Item;
import com.euris.firstecommerceplatform.repositories.ItemRepository;
import com.euris.firstecommerceplatform.repositories.UserRepository;
import com.euris.firstecommerceplatform.services.CreateItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ItemController {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ItemRepository itemRepository;

    @PostMapping("/createItem")
    public Item createItem(@RequestBody CreateItem ci) {
        return itemRepository.save(ci.getItem());
    }

    @GetMapping("/findAllItems")
    public List<Item> findAllItems() {
        return itemRepository.findAll();
    }
}
