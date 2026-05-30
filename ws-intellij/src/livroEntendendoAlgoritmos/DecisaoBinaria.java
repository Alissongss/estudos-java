package livroEntendendoAlgoritmos;

import java.util.Scanner;
import java.lang.System;
import java.util.Arrays;

public class DecisaoBinaria {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int[] lista = {12, 15, 25, 69, 70, 100, 125, 369, 832, 1587, 2689, 9875};
        int quant = lista.length;
        System.out.println(Arrays.toString(lista));


        // Agora vamos montar nosso algoritmo de decisão binária para encontrar um elemento dentro da lista criada.
        // Elemento a ser encontrado (advinhado)
        System.out.println("Digite o elemento da lista que será encontrado.");
        int elemento = leitor.nextInt();

        // Criamos uma variável booleana de controle (nossa bandeira)
        boolean elementoValido = false;

        // Enquanto o elemento NÃO for válido, o programa fica preso aqui
        while (elementoValido == false) {
            // O laço 'for' varre toda a lista procurando o número digitado
            for (int i = 0; i <= quant - 1; i++) {
                if (elemento == lista[i]) {
                    elementoValido = true; // Se achou na lista, levanta a bandeira!
                }
            }
            if (elementoValido == false) {
                System.out.println("Digite um número que pertença à lista.");
                elemento = leitor.nextInt();

            }
        }

        int baixo = 0;
        int alto = quant - 1;

        int chute = (baixo + alto) / 2;

        while (lista[chute] != elemento) {
            if (lista[chute] < elemento) {
                baixo = chute + 1;
            } else {
                alto = chute - 1;

            }
            chute = (baixo + alto) / 2;

        }


        System.out.println("O elemento procurado é: " + lista[chute]);

        leitor.close();

    }
}