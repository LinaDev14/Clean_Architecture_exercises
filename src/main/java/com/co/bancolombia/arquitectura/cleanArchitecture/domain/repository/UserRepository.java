package com.co.bancolombia.arquitectura.cleanArchitecture.domain.repository;

import com.co.bancolombia.arquitectura.cleanArchitecture.domain.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
