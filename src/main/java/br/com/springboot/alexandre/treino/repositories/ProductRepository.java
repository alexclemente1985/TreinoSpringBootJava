package br.com.springboot.alexandre.treino.repositories;

import br.com.springboot.alexandre.treino.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
