package com.example.shoppingapplication.repository;

import com.example.shoppingapplication.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository<User, String> {
    User findByUsernameIgnoreCase(String username);

    User findByUsername(String username);
}
