package org.gisbis.test.microservice.service;

import lombok.RequiredArgsConstructor;
import org.gisbis.test.microservice.model.User;
import org.gisbis.test.microservice.repository.UserRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepo userRepo;

    public List<User> getAllUsers(){
        return userRepo.findAll();
    }

    public User getUserById(int userId) {
        return userRepo.findById(userId).orElse(null);
    }
}
