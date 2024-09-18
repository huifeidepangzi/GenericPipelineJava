package com.onlinebookshop.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onlinebookshop.demo.entity.BookShopUser;

@Repository
public interface BookshopUserRepository extends JpaRepository<BookShopUser, Long> {

}
