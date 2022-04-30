package pl.robocikd.pipeline.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String hello(@Value("${my.encoded.property}") String hello) {
        return hello;
    }
}
