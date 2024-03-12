package com.pcarpentier.tutospringboot.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("test")
public class TestController {
    @GetMapping(path="/")
    public ResponseEntity<String> getString() {
        return new ResponseEntity<String>("Helloworld" , HttpStatus.OK);
    }

    @GetMapping(path="/strings")
    public ResponseEntity<List<String>> getStrings() {
        return new ResponseEntity<List<String>>(List.of("Helloworld", "djhdh") , HttpStatus.OK);
    }

}
