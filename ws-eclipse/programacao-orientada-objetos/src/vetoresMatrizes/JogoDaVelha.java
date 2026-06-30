package vetoresMatrizes;

import java.util.Scanner;

public class JogoDaVelha {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] tabuleiro = new String[3][3];

        //Inicialização do tabuleiro
        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro[i].length; j++) {
                tabuleiro[i][j] = ".";
            }
        }

        System.out.println("--------------- Vamos iniciar a partida. ---------------");

        // Loop principal do jogo
        Boolean jogoAtivo = true;
        int rodada = 0;

        while (jogoAtivo && rodada < 9) {
            atualizar(tabuleiro);
            String jogador = (rodada % 2 == 0) ? "jogador 1 (o) " : "jogador 2 (x)";
            String peca = (rodada % 2 == 0) ? "o" : "x";
            jogar(tabuleiro, sc, peca);
            rodada++;

        }
        atualizar(tabuleiro);
        System.out.println("\n\nFim de jogo!!!");
    }

    static void atualizar(String[][] tabuleiro) {
        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro[i].length; j++) {
                System.out.print("   " + tabuleiro[i][j] + "   ");
            }
            System.out.println();
        }
    }

    static void jogar(String[][] tabuleiro, Scanner sc, String peca) {
        int y, z;
        while (true) {
            System.out.println("Digite a linha (0 a 2) e a coluna (0 a 2) da posição da sua jogada: ");
            y = sc.nextInt();
            z = sc.nextInt();

            if (y < 0 || y > 2 || z < 0 || z > 2) {
                System.out.println("Coordenada inválida. Use entre 0 e 2.");
            } else if (!tabuleiro[y][z].equals(".")) {
                System.out.println("Posição ocupada. Tente novamente");
            } else {
                tabuleiro[y][z] = peca;
                break; // jogada válida. Sai do while
            }

        }


    }
}

//
