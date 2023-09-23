package com.backend.GFUP.dto;

import com.backend.GFUP.model.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
public class RegisterRequest {
    private String email;
    private String phoneNumber;
    private String password;
    private String alarmEmail;
    private String alarmPhoneNum;

    public User toEntity(String password) {
        return User.builder()
                .email(this.email)
                .phoneNumber(this.phoneNumber)
                .password(password)
                .alarmEmail(this.alarmEmail)
                .alarmPhoneNum(this.alarmPhoneNum)
                .build();
    }
}
