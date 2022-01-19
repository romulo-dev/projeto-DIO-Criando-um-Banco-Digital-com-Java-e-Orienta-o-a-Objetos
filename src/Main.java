package src;

public class Main {

    public static void main(String[] args) {

        Banco banco1 = new Banco("Braminas");
        Conta conta1 = new ContaCorrente(1, 1, 200);
        Conta conta2 = new ContaPoupanca(1, 32, 1000);
        Conta conta3 = new ContaPoupanca(2, 234, 800);
        Conta conta4 = new ContaPoupanca(3, 42, 500);

        Cliente cliente1 = new Cliente("Romulo", 99999908, conta1);
        Cliente cliente2 = new Cliente("Venilton", 978777708, conta3);



        //cliente1.getContas().add(conta1);
        cliente1.getContas().add(conta2);
        //cliente2.getContas().add(conta3);
        cliente2.getContas().add(conta4);

        banco1.getClientes().add(cliente1);
        banco1.getClientes().add(cliente2);

        System.out.println("Qunatidade de clientes: "+ banco1.getClientes().size());
        System.out.println("Listando os clientes");
        for(int i=0; i< banco1.getClientes().size(); i++){
            System.out.println("Nome: " + banco1.getClientes().stream().toList().get(i).getNome()
            +" - CPF: " + banco1.getClientes().stream().toList().get(i).getCpf());
        }



    }

}
