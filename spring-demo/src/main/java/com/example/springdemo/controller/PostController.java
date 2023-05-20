package com.example.springdemo.controller;

import com.example.springdemo.model.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * @Author: lg
 * @Date: 2023/3/4
 */
@RestController
@RequestMapping("/post")
public class PostController {

    @PostMapping("/one")
    public String postOne(@RequestBody User user) {
        return user.toString();
    }

    @PostMapping("/file")
    public String postFile(MultipartFile file) {
        return file.getOriginalFilename();
    }

}
