package src;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Banco {

    private String nome;
    private List<Conta> contas;
    private Set<Cliente> clientes = new HashSet<>();

    public Banco(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public Set<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(Set<Cliente> clientes) {
        this.clientes = clientes;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

}

