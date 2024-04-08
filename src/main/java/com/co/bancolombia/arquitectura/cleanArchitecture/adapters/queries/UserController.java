package com.co.bancolombia.arquitectura.cleanArchitecture.adapters.queries;


import com.co.bancolombia.arquitectura.cleanArchitecture.application.service.UserService;
import com.co.bancolombia.arquitectura.cleanArchitecture.domain.dto.UserDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/query")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;


    // localhost:8080/api/query/listUsers
    @GetMapping("/listUsers")
    public ResponseEntity<List<UserDto>>  listUsers(){
        return new ResponseEntity<>(userService.getUsers(), HttpStatus.OK);
    }

    // localhost:8080/api/query/listUser?id={id}
    @GetMapping("/findUserById")
    public ResponseEntity<Optional<UserDto>> findById(@RequestParam Long id){
        return new ResponseEntity<>(userService.getUserById(id), HttpStatus.OK);
    }

}
