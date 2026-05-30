package exerciciosDoCurso;
import java.util.Scanner;

public class PalavraInvertida {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        System.out.println("DIGITE A PALAVRA QUE SERÁ INVERTIDA. ");
        String palavra = leitor.next();

        int comprimento = palavra.length();
        int incrementadorj = comprimento - 1;
        int j;

        for (j = incrementadorj; j >= 0; j--){
            System.out.print(palavra.charAt(j));

        }



    }
}
