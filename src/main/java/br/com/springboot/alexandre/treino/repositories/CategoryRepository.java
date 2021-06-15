package br.com.springboot.alexandre.treino.repositories;

import br.com.springboot.alexandre.treino.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
