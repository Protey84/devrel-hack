package com.protey.devrelhack.domain;

import com.protey.devrelhack.domain.enums.Role;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private long idUser;
    private String login;
    private String password;
    private String firstName;
    private String lastName;
    private Set<Role> roles;
}
