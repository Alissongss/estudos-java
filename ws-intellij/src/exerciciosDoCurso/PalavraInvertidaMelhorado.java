package exerciciosDoCurso;
import java.util.Scanner;

public class PalavraInvertidaMelhorado {
    public static void main(String[]args){
        System.out.print("Digite a palavra que será invertida: ");
        Scanner leitor = new Scanner(System.in);
        String palavra = leitor.nextLine();
        String palavraInvertida = "";


        for (int i = palavra.length() - 1; i >= 0; i--){
            palavraInvertida += palavra.charAt(i);

        }
        System.out.println("Palavra invertida: "+ palavraInvertida);
        leitor.close();

    }

}
