package br.com.springboot.alexandre.treino.repositories;

import br.com.springboot.alexandre.treino.entities.Order;
import br.com.springboot.alexandre.treino.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
