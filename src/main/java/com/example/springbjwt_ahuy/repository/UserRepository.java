package com.example.springbjwt_ahuy.repository;

import com.example.springbjwt_ahuy.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
        User findByUsername(String username);

}
