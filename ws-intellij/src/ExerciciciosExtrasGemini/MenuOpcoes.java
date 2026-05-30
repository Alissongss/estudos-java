package ExerciciciosExtrasGemini;

import java.util.Scanner;
import java.time.LocalDateTime;// representa data e hora
import java.time.format.DateTimeFormatter; // Para formatar a exibição

public class MenuOpcoes {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Digite uma das opções do MENU a seguir: ");
            System.out.println("------MENU------");
            System.out.println("1. Olá!");
            System.out.println("2. Hora atual. ");
            System.out.println("0. Sair");
            opcao = leitor.nextInt();

            if (opcao == 1) {
                System.out.println("Olá!");
            } else if (opcao == 2) {
                // 1. Pega a data e hora atual do sistema
                LocalDateTime agora = LocalDateTime.now();

                // 2. Define um formato amigável (Dia/Mês/Ano Hora:Minuto:Segundo)
                DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

                // 3. Aplica a formatação e imprime
                System.out.println("Data e Hora atual: " + agora.format(formatador));

            }


        } while (opcao != 0);

        leitor.close();


    }
}
