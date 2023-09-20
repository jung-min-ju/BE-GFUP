package com.backend.GFUP.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDTO {
    private String email;
    private String phoneNumber;
    private String password;
}

//사용 서비스 로직
//createUser
//updateUser