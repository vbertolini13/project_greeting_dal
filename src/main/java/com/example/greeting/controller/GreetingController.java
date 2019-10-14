package com.example.greeting.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.greeting.domain.GreetingRequest;
import com.example.greeting.domain.GreetingResponse;
import com.example.greeting.exception.GreetingException;
import com.example.greeting.service.GreetingService;
import com.example.greeting.util.Constants;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/prueba")
public class GreetingController {

    @Autowired
    private GreetingService greetingService;

    @PostMapping(value = "/nombre", produces = Constants.TYPE_JSON)
    public ResponseEntity<GreetingResponse> greeting(@Valid @RequestBody GreetingRequest req) throws GreetingException {
        log.info(Constants.REQUEST + req);
        GreetingResponse response = greetingService.greeting(req.getNombre());
        log.info(Constants.RESPONSE + response);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
