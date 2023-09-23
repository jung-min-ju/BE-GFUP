package com.backend.GFUP.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "email", unique = true)
    private String email;

    private String password;

    @Column(name = "phoneNumber")
    private String phoneNumber;

    @Column(name = "alarmEmail")
    private String alarmEmail;

    @Column (name = "alarmPhoneNum")
    private String alarmPhoneNum;



}
