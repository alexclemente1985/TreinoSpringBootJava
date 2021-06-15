package br.com.springboot.alexandre.treino;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class TreinoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TreinoApplication.class, args);
		System.out.println("Vai funcionar!!!");
	}

}
