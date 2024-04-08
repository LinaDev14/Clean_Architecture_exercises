package com.co.bancolombia.arquitectura.cleanArchitecture.domain.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String firstName;
    private String lastName;
    private String age;
    private String numberPhone;
    private String email;

}
