package exerciciosDoCurso;

import java.util.Locale;
import java.util.Scanner;


/*Verificação de Par ou Ímpar
Peça ao usuário um número e informe se ele é par ou ímpar.*/

public class ParOuImpar {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");

        int number = sc.nextInt();

        if (number % 2 == 0) {
            System.out.printf("O número %d é par", number);

        }else{
            System.out.printf("O número %d é Impar", number);
        }

        sc.close();
    }
}
