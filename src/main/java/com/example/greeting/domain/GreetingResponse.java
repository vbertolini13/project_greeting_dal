package com.example.greeting.domain;

import java.io.Serializable;
import lombok.Data;

@Data
public class GreetingResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    private String mensaje;
}
