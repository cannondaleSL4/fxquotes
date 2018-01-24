package com.entity;

import lombok.*;

import javax.persistence.*;

/**
 * Created by dima on 21.01.18.
 */
@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "USERAPP")
public class User {
    @Id
    @GeneratedValue
    private Integer id;
    @Column(name = "email")
    String email;
    @Column(name = "password")
    String password;
    @Enumerated(EnumType.STRING)
    @Column(nullable=false, length=8,name = "user_group")
    Role role;
}
