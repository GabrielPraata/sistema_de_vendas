package com.prata.cursoJava.repositories;

import com.prata.cursoJava.entities.Order;
import com.prata.cursoJava.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
