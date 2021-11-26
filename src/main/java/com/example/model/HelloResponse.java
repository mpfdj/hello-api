package com.example.model;

import lombok.Data;

@Data
public class HelloResponse {
    private String hello;
    public void setHello(String username) {
        hello = "Hello " + username + ", this is the reply of the hello api...";
    }
}
