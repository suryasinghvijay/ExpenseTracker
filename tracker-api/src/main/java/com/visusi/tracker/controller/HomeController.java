package com.visusi.tracker.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/")
@RestController
public class HomeController {

    @RequestMapping(method = RequestMethod.GET, path = "hello")
    public ResponseEntity<String> hello() {
        System.out.println("hello");
        return new ResponseEntity<String>("hello bro", HttpStatus.OK);
    }
}
