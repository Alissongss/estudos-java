package exerciciosDoCurso;

import java.util.Scanner;
import java.util.Locale;

public class MaiorValor {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite três números para serem comparados: ");
        double number1 = sc.nextDouble();
        double number2 = sc.nextDouble();
        double number3 = sc.nextDouble();
        double maior = 0;

        /*Depois da inicialização das variáveis, vamos começar a comparação entre elas,
          colocando o maior número dentro da variável "maior"*/

        if (number1 > number2 && number1 > number3) {
            maior = number1;

        } else if (number2 > number3) {
            maior = number2;

        } else {
            maior = number3;
        }
        System.out.printf("O maior número é %.2f: ", maior);

    }


}

