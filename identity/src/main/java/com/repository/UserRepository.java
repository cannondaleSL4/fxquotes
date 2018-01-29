package com.repository;


import com.entity.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by dima on 21.01.18.
 */
//@Repository
public interface UserRepository extends CrudRepository<User, Integer> {}
