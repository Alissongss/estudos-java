package exerciciosDoCurso;
import java.util.Scanner;

public class ExibeDe1A10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        // EXIBE OS NÚMEROS DE 1 A 10
        /*System.out.println("Contagem crescente de 1 a 10");
        for (int number = 1; number <= 10; number++) {
            System.out.println(number);*/

            //-----------------------------------------------------------------------------------------------------------------

        // TABUADA DE 1 A 10 DE UM DETERMINADO NÚMERO

        System.out.println("Digite um número inteiro de 1 a 10: ");
        int number = sc.nextInt();
        for (int tabuada = 1; tabuada <=10; tabuada++){
            int resultado = number * tabuada;
            System.out.println(tabuada + " x " +number+ " = " + resultado);




            sc.close();
        }
    }
}
