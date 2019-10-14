package com.example.greeting.exception;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class GreetingException extends Exception implements Serializable {

    private static final long serialVersionUID = 1L;

    private final int code;
    private final String message;
    private final String nativeMessage;

}
