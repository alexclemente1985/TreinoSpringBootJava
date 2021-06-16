package br.com.springboot.alexandre.treino.repositories;

import br.com.springboot.alexandre.treino.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
