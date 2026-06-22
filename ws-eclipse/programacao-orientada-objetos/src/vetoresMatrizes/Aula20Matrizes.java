package vetoresMatrizes;

public class Aula20Matrizes {
    public static void main(String[] args) {

        /*String[] alunos = new String[3];
        alunos[0] = "Aluno1";
        alunos[1] = "Aluno2";
        alunos[2] = "Aluno3";

        double[][] notasAlunos = new double[3][4];

        notasAlunos[0][0] = 10;
        notasAlunos[0][1] = 7;
        notasAlunos[0][2] = 9;
        notasAlunos[0][3] = 9.5;

        notasAlunos[1][0] = 9;
        notasAlunos[1][1] = 8;
        notasAlunos[1][2] = 7;
        notasAlunos[1][3] = 9;

        notasAlunos[2][0] = 8;
        notasAlunos[2][1] = 9;
        notasAlunos[2][2] = 10;
        notasAlunos[2][3] = 7;

        for (int i = 0; i < alunos.length; i++){
            System.out.printf("%n As notas bimestrais do aluno %s são: ", alunos[i]);
            for (int j=0; j < notasAlunos[i].length; j++){
                System.out.printf("%.2f ", notasAlunos[i][j]);

            }
        }*/

        double[][] notasAlunos2 = {{10, 8, 9.5, 7}, {5, 8, 9.5, 6}, {5, 8, 7.2, 6}};

        for (int i = 0; i < notasAlunos2.length; i++) {
            for (int j = 0; j < notasAlunos2[i].length; j++) {
                System.out.print(notasAlunos2[i][j] + "  ");
            }
            System.out.println();


        }
        System.out.println();
        double soma;
        for (int i = 0; i < notasAlunos2.length; i++) {
            soma = 0;

            for (int j = 0; j < notasAlunos2[i].length; j++) {
                soma += notasAlunos2[i][j];

            }

            System.out.println("A média do aluno " + i + " é: " + (soma/4));


        }


    }

}
