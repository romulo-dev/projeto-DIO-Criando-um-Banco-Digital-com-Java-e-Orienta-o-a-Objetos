package src;

public class ContaPoupanca extends Conta {

    /*public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }*/

    public ContaPoupanca(int agencia, int numero, double saldo) {
        super(agencia, numero, saldo);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupança ===");
        super.imprimirInfosComuns();
    }
}
