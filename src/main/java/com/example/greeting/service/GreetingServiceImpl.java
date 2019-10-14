package com.example.greeting.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;
import com.example.greeting.domain.GreetingResponse;

@Service
@PropertySource("classpath:/application.properties")
public class GreetingServiceImpl implements GreetingService {
	
	@Value("${service.greeting.saludo}") 
	private String mensaje;	
	
    public GreetingResponse greeting(String nombre) {
    	GreetingResponse response = new GreetingResponse();
    	response.setMensaje(mensaje+" "+ nombre.toString() +"!!");
		return response;
    }
}
