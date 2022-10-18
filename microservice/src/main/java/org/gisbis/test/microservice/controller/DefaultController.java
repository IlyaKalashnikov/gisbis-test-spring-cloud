package org.gisbis.test.microservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DefaultController {

    @Value("${example.property}")
    private String propertyFromConfigServer;

    @GetMapping("/hello")
    public String defaultEndpoint(){
        return "Hello world!" + " " + propertyFromConfigServer;
    }
}
