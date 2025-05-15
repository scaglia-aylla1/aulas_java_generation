package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {

    @GetMapping
    public String hello() {
        return "<marquee>Hello World!</marquee>";
    }

    @GetMapping ("/turma82")
    public String turmaJava82() {
        return "<b>A Turma Java 82 é TOP!</b>";
    }
}