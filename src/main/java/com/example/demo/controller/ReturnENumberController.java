package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;

@RestController
public class ReturnENumberController {

    @GetMapping("/api/v1/user")
    public Map<String, String> getUserId() {

        Map<String, String> response = new HashMap<>();
            response.put("userNumber", "82022401");
        return response;

    }
}
