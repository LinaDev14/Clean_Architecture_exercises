package com.co.bancolombia.arquitectura.cleanArchitecture.application.service;

import com.co.bancolombia.arquitectura.cleanArchitecture.application.mapper.UserMapper;
import com.co.bancolombia.arquitectura.cleanArchitecture.domain.dto.UserDto;
import com.co.bancolombia.arquitectura.cleanArchitecture.domain.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService implements UserInterface {

    private final UserRepository userRepository;
    private final UserMapper userMapper;


    @Override
    public List<UserDto> getUsers() {
        return userRepository.findAll()
                .stream()
                .map(userMapper.mapToDtoUser())
                .toList();
    }

    @Override
    public Optional<UserDto> getUserById(Long id) {
        return userRepository.findById(id)
                .map(userMapper.mapToDtoUser());

    }
}
