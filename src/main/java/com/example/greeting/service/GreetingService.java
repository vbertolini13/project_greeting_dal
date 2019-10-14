package com.example.greeting.service;

import com.example.greeting.domain.GreetingResponse;

public interface GreetingService {

    public GreetingResponse greeting(String nombre);
}