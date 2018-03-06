package com.repository;


import com.model.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * Created by dima on 21.01.18.
 */
public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findOneById(String userId);
    Optional<User> findOneUserByIdAndPassword(String userId, String password);
    Optional<User> findOneUserByName(String email);
}
