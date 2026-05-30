package ExerciciciosExtrasGemini;

import java.util.Scanner;

public class cálculoFatorial {
    public static void main(String[]args){
        System.out.print("Digite um número inteiro positivo:\n");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int fatorial = 1;



        for (int i = number; i >= 1; i--){
            fatorial = fatorial * i;
            System.out.println(i);
        }

        System.out.println("O resultado de "+number+"! é: "+fatorial+".");






    }
}
