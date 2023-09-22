package com.backend.GFUP.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@AllArgsConstructor
public class LoginRequest {
    private String email;
    private String password;
}

//사용 서비스 로직
//login
//logout