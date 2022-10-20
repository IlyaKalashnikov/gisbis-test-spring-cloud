package org.gisbis.organization.microservice.service.client;

import org.gisbis.organization.microservice.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class UserRestTemplateClient {
    @Autowired
    RestTemplate restTemplate;

    public User getUser(int userId){
        ResponseEntity<User> restExchange = restTemplate.exchange(
                "http://microservice/api/users/{userId}",
                HttpMethod.GET, null, User.class, userId);
        return restExchange.getBody();
    }
}
