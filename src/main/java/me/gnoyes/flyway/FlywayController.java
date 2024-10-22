package me.gnoyes.flyway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FlywayController {

    @GetMapping("/")
    public String hello() {
        return "hello";
    }
}
