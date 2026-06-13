package exercicios.aula25a27.classesemetodos;

import java.sql.SQLOutput;
import java.util.Scanner;

public class TesteContaCorrente {
    public static void main(String[] args) {

        ContaCorrente cliente = new ContaCorrente();
        cliente.nomeBanco = "Banco do Brasil";
        cliente.numeroConta = 25041;
        cliente.digitoConta = "4";
        cliente.agenciaConta = 161;
        cliente.cpfCliente = "36589752412";
        cliente.nomeCliente = "Rogerio Souza";
        cliente.especial = true;
        cliente.saldoConta = 356.27;
        cliente.limite = 10000.00;

        cliente.saudarCliente();
        cliente.entrarNoSistema();

    }
}

