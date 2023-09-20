package com.backend.GFUP.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginDTO {
    private String email;
    private String password;
}

//사용 서비스 로직
//login
//logout