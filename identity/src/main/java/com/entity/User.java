package com.entity;

import lombok.*;
import org.codehaus.jackson.annotate.JsonTypeInfo;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

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

    @OneToMany(cascade = CascadeType.ALL)
    //@JoinTable(name="rolename" , joinColumns = @JoinColumn(name = "id"), inverseJoinColumns = @JoinColumn(name = "id_role"))
    @JoinColumn(name="idRole", referencedColumnName = "id_role")
    private Collection<Role> roles = new ArrayList<>();

    public List<Role> getRoles() {
        return roles.stream().collect(Collectors.toList());
    }
}
