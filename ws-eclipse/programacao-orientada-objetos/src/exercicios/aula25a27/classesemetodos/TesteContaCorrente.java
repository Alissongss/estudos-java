package exercicios.aula25a27.classesemetodos;

public class TesteContaCorrente {
    public static void main(String[] args) {

        ContaCorrente cliente = new ContaCorrente();
        cliente.numeroConta = 25041;
        cliente.digitoConta = "4";
        cliente.agenciaConta = 161;
        cliente.cpfCliente = "36589752412";
        cliente.nomeCliente = "Rogerio Souza";
        cliente.especial = true;
        cliente.saldoConta = 356.27;


        double deposito = cliente.depositar();
        cliente.saldoConta = cliente.saldoConta + deposito;

        double saque = cliente.sacar();
        cliente.saldoConta = cliente.saldoConta - saque;

        System.out.println("O saldo da conta é R$ " + cliente.saldoConta);


    }
}
