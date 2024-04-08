package com.co.bancolombia.arquitectura.cleanArchitecture;

import com.co.bancolombia.arquitectura.cleanArchitecture.application.service.UserService;
import com.co.bancolombia.arquitectura.cleanArchitecture.domain.dto.UserDto;
import com.co.bancolombia.arquitectura.cleanArchitecture.domain.entity.User;
import com.co.bancolombia.arquitectura.cleanArchitecture.domain.repository.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;



public class UserServiceTest {

    private UserService userService;
    private UserRepository userRepositoryMock;

    @BeforeEach
    public void setUp() {
        userRepositoryMock = mock(UserRepository.class);
        //userService = new UserService(userRepositoryMock);
    }

    @Test
    public void testFindUserById() {
        // Arrange
        Long id = 1L;
        User userMock = new User(id, "Lina", "Guerrero", "25", "3182991851", "HolaMundo@gmail.com");

        when(userRepositoryMock.findById(id)).thenReturn(Optional.of(userMock));

        // Act
        Optional<UserDto> result = userService.getUserById(id);

        // Assert
        assertEquals(userMock, result);
        verify(userRepositoryMock, times(1)).findById(id);
    }
}
