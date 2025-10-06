package com.example.testpj.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hiCont {

    @GetMapping("/api/hi")
    public String hiControl() {
        return "HELLO";
    }

    @GetMapping("/api/tt")
    public ResponseEntity<String> ttControl(
        @RequestParam Integer num,
        @RequestParam String text
    ) {
        return ResponseEntity.ok("num = " + num + ", text = " + text );
    }

    @GetMapping("api/tt/{num}/{text}")
    public ResponseEntity<String> tttControl(
        @PathVariable Long num,
        @PathVariable String text
    ) {
        return ResponseEntity.ok("num = " + num + ", text = " + text );
    }

    @PostMapping("api/tt/{num}/{text}/post")
    public ResponseEntity<String> ttttControl(
        @PathVariable Long num,
        @PathVariable String text
    ) {
        return ResponseEntity.ok("num = " + num + ", text = " + text );
    }


}

