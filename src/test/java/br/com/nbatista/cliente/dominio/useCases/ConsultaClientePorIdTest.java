package br.com.nbatista.cliente.dominio.useCases;

import br.com.nbatista.cliente.dominio.entidades.Cliente;
import br.com.nbatista.cliente.dominio.exceptions.ClientNotFoundExeption;
import br.com.nbatista.cliente.infraestrutura.repository.adapters.ClientRepositoryAdapter;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class ConsultaClientePorIdTest {
    @InjectMocks
    private ConsultaClientePorId consultaClientePorId;

    @Mock
    ClientRepositoryAdapter repository;

    @Test
    void deveSerPossivelConsultarUmClienteInformandoId(){
        var clienteReferencia = new Cliente();
        clienteReferencia.setId(1L);
        clienteReferencia.setCpf("12345678909");
        clienteReferencia.setNome("Ana");

        var clienteRetorno = new Cliente();
        clienteRetorno.setId(1L);
        clienteRetorno.setCpf("12345678909");
        clienteRetorno.setNome("Ana");

        Mockito.when(repository.findById(1L)).thenReturn(Optional.of(clienteRetorno));

        final var retorno = consultaClientePorId.execute(1L);

        assertEquals(clienteReferencia,retorno);

    }

    @Test
    void deveRetornarUmRuntimeExceptionQuandoClienteNaoForEncontrado(){
        assertThrows(ClientNotFoundExeption.class, ()-> consultaClientePorId.execute(1L)) ;

    }


}