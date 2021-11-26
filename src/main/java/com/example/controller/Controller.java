package com.example.controller;

import com.example.model.HelloResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @RequestMapping("/")
    @ResponseBody
    public HelloResponse home(@RequestParam String username) {
        HelloResponse hello = new HelloResponse();
        hello.setHello(username);
        return hello;
    }

}