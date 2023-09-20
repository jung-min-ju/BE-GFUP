package com.backend.GFUP.controller;

import com.backend.GFUP.dto.LoginDTO;
import com.backend.GFUP.dto.UserDTO;
import com.backend.GFUP.service.UserServiceImpl;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@Slf4j
@RequestMapping("/auth")
public class AuthController {

    private final UserServiceImpl userService;

    @PostMapping("/register")
    public ResponseEntity<?>register(@RequestBody UserDTO userDTO) {
        return null;
    }

    @PostMapping("/login")
    public ResponseEntity<?>login(@RequestBody LoginDTO loginDTO) {
        return null;
    }

    @PostMapping("/logout")
    public ResponseEntity<?>logout() {
        return null;
    }
}
