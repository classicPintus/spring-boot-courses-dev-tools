package com.wideside.devtoolsexample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DummyRestController {

    @GetMapping(path = "/dummyString")
    public String getDummyString(){
        return "changeMe";
    }
}
