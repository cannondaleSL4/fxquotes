package com.entity;

import lombok.*;
import org.codehaus.jackson.annotate.JsonTypeInfo;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

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
@JsonTypeInfo(use = JsonTypeInfo.Id.CLASS, include = JsonTypeInfo.As.PROPERTY, property = "@class")
public class User {
    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "email")
    String email;

    @Column(name = "password")
    String password;

    //@Column(name = "rolename")
    @OneToMany(cascade = CascadeType.ALL)
    private final List<Role> roles = new ArrayList<>();

    public List<Role> getRoles() {
        return roles;
    }
}
