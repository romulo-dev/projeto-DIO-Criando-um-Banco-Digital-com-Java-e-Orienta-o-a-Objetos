package src;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    private String nome;
    private long cpf;
    private List<Conta> contas = new ArrayList<>();



    public Cliente(String nome, long cpf, Conta conta) {
        this.nome = nome;
        this.cpf = cpf;
        this.getContas().add(conta);
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
