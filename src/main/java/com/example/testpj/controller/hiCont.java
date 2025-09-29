package com.example.testpj.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hiCont {

    @GetMapping("/api/hi")
    public String hiControl() {
        return "HELLO";
    }


}

