package br.com.nbatista.cliente.dominio.useCases;

import br.com.nbatista.cliente.dominio.entidades.Cliente;
import br.com.nbatista.cliente.dominio.exceptions.ClientNotFoundExeption;
import br.com.nbatista.cliente.infraestrutura.repository.adapters.ClientRepositoryAdapterImpl;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ConsultaClientePorId {
    @Autowired
    ClientRepositoryAdapterImpl clientRepositoryAdapter;
    public Cliente execute(Long id) {
//        Cliente cliente = new Cliente();
//        try{
//            cliente = clientRepositoryAdapter.findById(id).get();
//        }catch (Exception e){
//            throw new ClientNotFoundExeption();
//        }
        return clientRepositoryAdapter.findById(id).orElseThrow(ClientNotFoundExeption::new);
    }
}
