package br.com.nbatista.cliente.infraestrutura.repository;

import br.com.nbatista.cliente.infraestrutura.repository.entities.ClientEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends CrudRepository<ClientEntity,Long> {

}
