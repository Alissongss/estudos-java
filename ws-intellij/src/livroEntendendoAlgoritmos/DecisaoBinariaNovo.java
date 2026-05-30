package livroEntendendoAlgoritmos;

import java.util.Arrays;
import java.util.Scanner;


public class DecisaoBinariaNovo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);


        int[] lista = new int[]{84, 152, 293, 311, 405, 472, 519, 581, 604, 627, 690, 713, 745, 802, 833, 889, 912, 934, 955, 987};
        int quant = lista.length;

        System.out.println(Arrays.toString(lista));
        System.out.println("Digite um valor pertencente à lista apresentada acima: ");
        int numero = leitor.nextInt();

        // Testar se o numero digitado pertence à lista

        boolean pertence = false;

        while (pertence == false) {
            for (int i = 0; i < quant; i++) {
                if (numero == lista[i]) {
                    pertence = true;
                }

            }
            if (pertence == false) {
                System.out.println("Número digitado não pertence à lista apresentada.");
                System.out.println("Digite um valor pertencente à lista apresentada acima: ");
                numero = leitor.nextInt();
            }
        }

        int baixo = 0;
        int alto = quant - 1;
        int indiceChute = (baixo + alto) / 2;

        while (numero != lista[indiceChute]) {

            if (numero < lista[indiceChute]) {
                alto = indiceChute - 1;
            } else if (numero > lista[indiceChute]) {
                baixo = indiceChute + 1;
            }
            indiceChute = (baixo + alto) / 2;
        }

        System.out.printf("O número digitado foi %d", lista[indiceChute]);


    }


}
