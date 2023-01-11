package br.com.nbatista.cliente.infraestrutura.repository.adapters;

import br.com.nbatista.cliente.dominio.entidades.Cliente;
import br.com.nbatista.cliente.dominio.repositories.ClienteRepository;
import br.com.nbatista.cliente.infraestrutura.repository.ClientRepository;
import br.com.nbatista.cliente.infraestrutura.repository.converters.ClientConverter;
import br.com.nbatista.cliente.infraestrutura.repository.entities.ClientEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class ClientRepositoryAdapter implements ClienteRepository {
    @Autowired
    ClientRepository repository;

    @Autowired
    ClientEntity entity;
    @Override
    public Cliente save(Cliente cliente) {
        var clientEntity = ClientConverter.convert(cliente);
        var response = repository.save(clientEntity);
        return ClientConverter.convert(response);
    }
    @Override
    public Optional<Cliente> findById(Long id) {
        var response = repository.findById(id);
       ClientEntity clientEntity =  response.get();
       Cliente cliente = ClientConverter.convert(clientEntity) ;
       return Optional.of(cliente);

    }
}
