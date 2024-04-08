package com.co.bancolombia.arquitectura.cleanArchitecture.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    private Long id;
    private String firstName;
    private String lastName;
    private String age;
    private String numberPhone;
    private String email;

}
