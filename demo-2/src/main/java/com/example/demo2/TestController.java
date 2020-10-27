package com.example.demo2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/ok")
    public String test() {
        System.out.println("hello world");
        return "hello world";
    }

    @GetMapping("/jay")
    public String jay() {
        System.out.println("jay");
        return "jay";
    }

}
