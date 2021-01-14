package com.leyou.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class TimeController {

    @RequestMapping("/getTime")
    public String getTime(){
        String time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        time="hello ";
        return time;
    }

}
