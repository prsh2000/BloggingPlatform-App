package com.pratik.BloggingApp.repository;

import com.pratik.BloggingApp.model.AuthenticationToken;
import com.pratik.BloggingApp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface IAuthenticationRepo extends JpaRepository<AuthenticationToken,Long> {

    AuthenticationToken findFirstByTokenValue(String authTokenValue);
    AuthenticationToken findFirstByUser(User user);
}
