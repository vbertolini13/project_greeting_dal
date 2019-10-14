package com.example.greeting.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.greeting.util.Constants;

@RestController
@RequestMapping("/healthCheck")
public class HealthCheckController extends BaseController{

    @PostMapping(value = "", produces = Constants.TYPE_JSON)
    public ResponseEntity<String> healthCheck() {
        return new ResponseEntity<>(getResponseHeaders(), HttpStatus.OK);
    }
}
