package com.example.springdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: lg
 * @Date: 2023/3/4
 */
@RestController
@RequestMapping("/hello")
public class HelloController {


    @GetMapping("/world2")
    public String world2(@RequestParam("name") String name) {
        return "hello world" + name;
    }

    @GetMapping("/world3")
    public String world3(@RequestParam("name") String name) {
        return "hello world" + name;
    }

}
