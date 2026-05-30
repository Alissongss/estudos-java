package exerciciosDoCurso;

import java.util.Scanner;

public class OrdenaTresNumeros {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o primeiro número a ser ordenado: \n");
        int a = leitor.nextInt();

        System.out.print("Digite o segundo número a ser ordenado: \n");
        int b = leitor.nextInt();

        System.out.print("Digite o terceiro número a ser ordenado: \n");
        int c = leitor.nextInt();

        int troca = 0;

        if (a > b) {
            troca = a;
            a = b;
            b = troca;
        }

        if (b > c) {
            troca = b;
            b = c;
            c = troca;
        }

        if (a > b) {
            troca = a;
            a = b;
            b = troca;
        }

        System.out.printf("%d, %d, %d", a, b, c);

    }
}
