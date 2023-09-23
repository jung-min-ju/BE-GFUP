package com.backend.GFUP.dto;

import com.backend.GFUP.model.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Builder
public class UserDTO {
    private Long id;
    private String email;
    private String phoneNumber;
    private String password;
    private String alarmEmail;
    private String alarmPhoneNum;

    public static UserDTO fromEntity(User user) {
        UserDTO userDTO = UserDTO.builder()
                .id(user.getId())
                .email(user.getEmail())
                .phoneNumber(user.getPhoneNumber())
                .password(user.getPassword())
                .alarmEmail(user.getAlarmEmail())
                .alarmPhoneNum(user.getAlarmPhoneNum())
                .build();
        return userDTO;
    }


}

//사용 서비스 로직
//createUser
//updateUser