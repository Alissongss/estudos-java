package exercicios.aula25a27.classesemetodos;
import java.util.Scanner;

public class ContaCorrente {

    int numeroConta;
    String digitoConta;
    int agenciaConta;
    String nomeCliente;
    String cpfCliente;
    double saldoConta;
    boolean especial;


    double sacar(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor do saque: ");
        double valorSaque = sc.nextDouble();
        System.out.printf("O valor do saque é: R$ %.2f %n", valorSaque);
        if (!especial && valorSaque > saldoConta){
            System.out.println("Seu saldo é: R$ "+ saldoConta + " <<< SALDO INSUFICIENTE. >>>");
            valorSaque = 0;
        }
        return valorSaque;
    }

    double depositar(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor que será depositado: ");
        double valorDeposito = sc.nextDouble();
        System.out.printf("Depósito realizado: R$ %.2f %n", valorDeposito);
        return valorDeposito;

    }



}
