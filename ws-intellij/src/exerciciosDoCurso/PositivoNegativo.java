package exerciciosDoCurso;
import java.util.Locale;
import java.util.Scanner;


public class PositivoNegativo {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double number = sc.nextDouble();

        if (number < 0){
            System.out.println("O número "+ number + " é negativo. ");
        }else if (number > 0){
            //System.out.println("O número "+ number + " é positivo. ");
            System.out.printf("O número %.2f é positivo. ", number);
        }else{
            System.out.println("O número é igual a zero.");
        }

        sc.close();

    }
}
