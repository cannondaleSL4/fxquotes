package com.controller;

import com.model.user.User;
import com.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

/**
 * Created by dima on 21.01.18.
 */
public class UserService {
    @Autowired
    private UserRepository userRepository;

    String getLoggedUserId(){
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();

        if (auth == null){
            return "nosession";
        }
        return auth.getName();
    }

    public User getLoggedUser(){
        String loggedUserId = getLoggedUserId();
        User user = getUserInfoUserId(loggedUserId);
        return  user;
    }

    public User getUserInfoUserId(String userId){
        return userRepository.findOneByUserId(userId).orElseGet( () -> new User());
    }
}
