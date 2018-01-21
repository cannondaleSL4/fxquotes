package com.entity;

import lombok.Builder;
import lombok.Getter;

import javax.persistence.*;

/**
 * Created by dima on 21.01.18.
 */
@Entity
@Table(name = "userapp")
@Builder
@Getter
public class User {
    @Id
    @GeneratedValue
    private int id;
    @JoinColumn(name = "name")
    String name;
    @JoinColumn(name = "password")
    String password;
    @Enumerated(EnumType.STRING)
    Role role;
}
