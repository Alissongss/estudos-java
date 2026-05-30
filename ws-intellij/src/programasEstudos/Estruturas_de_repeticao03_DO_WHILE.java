package programasEstudos;

import java.util.Locale;
import java.util.Scanner;

public class Estruturas_de_repeticao03_DO_WHILE {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numero = 1;

        do{ // Faça enquanto a condição for verdadeira
            System.out.println(numero);
            numero++; //numero = numero + 1
        }while(numero <= 5);

        sc.close();

    }
}


