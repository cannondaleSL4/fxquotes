package com.entity;

import lombok.*;
import org.codehaus.jackson.annotate.JsonTypeInfo;
import org.springframework.security.core.GrantedAuthority;

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
@Table(name ="USERROLE")
@JsonTypeInfo(use = JsonTypeInfo.Id.CLASS, include = JsonTypeInfo.As.PROPERTY, property = "@class")
public class Role implements GrantedAuthority, Comparable<Role> {

    @Id
    @GeneratedValue
    private Integer id_role;

    @Column(name = "rolename")
    private String role;

    @Override
    public String getAuthority() {
        return this.role;
    }

    @Override
    public int compareTo(Role o) {
        if (this.role.equals("ADMIN"))return 1;
        else if(o.role.equals("ADMIN"))return 0;

        return this.role.compareTo(o.getRole());
    }
}
