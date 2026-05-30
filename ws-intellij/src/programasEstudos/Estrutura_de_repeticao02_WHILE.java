package programasEstudos;

import java.util.Locale;
import java.util.Scanner;

public class Estrutura_de_repeticao02_WHILE {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        // ESTRUTURA WHILE
        //Fazer um programa que lê números inteiros até que um zero seja lido. Ao final mostrar a soma dos números lidos.
        /* primeiro: iniciar uma variável total com valor zero e uma variável number sc com input via teclado;
           segundo: enquanto a variável for um número inteiro diferente de zero, faça:
           soma = soma + number;
           volte e leia number...
         */
        System.out.println("Digite um número diferente de zero: ");

        int number = sc.nextInt();
        int total = 0;

        while (number != 0) {

            total = total + number;
            number = sc.nextInt();

        }
        //System.out.printf("A soma dos números inteiros digitados é: %.f", total);
        System.out.println("A soma dos números inteiros digitados é: " + total);
        sc.close();

    }
}


