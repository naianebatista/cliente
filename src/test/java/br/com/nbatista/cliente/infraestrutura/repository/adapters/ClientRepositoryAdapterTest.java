package br.com.nbatista.cliente.infraestrutura.repository.adapters;

import br.com.nbatista.cliente.dominio.entidades.Cliente;
import br.com.nbatista.cliente.infraestrutura.repository.ClientRepository;
import br.com.nbatista.cliente.infraestrutura.repository.entities.ClientEntity;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

@ExtendWith(MockitoExtension.class)
class ClientRepositoryAdapterTest {
    @InjectMocks
    ClientRepositoryAdapterImpl clientRepositoryAdapter;

    @Mock
    ClientRepository clienteRepository;

    @Test
    void shouldReturnClientWhenIdValid() {
        Cliente clienteReferencia = new Cliente();
        clienteReferencia.setId(1L);
        clienteReferencia.setNome("Ana");
        clienteReferencia.setCpf("94222258784");

        ClientEntity clienteReturn = new ClientEntity();
        clienteReturn.setId(1L);
        clienteReturn.setNome("Ana");
        clienteReturn.setCpf("94222258784");

        Mockito.when(clienteRepository.findById(1L)).thenReturn(Optional.of(clienteReturn));

        var response = clientRepositoryAdapter.findById(1L);

        Assertions.assertEquals(Optional.of(clienteReferencia),response);


    }
}