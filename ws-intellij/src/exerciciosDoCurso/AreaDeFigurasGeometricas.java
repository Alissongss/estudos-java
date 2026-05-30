package exerciciosDoCurso;

import java.util.Scanner;
import java.util.Locale;


public class AreaDeFigurasGeometricas {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor de três variáveis A, B e C, para cálculo de áreas de figuras geométricas:");
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();
        double pi = 3.14159;

        // Área do triângulo de base A e altura C.
        double area_tri = A*C/2;

        // Área do círculo de raio C. Considere pi = 3.141519.
        double area_circ = pi*Math.pow(C, 2);

        // Área do trapézio que tem A e B por bases e C por altura.
        double area_trap = (A+B)*C/2;

        // Área do quadrado de lado B.
        double area_quad = Math.pow(B,2);

        //Área do retângulo que tem lados A e B.
        double area_ret = A*B;



        System.out.printf("A área do triângulo é: %.3f unidades de área\n", area_tri);
        System.out.printf("A área do triângulo é: %.3f unidades de área\n", area_circ);
        System.out.printf("A área do triângulo é: %.3f unidades de área\n", area_trap);
        System.out.printf("A área do triângulo é: %.3f unidades de área\n", area_quad);
        System.out.printf("A área do triângulo é: %.3f unidades de área\n", area_ret);
        sc.close();
    }


}
