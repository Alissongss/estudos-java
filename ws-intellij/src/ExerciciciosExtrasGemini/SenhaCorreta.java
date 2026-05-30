package ExerciciciosExtrasGemini;
import java.util.Scanner;


public class SenhaCorreta {
    public static void main(String[]args){

        System.out.print("Digite a senha de acesso: ");

        Scanner leitor = new Scanner(System.in);

        int senhaTentativa = leitor.nextInt();
        int senhaCorreta = 1234;

        while (senhaTentativa != senhaCorreta){
            System.out.print("Senha incorreta. Digite a senha de acesso: ");
            senhaTentativa = leitor.nextInt();


        }System.out.println("Acesso concedido.");
    }
}
