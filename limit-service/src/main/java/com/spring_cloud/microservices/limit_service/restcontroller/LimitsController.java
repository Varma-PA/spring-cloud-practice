package com.spring_cloud.microservices.limit_service.restcontroller;

import com.spring_cloud.microservices.limit_service.bean.Limits;
import com.spring_cloud.microservices.limit_service.configuration.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/limits")
public class LimitsController {

//    @Autowired
    private Configuration configuration;

    @Autowired
    public LimitsController(Configuration configuration){
        this.configuration = configuration;
    }

    @GetMapping
    public Limits retrieveLimits(){
        return new Limits(
                configuration.getMinimum(),
                configuration.getMaximum()
        );
    }

}
