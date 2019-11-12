package com.ultrapower.demo.servicefeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@FeignClient(value = "service-hi", fallback = ScheduleServiceError.class)
public interface ScheduleServiceHi {
    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    String sayHiFromClient(@RequestParam String name);
}
