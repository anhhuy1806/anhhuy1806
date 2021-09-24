package com.example.springbjwt_ahuy.repository;

import com.example.springbjwt_ahuy.entity.Token;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TokenRepository extends JpaRepository<Token, Long> {

}
