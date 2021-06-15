package br.com.springboot.alexandre.treino.repositories;

import br.com.springboot.alexandre.treino.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
