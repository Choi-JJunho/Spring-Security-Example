package com.example.springsecurityexample.security;

import com.example.springsecurityexample.security.Token;
import org.springframework.data.repository.CrudRepository;

public interface TokenRepository extends CrudRepository<Token, Long> {
}
