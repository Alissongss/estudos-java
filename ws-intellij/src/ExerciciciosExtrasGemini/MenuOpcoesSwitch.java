package ExerciciciosExtrasGemini;

import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MenuOpcoesSwitch {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n--- MENU INTERATIVO ---");
            System.out.println("1. Enviar um 'Olá'");
            System.out.println("2. Ver Data e Hora atual");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = leitor.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Olá! Tudo bem com você?");
                    break;
                case 2:
                    LocalDateTime agora = LocalDateTime.now();
                    DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
                    System.out.println("Agora são: " + agora.format(formatador));
                    break;
                case 0:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        leitor.close();
    }
}