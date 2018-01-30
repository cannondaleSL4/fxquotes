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
    @Column(name= "id_user")
    private Integer id;

    @Column(name = "email")
    String email;

    @Column(name = "password")
    String password;

    @OneToMany(fetch=FetchType.EAGER)
    @JoinTable(
            name = "USER_ROLE",
            joinColumns = { @JoinColumn(name="id_user",referencedColumnName="id_user")},
            inverseJoinColumns = { @JoinColumn(name="id_role",referencedColumnName="id_role",unique=true)}
    )
    private Collection<Role> roles = new ArrayList<>();

    public List<Role> getRoles() {
        return roles.stream().collect(Collectors.toList());
    }
}
