package com.huy.springsecurity.authentication.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class User {
    private String username;
    private String password;
    private String code;
}
