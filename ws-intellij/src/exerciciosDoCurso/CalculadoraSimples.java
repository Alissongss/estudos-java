package exerciciosDoCurso;

import java.util.Scanner;

    public class CalculadoraSimples {
        public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("CALCULADORA SIMPLES +  -  *  /");

        System.out.print("Digite o primeiro número: \n");
        double number1 = leitor.nextDouble();

        System.out.print("Digite o segundo número: \n");
        double number2 = leitor.nextDouble();

        System.out.print("Digite a operação que deseja realizar entre os dois números ou digite x para encerrar a calculadora: ");

        char operador = leitor.next().charAt(0);
        double resultado = 0;

        while (operador != 'x') {

            switch (operador) {
                case '+':
                    resultado = number1 + number2;
                    System.out.printf("O resultado da operação é: %.2f: \n\n", resultado);
                    break;

                case '-':
                    resultado = number1 - number2;
                    System.out.printf("O resultado da operação é: %.2f: \n\n", resultado);
                    break;

                case '*':
                    resultado = number1 * number2;
                    System.out.printf("O resultado da operação é: %.2f: \n\n", resultado);
                    break;

                case '/':
                    if (number2 == 0) {
                        System.out.println("Não é possível realizar divisão por zero.");
                    } else {
                        resultado = number1 / number2;
                        System.out.printf("O resultado da operação é: %.2f: \n\n", resultado);

                    }break;

                default:
                    System.out.println("Operador não aceitável. Digite um operdor entre +, -, * ou /.");
                    System.out.println("OU DIGITE x PARA ENCERRAR A CALCULADORA.");

            }

            System.out.print("Digite a operação que deseja realizar entre os dois números: \n");
            operador = leitor.next().charAt(0);

        }
        System.out.println("CALCULADORA ENCERRADA.");
        leitor.close();

    }
}

