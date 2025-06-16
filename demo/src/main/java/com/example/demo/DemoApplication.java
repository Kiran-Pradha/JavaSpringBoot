package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
@RestController
public class DemoApplication {

    @GetMapping("/")
    public String hello() {
        return "Hello from Dockerized Java App!";
    }

public static void main(String[] args) {
    SpringApplication app = new SpringApplication(DemoApplication.class);

    String port = System.getenv("APP_PORT");
    if (port != null) {
        Map<String, Object> props = new HashMap<>();
        props.put("server.port", port);
        app.setDefaultProperties(props);
    }

    app.run(args);
}

}
