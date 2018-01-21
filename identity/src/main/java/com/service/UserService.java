package com.service;

import com.entity.User;

import java.util.List;
import java.util.Optional;

/**
 * Created by dima on 21.01.18.
 */
public interface UserService {
    Optional<List<User>> findAll();
}
