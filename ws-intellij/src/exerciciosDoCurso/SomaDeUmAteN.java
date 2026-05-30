package exerciciosDoCurso;

import java.util.Scanner;

public class SomaDeUmAteN {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite um número inteiro positivo: ");
        int n = leitor.nextInt();
        int i;
        int soma = 0;

        for (i = 1; i <= n; i++) {
            soma = soma + i;
            //System.out.println("Incrementando e somando. Aguarde o resultado final.");

        }

        System.out.printf("O número n digitado foi %d e a soma de 1 a n é: %d.\n", n, soma);

        leitor.close();


    }
}
