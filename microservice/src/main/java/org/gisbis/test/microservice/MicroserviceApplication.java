package org.gisbis.test.microservice;

import org.gisbis.test.microservice.model.User;
import org.gisbis.test.microservice.repository.UserRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MicroserviceApplication {
    public static void main(String[] args) {
        SpringApplication.run(MicroserviceApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(UserRepo userRepo){
        return args -> {
            User precreatedUser = new User();
            precreatedUser.setName("Ilya Kalashnikov");
            precreatedUser.setEmail("kalashilya@yandex.ru");

            userRepo.save(precreatedUser);
        };
    }
}
