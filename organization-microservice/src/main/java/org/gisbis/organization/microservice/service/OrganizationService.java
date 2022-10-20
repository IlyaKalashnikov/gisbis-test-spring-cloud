package org.gisbis.organization.microservice.service;

import org.gisbis.organization.microservice.model.User;
import org.gisbis.organization.microservice.service.client.UserRestTemplateClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrganizationService {
    @Autowired
    UserRestTemplateClient restTemplateClient;

    public User getUserById(int userId){
        return restTemplateClient.getUser(userId);
    }

}
