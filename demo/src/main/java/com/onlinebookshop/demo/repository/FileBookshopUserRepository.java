package com.onlinebookshop.demo.repository;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
@Primary
public interface FileBookshopUserRepository extends BookshopUserRepository {

}
