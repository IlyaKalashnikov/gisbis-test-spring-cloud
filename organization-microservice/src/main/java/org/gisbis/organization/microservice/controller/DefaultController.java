package org.gisbis.organization.microservice.controller;

import lombok.RequiredArgsConstructor;
import org.gisbis.organization.microservice.model.User;
import org.gisbis.organization.microservice.service.OrganizationService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class DefaultController {
    private final OrganizationService organizationService;

    @GetMapping("/{userId}")
    public User getUserById(@PathVariable("userId") int userId){
        return organizationService.getUserById(userId);
    }
}
