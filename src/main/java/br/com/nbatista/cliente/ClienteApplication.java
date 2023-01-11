package br.com.nbatista.cliente;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("br.com.nbatista.cliente")
@EntityScan("br.com.nbatista.cliente")
public class ClienteApplication {
	public static void main(String[] args) {
		SpringApplication.run(ClienteApplication.class, args);
	}

}
