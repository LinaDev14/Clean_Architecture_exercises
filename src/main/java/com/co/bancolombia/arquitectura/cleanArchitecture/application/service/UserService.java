package com.co.bancolombia.arquitectura.cleanArchitecture.application.service;

import com.co.bancolombia.arquitectura.cleanArchitecture.domain.entity.User;
import com.co.bancolombia.arquitectura.cleanArchitecture.domain.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService implements UserInterface {

    private UserRepository userRepository;



    @Override
    public List<User> getUsers() {

        return userRepository.findAll()
                .stream().toList();
    }

    @Override
    public Optional<User> getUserById() {
        return Optional.empty();
    }
}
