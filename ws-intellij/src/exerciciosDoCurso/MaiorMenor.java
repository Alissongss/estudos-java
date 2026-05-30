package exerciciosDoCurso;
import java.util.Scanner;
import java.util.Locale;

public class MaiorMenor {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Digite o primeiro número: ");
        double number1 = sc.nextDouble();

        System.out.println("Digite o segunto número: ");
        double number2 = sc.nextDouble();

        if (number1 > number2){
            System.out.println("O maior número é: " + number1);
        }else if (number1 < number2){
            System.out.println("O maior número é: "+ number2);
        }else{
            System.out.println("Os números são iguais.");
        }



    }
}
