package br.com.springboot.alexandre.treino.services;

import br.com.springboot.alexandre.treino.entities.Order;
import br.com.springboot.alexandre.treino.entities.User;
import br.com.springboot.alexandre.treino.repositories.OrderRepository;
import br.com.springboot.alexandre.treino.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    public List<Order> findAll(){
        return repository.findAll();
    }

    public Order findById(Long id){
        Optional<Order> obj = repository.findById(id);
        return obj.get();
    }
}
