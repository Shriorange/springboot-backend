package com.fazon.simplybytespringboot.model;

import lombok.*;

@Data
@Getter
@Setter
public class LoginUserRequest {
    private String email;
    private String password;
}
