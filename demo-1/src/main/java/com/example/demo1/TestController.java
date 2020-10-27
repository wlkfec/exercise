package com.example.demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/test")
public class TestController {

    @Value("${url}")
    private String url;

    @Value("${name}")
    private String name;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/base")
    public String test() {
        String result = restTemplate.getForObject("http://localhost:7777/test/ok", String.class);
        String result1 = restTemplate.getForObject("http://localhost:7777/test/jay", String.class);

        System.out.println(url);
        System.out.println(name);
        return url + " : " + name + " - " + result + " - " + result1;
    }

}
