package com.onlinebookshop.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onlinebookshop.demo.entity.BookShopUser;
import com.onlinebookshop.demo.service.BookshopUserService;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private BookshopUserService bookshopUserService;

    @GetMapping
    public List<BookShopUser> getAllUsers() {
        return bookshopUserService.getAllUsers();
    }

    @GetMapping("/{id}")
    public Optional<BookShopUser> getUserById(@PathVariable Long id) {
        return bookshopUserService.getUserById(id);
    }

    @PostMapping
    public BookShopUser createUser(@RequestBody BookShopUser user) {
        return bookshopUserService.createUser(user);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        bookshopUserService.deleteUser(id);
    }
}
