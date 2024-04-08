package com.co.bancolombia.arquitectura.cleanArchitecture.application.service;

import com.co.bancolombia.arquitectura.cleanArchitecture.domain.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserInterface {

    List<User> getUsers();

    Optional<User> getUserById();
}
