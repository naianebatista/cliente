package br.com.nbatista.cliente.dominio.repositories;

import br.com.nbatista.cliente.dominio.entidades.Cliente;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public interface ClientRepositoryAdapter {
    Cliente save(Cliente cliente);

    Optional<Cliente> findById(Long id);
}
