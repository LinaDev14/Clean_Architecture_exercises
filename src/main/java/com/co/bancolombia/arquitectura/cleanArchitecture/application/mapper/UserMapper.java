package com.co.bancolombia.arquitectura.cleanArchitecture.application.mapper;

import com.co.bancolombia.arquitectura.cleanArchitecture.domain.dto.UserDto;
import com.co.bancolombia.arquitectura.cleanArchitecture.domain.entity.User;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class UserMapper {

    public Function<User, UserDto> mapToDtoUser(){

        return user -> new UserDto(
                user.getId(),
                user.getFirstName(),
                user.getLastName(),
                user.getAge(),
                user.getNumberPhone(),
                user.getEmail()
        );
    }

    public Function<UserDto, User> mapToUser(){

        return userDto -> new User(
                userDto.getId(),
                userDto.getFirstName(),
                userDto.getLastName(),
                userDto.getAge(),
                userDto.getNumberPhone(),
                userDto.getEmail()
        );
    }
}
