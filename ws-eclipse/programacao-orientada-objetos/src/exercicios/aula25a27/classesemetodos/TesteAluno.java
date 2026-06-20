package exercicios.aula25a27.classesemetodos;
import java.util.Scanner;

public class TesteAluno {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        Aluno aluno = new Aluno();

        System.out.print("Entre com o nome do aluno: ");
        aluno.nome = scan.nextLine();

        System.out.print("Entre com o código da matrícula: ");
        aluno.matricula = scan.nextLine();

        System.out.print("Entre com o nome do curso: ");
        aluno.nomeCurso = scan.nextLine();

        aluno.nomeDisciplinas = new String[3];
        for (int i = 0; i < (aluno.nomeDisciplinas.length); i++){ // armazenamos os nomes das disciplinas
            System.out.print("Entre com o nome da disciplina " + (i+1) + ": ");
            aluno.nomeDisciplinas[i] = scan.nextLine();
        }
        // Agora vamos armazenar as notas de cada dischiplina
        aluno.notasDisciplinas = new double[3][1];
        for (int i = 0; i < aluno.nomeDisciplinas.length; i++){
            //System.out.printf("Obtendo a nota da disciplina %s: %n", aluno.nomeDisciplinas[i]);
            for (int j = 0; j < aluno.nomeDisciplinas.length; j++){
                System.out.print("Entre com a nota da disciplina " + aluno.nomeDisciplinas[j] + ": ");
                aluno.notasDisciplinas[i][j] = scan.nextDouble();
            }




        }


    }
}
