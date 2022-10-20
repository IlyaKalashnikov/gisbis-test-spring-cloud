package org.gisbis.test.microservice;

import org.gisbis.test.microservice.model.Organization;
import org.gisbis.test.microservice.model.User;
import org.gisbis.test.microservice.repository.OrganizationRepo;
import org.gisbis.test.microservice.repository.UserRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;

@SpringBootApplication
public class MicroserviceApplication {
    public static void main(String[] args) {
        SpringApplication.run(MicroserviceApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(UserRepo userRepo, OrganizationRepo organizationRepo){
        return args -> {
            Organization precreatedOrg = Organization.builder()
                    .name("GIS BIS")
                    .members(new ArrayList<>())
                    .build();
            User precreatedUser = User.builder()
                    .name("Ilya Kalashnikov")
                    .organization(precreatedOrg)
                    .email("kalashilya@yandex.ru")
                    .build();
            organizationRepo.save(precreatedOrg);
            userRepo.save(precreatedUser);
        };
    }
}
