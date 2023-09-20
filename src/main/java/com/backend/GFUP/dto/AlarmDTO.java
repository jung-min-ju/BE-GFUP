package com.backend.GFUP.dto;

import lombok.Getter;
import lombok.Setter;
import org.w3c.dom.Text;

@Getter
@Setter
public class AlarmDTO {
    private int date;
    private int time;
    private int repeat;
    private String name;
    private Text message;
    private String method;
}

//사용 서비스 로직
//createAlarm
//readAlarm
//updateAlarm
//deleteAlarm