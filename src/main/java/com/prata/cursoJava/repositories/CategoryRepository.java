package com.prata.cursoJava.repositories;

import com.prata.cursoJava.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
