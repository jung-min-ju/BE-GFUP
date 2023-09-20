package com.backend.GFUP.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.w3c.dom.Text;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AlarmInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int date;
    private int time;
    private int repeat;
    private String name;
    private Text message;
    private String method;

}
