package exerciciosDoCurso;

import java.util.Scanner;

import java.security.SecureRandom;


public class GeradorDeSenha {
    public static void main(String[] args) {
        System.out.println("Digite a quantidade de caracteres que a senha gerada terá: ");
        Scanner leitor = new Scanner(System.in);
        int tamanho = leitor.nextInt();


        //1. Usamos StringBuilder para construir a lista de caracteres permitidos
        StringBuilder listaBase = new StringBuilder();

        //2. Loop que percorre o código ASCII de 33 a 126
        for (int i = 33; i <= 126; i++) {
            listaBase.append((char) i); // O (char) transforma o número i no seu símbolo.
        }
        // Agora transformamos a lista base em string para usarmos no gerador de senha
        String caracteres = listaBase.toString();

        StringBuilder senha = new StringBuilder();
        SecureRandom random = new SecureRandom();

        for (int i = 0; i <= tamanho; i++) {
            int index = random.nextInt(caracteres.length());
            senha.append(caracteres.charAt(index));
        }

        System.out.println("A senha gerada é: " + senha);
        leitor.close();



    }
}
