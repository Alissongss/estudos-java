package exerciciosDoCurso;

import java.util.Locale;
import java.util.Scanner;

public class Bhaskara {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Vamos calcular as raízes de uma equação do segundo grau.");
        System.out.println("Digite os coeficientes da equação (double), a, b, c: \n");

        System.out.print("Digite o valor da variável a: ");
        double a = sc.nextDouble();

        while (a == 0){
            System.out.print("Digite um valor diferente de zero para a variável a: ");
            a = sc.nextDouble();

        }

        System.out.print("Digite um valor para a variável b: ");
        double b = sc.nextDouble();
        System.out.print("Digite um valor para a variável c: ");
        double c = sc.nextDouble();


        System.out.printf("Os valores digitados foram %.2f, %.2f e %.2f.", a, b, c);

        System.out.println("Agora vamos calcular o valor de DELTA\n");

        double delta = Math.pow(b, 2) - (4*a*c);
        System.out.println(delta);



        if (delta < 0){
            System.out.println("O valor de DELTA é negativo. Não existem raízes reais.\n\n");
        }else {

            double x1 = (-b + Math.sqrt(delta))/2*a;
            double x2 = (-b - Math.sqrt(delta))/2*a;

            System.out.printf("As raízes da equação são %.2f e %.2f.", x1, x2);

        }

        sc.close();

    }
}
