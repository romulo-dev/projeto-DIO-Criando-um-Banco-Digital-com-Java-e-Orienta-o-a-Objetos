package src;

public class ContaCorrente extends Conta {

    public ContaCorrente(int agencia, int numero, double saldo) {
        super(agencia, numero, saldo);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        super.imprimirInfosComuns();
    }

}
