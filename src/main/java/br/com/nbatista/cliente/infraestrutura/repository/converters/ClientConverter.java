package br.com.nbatista.cliente.infraestrutura.repository.converters;

import br.com.nbatista.cliente.dominio.entidades.Cliente;
import br.com.nbatista.cliente.infraestrutura.repository.entities.ClientEntity;

public class ClientConverter {

    public static Cliente convert(ClientEntity entity){
        Cliente cliente = new Cliente();

        cliente.setId(entity.getId());
        cliente.setNome(entity.getNome());
        cliente.setCpf(entity.getCpf());

        return cliente;

    }

    public static ClientEntity convert(Cliente cliente) {
        ClientEntity entity = new ClientEntity();

        entity.setId(cliente.getId());
        entity.setNome(cliente.getNome());
        entity.setCpf(cliente.getCpf());

        return entity;
    }
}
