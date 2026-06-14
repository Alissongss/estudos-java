package exercicios.aula25a27.classesemetodos;

import java.util.Scanner;

public class ContaCorrenteLoiane {

    String numero;
    String agencia;
    boolean especial;
    double limiteEspecial;
    double valorEspecialUsado;
    double saldo;

    void mostrarStatus() {
        System.out.printf("Seu saldo atual é de R$ %.2f %n", saldo);
        if (especial) {
            if (saldo > 0) {
                System.out.printf("Sua conta é especial e seu limite de cheque especial é de R$ %.2f. %n", limiteEspecial);
            }
            else if (saldo < 0) {
                valorEspecialUsado = limiteEspecial + saldo;
                System.out.println("Atenção cliente!!! você está usando o limite do cheque especial!");
                System.out.printf("Seu limite de cheque especial atualizado é R$ %.2f. %n", valorEspecialUsado);
            }

        } else {
            System.out.printf("Sua conta é comum e seu limite de saque é de R$ %.2f. %n", saldo);
        }
        entrarNoSistema();
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
                realizarSaque();
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


    Scanner sc = new Scanner(System.in);

    void realizarSaque() {
        System.out.print("Digite a quantia que deseja sacar: ");
        double quantiaSacar = sc.nextDouble();

        // tem saldo na conta?
        if (saldo >= quantiaSacar) {
            saldo -= quantiaSacar;
            System.out.println("Saque efetuado com sucesso!");
            System.out.println("Saldo atual da conta = " + saldo);
            entrarNoSistema();
        } else { //não tem saldo na conta
            if (especial) {
                //verificar se o limite especial tem saldo
                double limite = limiteEspecial + saldo;
                if (limite >= quantiaSacar) {
                    saldo -= quantiaSacar;
                    System.out.println("Saque efetuado com sucesso!");
                    System.out.println("Saldo atual da conta = " + saldo);
                    entrarNoSistema();
                } else {
                    System.out.println("Não foi possível realizar o saque. Saldo Insuficiente!");
                    entrarNoSistema();
                }
            } else { // não é especial e não tem saldo suficiente
                System.out.println("Não foi possível realizar o saque. Saldo Insuficiente!");
                entrarNoSistema();
            }
        }
    }

    void depositar() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor que deseja depositar: R$ ");
        double deposito = sc.nextDouble();
        saldo = saldo + deposito;
        System.out.printf("Seu saldo agora é de %.2f %n", saldo);
        entrarNoSistema();
    }
}
