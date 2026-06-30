package vetoresMatrizes;

import java.sql.SQLOutput;
import java.util.Scanner;

/* Write a program to store data from a survey conducted with a sample of people on the
busiest avenue in the city where you live.
   The survey consists of asking the citizen the number of children and the name of each child.
   Store this information in a matrix in such a way that each interviewed person occupies
   only the necessary space in memory to store the name of the children,
   Print the number of people interviewed, the number of children of each interviewed,
   and the respective names of the children.

*/
public class Aula20MatrizesIrregulares {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Quantas pessoas foram entrevistadas na avenida? ");
        int quantPessoas = scan.nextInt();
        scan.nextLine(); //limpa o buffer do teclado após nextInt. Consome a quebra de linha fantasma.
        String[][] nomesFilhos = new String[quantPessoas][];

        System.out.println(" PRIMEIRA PARTE: REALIZAÇÃO DA ENTREVISTA");

        for (int i = 0; i < nomesFilhos.length; i++) {
            System.out.print("Quantos filhos o entrevistado " + (i + 1) + " tem?  ");
            int quantFilhos = scan.nextInt();
            scan.nextLine(); //limpa o buffer do teclado após nextInt, pois ficou uma quebra de linha fantasma.
            nomesFilhos[i] = new String[quantFilhos]; //O vetor da linha i agora possui uma quantidade de colinas equivalente à quantidade de filhos

            for (int j = 0; j < nomesFilhos[i].length; j++) {
                System.out.print("Digite o nome do filho " + (j + 1) + ": ");
                nomesFilhos[i][j] = scan.nextLine();
            }
        }

        System.out.println(" SEGUNDA PARTE: EXIBIÇÃO DO RESULTADO");
        System.out.println("          RESULTADO DA PESQUISA     ");
        System.out.println("Total de pessoas entrevistadas: " + nomesFilhos.length);

        for (int i = 0; i < nomesFilhos.length; i++) {
            System.out.printf("%n Entrevistado %d possui %d filho(s).", i + 1, nomesFilhos[i].length);

            if (nomesFilhos[i].length > 0) {
                for (int j = 0; j < nomesFilhos[i].length; j++) {
                    System.out.print(nomesFilhos[i][j]);

                    if (j < nomesFilhos[i].length - 1) {
                        System.out.print(", ");
                    } else {
                        System.out.print(".");
                    }
                }
            }
        }
    }
}
