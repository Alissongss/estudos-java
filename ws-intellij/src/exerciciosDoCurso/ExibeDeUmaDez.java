package exerciciosDoCurso;
import java.util.Scanner;
import java.util.Locale;


public class ExibeDeUmaDez {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        for (int number = 1; number <=10; number++){
            System.out.println(number);

            sc.close();
        }




    }
}
