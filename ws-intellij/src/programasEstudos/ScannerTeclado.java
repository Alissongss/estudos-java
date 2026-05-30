package programasEstudos;//Entrar com variável digitando um valor no teclado

import java.util.Locale;
import java.util.Scanner;


public class ScannerTeclado {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.println("Digite a idade: ");
        int idade = sc.nextInt();

        System.out.println("Digite a altura: ");
        double altura = sc.nextDouble();

        System.out.println("A idade é: " + idade);
        System.out.printf("A altura é: %.2f", altura);



        sc.close();
    }
}
