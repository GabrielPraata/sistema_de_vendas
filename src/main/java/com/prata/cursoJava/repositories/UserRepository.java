package com.prata.cursoJava.repositories;

import com.prata.cursoJava.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
