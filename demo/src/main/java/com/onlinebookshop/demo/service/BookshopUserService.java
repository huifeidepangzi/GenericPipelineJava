package com.onlinebookshop.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlinebookshop.demo.entity.BookShopUser;
import com.onlinebookshop.demo.repository.BookshopUserRepository;

@Service
public class BookshopUserService {

    @Autowired
    private BookshopUserRepository userRepository;

    public List<BookShopUser> getAllUsers() {
        return userRepository.findAll();
    }

    public Optional<BookShopUser> getUserById(Long id) {
        return userRepository.findById(id);
    }

    public BookShopUser createUser(BookShopUser user) {
        return userRepository.save(user);
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
