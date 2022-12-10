package com.example.demo.contoller;

import com.example.demo.entity.User;
import com.example.demo.service.FirstService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FirstController {
    private final FirstService firstService;


    public FirstController(FirstService firstService) {
        this.firstService = firstService;
    }

    @GetMapping("/list")
    public List<User> firstController() {
        return firstService.firstTest();
    }
}