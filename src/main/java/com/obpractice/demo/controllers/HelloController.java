package com.obpractice.demo.controllers;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @GetMapping("/")
    public ResponseEntity<String> hello(){
        return new ResponseEntity<>("Hola Mundo!", HttpStatus.OK);
    }

    @GetMapping("/resources")
    public ResponseEntity<String> resources(){
        return new ResponseEntity<>("Resources", HttpStatus.OK);
    }

    @GetMapping("/admin")
    public ResponseEntity<String> admin(){
        return new ResponseEntity<>("Admin", HttpStatus.OK);
    }

}
