package programasEstudos;

import java.util.Locale;
import java.util.Scanner;


public class Estruturas_de_repeticao01_FOR {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        // ESTRUTURA FOR
        //inicialização; condição; incremento

        /*for (int numero = 1; numero <= 5; numero++) {
            System.out.println(numero);*/

        // Incrementando de 1 a 5 e escrevendo o número na tela.
       /* for (INICIALIZAÇÃO; CONDIÇÃO; INCREMENTO) {
        bloco que será executado dentro deste for}*/

       //for (INICIALIZAÇÃO;  CONDIÇÃO; INCREMENTO
        for (int number = 1; number <= 5; number++) {
        System.out.println(number);


            sc.close();

        }
    }
}
