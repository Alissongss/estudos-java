package programasEstudos;// Caso a opção digitada seja tal, o programa executa uma determinada parte do código de acordo com o case

public class ComandoSwitch {

    public static void main(String[] args) {

        int opcao = 3;

        switch (opcao) {

            case 1:
                System.out.println("Ver extrato.");
                break;

            case 2:
                System.out.println("Fazer depósito.");
                break;

            case 3:
                System.out.println("Fazer um PIX.");
                break;

            default:
                System.out.println("Selecione um número");
                break;


        }

    }
}
