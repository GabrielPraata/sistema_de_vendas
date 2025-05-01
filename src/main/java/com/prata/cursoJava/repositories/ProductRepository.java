package com.prata.cursoJava.repositories;

import com.prata.cursoJava.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
