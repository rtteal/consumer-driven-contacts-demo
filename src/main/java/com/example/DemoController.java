package com.example;


import org.joda.time.DateTime;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/api/demo")
    public DemoResponse demo() {
        return new DemoResponse(new DateTime("2017-09-13T04:26:00.077Z"));
    }

}
