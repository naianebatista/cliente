package br.com.nbatista.cliente.dominio.useCases;

import br.com.nbatista.cliente.dominio.entidades.Cliente;
import br.com.nbatista.cliente.dominio.repositories.ClienteRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CriaCliente {
    @Autowired
    ClienteRepository repository;
    public Cliente execute(Cliente cliente){
        return repository.save(cliente);
    }


}
