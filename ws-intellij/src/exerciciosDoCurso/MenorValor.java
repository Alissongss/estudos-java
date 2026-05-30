package exerciciosDoCurso;

import java.util.Scanner;
import java.util.Locale;

import java.util.Locale;

public class MenorValor {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite três números para serem comparados: ");
        double number1 = sc.nextDouble();
        double number2 = sc.nextDouble();
        double number3 = sc.nextDouble();
        double menor = 0;

        /*Depois da inicialização das variáveis, vamos começar a comparação entre elas,
          colocando o maior número dentro da variável "maior"*/

        if (number1 < number2 && number1 < number3) {
            menor = number1;

        } else if (number2 < number3) {
            menor = number2;

        } else {
            menor = number3;
        }
        System.out.printf("O menor número é %.2f: ", menor);

        sc.close();

    }


}
