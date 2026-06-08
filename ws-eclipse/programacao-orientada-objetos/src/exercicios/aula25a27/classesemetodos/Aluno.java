package exercicios.aula25a27.classesemetodos;

import java.util.Scanner;

public class Aluno {

    String nome;
    String matricula;
    String curso;
    float notaMatematica;
    float notaLinguaPortuguesa;
    float notaGeografia;


    void Aprovacao() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a nota obtida em Matemática: ");
        notaMatematica = sc.nextFloat();
        if (notaMatematica >= 7) {
            System.out.println("A nota obtida em Matemática foi: " + notaMatematica + ". APROVADO!");
        } else {
            System.out.println("A nota obtida Matemática foi: " + notaMatematica + ". REPROVADO!");
        }

        System.out.print("Digite a nota obtida em Língua Portuguesa: ");
        notaLinguaPortuguesa = sc.nextFloat();
        if (notaLinguaPortuguesa >= 7) {
            System.out.println("A nota obtida em Lingua Portuguesa foi: " + notaLinguaPortuguesa + ". APROVADO!");
        } else {
            System.out.println("A nota obtida em Língua Portuguesa foi: " + notaLinguaPortuguesa + ". REPROVADO!");
        }

        System.out.print("Digite a nota obtida em Geografia: ");
        notaGeografia = sc.nextFloat();
        if (notaGeografia >= 7) {
            System.out.println("A nota obtida em Geografia foi: " + notaGeografia + ". APROVADO!");
        } else {
            System.out.println("A nota obtida em Geografia foi: " + notaGeografia + ". REPROVADO!");
        }
    }
}
