package ExerciciciosExtrasGemini;

import java.util.Scanner;
import java.util.Arrays;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.print("Vamos calcular a Série de Fibonacci dos n primeros números. Digite um número inteiro.");
        Scanner leitor = new Scanner(System.in);
        int comprimento = leitor.nextInt();

        while (comprimento < 2) {
            System.out.println("Digite um número inteiro maior ou igual a 2. \n");
            comprimento = leitor.nextInt();

        }
        int[] fibo = new int[comprimento];
        fibo[0] = 0;
        fibo[1] = 1;
        System.out.print(fibo[0] + " ");
        System.out.print(fibo[1] + " ");

        for (int i = 2; i < (comprimento); i++) {
            fibo[i] = fibo[i - 2] + fibo[i - 1];
            System.out.print(fibo[i] + " ");

        }
        //System.out.println(Arrays.toString(fibo));
        leitor.close();


    }


}





