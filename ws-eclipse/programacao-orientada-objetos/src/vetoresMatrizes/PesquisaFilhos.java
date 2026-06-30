package vetoresMatrizes;

import java.util.Scanner;

public class PesquisaFilhos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Definimos a quantidade de pessoas na amostra da pesquisa
        System.out.print("Quantas pessoas serão entrevistadas na avenida? ");
        int qtdPessoas = sc.nextInt();
        sc.nextLine(); // Limpa o buffer do teclado pós-nextInt

        // 2. Criamos a matriz irregular (sabemos as linhas/pessoas, mas não as colunas/filhos)
        String[][] nomesFilhos = new String[qtdPessoas][];

        // 3. Laço para coletar os dados de cada entrevistado
        for (int i = 0; i < nomesFilhos.length; i++) {
            System.out.printf("%n--- Entrevistado #%d ---%n", i + 1);
            System.out.print("Quantidade de filhos: ");
            int qtdFilhos = sc.nextInt();
            sc.nextLine(); // Limpa o buffer

            // Aqui acontece a mágica do array irregular: alocamos a memória exata para esta linha
            nomesFilhos[i] = new String[qtdFilhos];

            // Coletamos os nomes apenas se a pessoa tiver filhos
            for (int j = 0; j < nomesFilhos[i].length; j++) {
                System.out.printf("Digite o nome do %dº filho: ", j + 1);
                nomesFilhos[i][j] = sc.nextLine();
            }
        }

        // 4. Exibição dos resultados da pesquisa conforme pedido no enunciado
        System.out.println("\n=================================");
        System.out.println("      RESULTADO DA PESQUISA      ");
        System.out.println("=================================");
        System.out.println("Total de pessoas entrevistadas: " + nomesFilhos.length);

        for (int i = 0; i < nomesFilhos.length; i++) {
            System.out.printf("%nEntrevistado #%d possui %d filho(s)", i + 1, nomesFilhos[i].length);

            if (nomesFilhos[i].length > 0) {
                System.out.print(" -> Nome(s): ");
                for (int j = 0; j < nomesFilhos[i].length; j++) {
                    System.out.print(nomesFilhos[i][j]);
                    // Formatação para colocar vírgula entre os nomes, exceto no último
                    if (j < nomesFilhos[i].length - 1) {
                        System.out.print(", ");
                    }
                }
            }
            System.out.println(); // Quebra de linha para o próximo entrevistado
        }

        sc.close();
    }
}