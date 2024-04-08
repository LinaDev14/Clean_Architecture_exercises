package com.co.bancolombia.arquitectura.cleanArchitecture.application.service;

import com.co.bancolombia.arquitectura.cleanArchitecture.domain.dto.UserDto;
import com.co.bancolombia.arquitectura.cleanArchitecture.domain.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserInterface {

    List<UserDto> getUsers();

    Optional<UserDto> getUserById(Long id);
}
