package exerciciosDoCurso;

import java.util.Scanner;

public class ContadorDeVogais {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        String palavra = leitor.next().toLowerCase();
        int i = 0; // contador de vogais
        int n = 0; // contador de consoantes

        //para cada letra na palavra, se a letra for uma vogal, incremente a variável i.
        // Se não for uma vogal, incremente a variável n.

        for (int j = 0; j < palavra.length(); j++) {
            char letra = palavra.charAt(j); // pega a letra ou caractere (simbolos ou números também) na posição

            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                i++;

            } else if (letra >= 'a' && letra <= 'z') {
                n++;
            }


        }
        System.out.printf("A quantidade de vogais é %d: \n", i);
        System.out.printf("A quantidade de consoantes é %d: \n", n);

        leitor.close();


    }
}
