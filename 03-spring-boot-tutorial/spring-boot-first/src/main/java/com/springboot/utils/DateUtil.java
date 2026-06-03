package com.springboot.utils;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class DateUtil {

    public LocalDateTime getCurrentDate() {
        return LocalDateTime.now();
    }
}
