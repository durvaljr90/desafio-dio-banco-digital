public class Main {

    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setNome("Durval");

        Conta corrente = new ContaCorrente(cliente);
        Conta poupanca = new ContaPoupanca(cliente);


        corrente.depositar(100);
        corrente.sacar(200);
        corrente.transferir(90, poupanca);

        //corrente.imprimirExtrato();
        //poupanca.imprimirExtrato();
    }
}
