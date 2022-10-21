package org.gisbis.organization.microservice.service;

import org.gisbis.organization.microservice.model.Organization;
import org.gisbis.organization.microservice.model.User;
import org.gisbis.organization.microservice.repository.OrganizationRepo;
import org.gisbis.organization.microservice.service.client.UserRestTemplateClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrganizationService {
    @Autowired
    UserRestTemplateClient restTemplateClient;
    private final OrganizationRepo organizationRepo;

    public OrganizationService(OrganizationRepo organizationRepo) {
        this.organizationRepo = organizationRepo;
    }

    public User getUserById(int userId){
        return restTemplateClient.getUser(userId);
    }

    public List<Organization> getOrganizations(){
        return organizationRepo.findAll();
    }

}
