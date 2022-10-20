package org.gisbis.test.microservice.controller;

import lombok.RequiredArgsConstructor;
import org.gisbis.test.microservice.model.User;
import org.gisbis.test.microservice.service.UserService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class DefaultController {
    private final UserService userService;

    @Value("${example.property}")
    private String propertyFromConfigServer;

    @GetMapping("/hello")
    public String defaultEndpoint() {
        return "Hello world!" + " " + propertyFromConfigServer;
    }

    @GetMapping("/users")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/users/{userId}")
    public User getUser(@PathVariable("userId") int userId){
        return userService.getUserById(userId);
    }
}
