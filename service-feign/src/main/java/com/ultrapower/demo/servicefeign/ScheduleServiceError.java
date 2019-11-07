package com.ultrapower.demo.servicefeign;

import org.springframework.stereotype.Component;

@Component
public class ScheduleServiceError implements ScheduleServiceHi {
    @Override
    public String sayHiFromClient(String name) {
        return "sorry,name is " + name;
    }
}
