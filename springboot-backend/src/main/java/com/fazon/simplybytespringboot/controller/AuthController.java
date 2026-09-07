package com.fazon.simplybytespringboot.controller;

import com.fazon.simplybytespringboot.Entity.*;
import com.fazon.simplybytespringboot.model.*;
import com.fazon.simplybytespringboot.service.*;
import lombok.*;
import lombok.extern.slf4j.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping()
//@AllArgsConstructor
@Slf4j
public class AuthController {
    private final UserService userService;

    public AuthController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/login")
    public UserEntity login(@RequestBody LoginUserRequest loginUserRequest) {
        log.info("Login user API Executed");
        return userService.login(loginUserRequest);
    }

    @GetMapping("/health")
    public String health() {
        log.info("Health check api has been requested");
        return "Hello Everyone, you are watching Github actions Series. Im Healthy";
    }

}
