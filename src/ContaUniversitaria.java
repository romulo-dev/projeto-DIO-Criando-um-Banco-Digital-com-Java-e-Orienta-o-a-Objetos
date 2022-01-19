package src;

public class ContaUniversitaria extends Conta{
    String matricula;
    String Universidade;

    public ContaUniversitaria(int agencia, int numero, double saldo, String matricula, String universidade) {
        super(agencia, numero, saldo);
        this.matricula = matricula;
        Universidade = universidade;
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupança ===");
        super.imprimirInfosComuns();
    }
}
