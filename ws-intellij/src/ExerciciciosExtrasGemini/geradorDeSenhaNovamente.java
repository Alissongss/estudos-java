package ExerciciciosExtrasGemini;

import java.util.Scanner;
import java.security.SecureRandom;


public class geradorDeSenhaNovamente {
    public static void main(String[] args) {
        System.out.print("Digite o comprimento da senha a ser gerada: ");
        Scanner leitor = new Scanner(System.in);
        int comprimento = leitor.nextInt();


        //Construir a lista de caracteres de onde a senha será formada com os caracteres ASCII de 33 a 126
        StringBuilder ListaBase = new StringBuilder();

        for (int i = 33; i <= 126; i++) {
            ListaBase.append((char) i);

        }
        StringBuilder senha = new StringBuilder();
        String caracteres = ListaBase.toString();
        SecureRandom random = new SecureRandom();


        for (int j = 1; j <= comprimento; j++) {
            int index = random.nextInt(caracteres.length());
            senha.append(caracteres.charAt(index));

        }


        System.out.println("Senha " + senha + " gerada com sucesso.");


    }
}
