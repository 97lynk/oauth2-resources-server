package com.example.authclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedHashMap;
import java.util.Map;

@SpringBootApplication
@RestController
public class AuthClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(AuthClientApplication.class, args);
    }

    @GetMapping("/api/index")
    @PreAuthorize("hasAuthority('ADMIN')")
    public Object index(){
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("test", 123);

        return map;
    }
}
