package exerciciosDoCurso;

import java.util.Scanner;

// 18. Série de Fibonacci
public class Fibonacci2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número de termos da série de Fibonacci: ");
        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("Por favor, digite um número positivo.");
        } else if (n == 1) {
            System.out.println("Série de Fibonacci: 0");
        } else {
            long a = 0, b = 1;
            System.out.print("Série de Fibonacci: " + a + ", " + b);
            for (int i = 2; i < n; i++) {
                long proximo = a + b;
                System.out.print(", " + proximo);
                a = b;
                b = proximo;
            }
            System.out.println();
        }
        scanner.close();
    }
}
