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

    @GetMapping("/world4")
    public String world4(@RequestParam("name") String name) {
        return "hello world" + name;
    }

    @GetMapping("/world5")
    public String world5(@RequestParam("name") String name) {
        return "hello world" + name;
    }

    @GetMapping("/world6")
    public String world6(@RequestParam("name") String name) {
        return "hello world" + name;
    }

    @GetMapping("/world7")
    public String world7(@RequestParam("name") String name) {
        return "hello world" + name;
    }

    @GetMapping("/world8")
    public String world8(@RequestParam("name") String name) {
        return "hello world" + name;
    }

    @GetMapping("/world9")
    public String world9(@RequestParam("name") String name) {
        return "hello world" + name;
    }

    @GetMapping("/world10")
    public String world10(@RequestParam("name") String name) {
        return "hello world" + name;
    }

}
