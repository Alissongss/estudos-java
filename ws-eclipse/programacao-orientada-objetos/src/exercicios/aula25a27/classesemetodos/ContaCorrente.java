package exercicios.aula25a27.classesemetodos;

import java.util.Scanner;

public class ContaCorrente {

    String nomeBanco;
    int numeroConta;
    String digitoConta;
    int agenciaConta;
    String nomeCliente;
    String cpfCliente;
    double saldoConta;
    boolean especial;
    double limite;
    double saqueMaximo;

    void saudarCliente() {
        System.out.printf("Olá Sr(a) %s! Bem vindo ao %s! %n", nomeCliente, nomeBanco);
    }

    void entrarNoSistema() {
        Scanner sc = new Scanner(System.in);
        int entraSistema = 0;

        while (entraSistema != 1 && entraSistema != 2) {
            System.out.println("Digite 1 para para continuar no sistema ou digite 2 para sair.");
            entraSistema = sc.nextInt();
            if (entraSistema == 1) {
                escolherOpcao();

            } else if (entraSistema == 2) {
                System.out.println("Você optou por não entrar no sistema. Até logo!");


            } else {
                System.out.println("Opção inválida! Tente novamente!");
            }
        }

    }


    void escolherOpcao() {
        System.out.println("Digite 1 para saldo: ");
        System.out.println("Digite 2 para sacar: ");
        System.out.println("Digite 3 para depositar: ");
        System.out.println("Digite 4 para sair: ");

        Scanner sc = new Scanner(System.in);

        String opcao = sc.nextLine();

        switch (opcao) {
            case "1":
                mostrarStatus();
                break;

            case "2":
                sacar();
                break;

            case "3":
                depositar();
                break;

            case "4":
                System.out.println("Saindo do sistema... Até logo!");
                break;


            default:
                System.out.println("Opção inválida: ");
                System.out.println("Digite 1 para saldo: ");
                System.out.println("Digite 2 para sacar: ");
                System.out.println("Digite 3 para depositar: ");
                System.out.println("Digite 4 para sair: ");
        }
    }

    void mostrarStatus() {
        System.out.printf("Seu saldo atual é de R$ %.2f %n", saldoConta);
        if (especial) {
            double saldoTotal = saldoConta + limite;
            System.out.printf("Sua conta é especial e seu limite de cheque especial é de R$ %.2f. %nPortanto, vc pode sacar no máximo R$ %.2f.%n", limite, saldoTotal);
            if (saldoTotal < 0) {
                System.out.println("Atenção cliente!!! você está usando o limite do cheque especial!");
            }
        } else {
            System.out.printf("Sua conta é comum e seu limite de saque é de R$ %.2f. %n", saldoConta);
        }
        entrarNoSistema();
    }


    void sacar() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor do saque: ");
        double saque = sc.nextDouble();
        if (especial) {
            saqueMaximo = saldoConta + limite;
        } else {
            saqueMaximo = saldoConta;
        }
        if (saque <= saqueMaximo) {
            if (saque <= saldoConta) {
                saldoConta = saldoConta - saque;
            } else {
                saldoConta = saque - saqueMaximo;
            }
            System.out.printf("Saque no valor de R$ %.2f foi efetuado. O saldo atual é de R$ %.2f %n", saque, saldoConta);
        } else {
            System.out.printf("Saque não pode ser efetuado. Seu limite é de R$ %.2f %n", saqueMaximo);
        }
        entrarNoSistema();
    }

    void depositar() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor que deseja depositar: R$ ");
        double deposito = sc.nextDouble();
        saldoConta = saldoConta + deposito;
        System.out.printf("Seu saldo agora é de %.2f %n", saldoConta);
        entrarNoSistema();
    }

    void consultarSaldo() {

    }

    void verificarUsoEspecial() {

    }

}
