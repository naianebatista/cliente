package br.com.nbatista.cliente.controller;

import br.com.nbatista.cliente.dominio.entidades.Cliente;
import br.com.nbatista.cliente.dominio.useCases.ConsultaClientePorId;
import br.com.nbatista.cliente.dominio.useCases.CriaCliente;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping("/usuario")
@AllArgsConstructor
public class ClienteController {
    @Autowired
    CriaCliente criaCliente;
    @Autowired
    ConsultaClientePorId consultaClientePorId;


    @PostMapping("/criar")
    public Object createCliente(@RequestBody Cliente cliente){
        return criaCliente.execute(cliente);
    }

    @GetMapping("/{id}")
    public Cliente consultarUsuarioPorId(@PathVariable Long id){
        final var cliente = consultaClientePorId.execute(id);
        return cliente;

    }


}
