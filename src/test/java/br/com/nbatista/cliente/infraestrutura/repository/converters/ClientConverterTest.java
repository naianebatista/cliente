package br.com.nbatista.cliente.infraestrutura.repository.converters;

import br.com.nbatista.cliente.dominio.entidades.Cliente;
import br.com.nbatista.cliente.infraestrutura.repository.entities.ClientEntity;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ClientConverterTest {

    @Test
    void shouldConvertClientEntityToClient() {
        Cliente clienteReferencia = new Cliente();
        clienteReferencia.setId(1L);
        clienteReferencia.setNome("Ana");
        clienteReferencia.setCpf("94222258784");

        ClientEntity entity = new ClientEntity();
        entity.setId(1L);
        entity.setNome("Ana");
        entity.setCpf("94222258784");

        var response = ClientConverter.convert(entity);

        Assertions.assertEquals(clienteReferencia, response);


    }

    @Test
    void shouldConvertClientToClientEntity() {
        Cliente cliente = new Cliente();
        cliente.setId(1L);
        cliente.setNome("Ana");
        cliente.setCpf("94222258784");

        ClientEntity entityreference = new ClientEntity();
        entityreference.setId(1L);
        entityreference.setNome("Ana");
        entityreference.setCpf("94222258784");

        var response = ClientConverter.convert(cliente);

        Assertions.assertEquals(entityreference, response);


    }
}