package com.spring_cloud.microservices.currency_exchange_service.repository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sample-api")
public class CircuitBreakerController {

    @GetMapping
    public String sampleAPI(){
        return "Sample API";
    }

}
