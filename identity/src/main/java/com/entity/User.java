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
    @JoinColumn(name = "email")
    String email;
    @JoinColumn(name = "password")
    String password;
    @Enumerated(EnumType.STRING)
    Role role;
}
