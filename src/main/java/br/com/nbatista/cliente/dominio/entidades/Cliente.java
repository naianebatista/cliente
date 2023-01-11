package br.com.nbatista.cliente.dominio.entidades;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Setter
@Getter
public class Cliente {

    private Long id;
    String nome;
    String cpf;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(id, cliente.id) && Objects.equals(nome, cliente.nome) && Objects.equals(cpf, cliente.cpf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, cpf);
    }
}
