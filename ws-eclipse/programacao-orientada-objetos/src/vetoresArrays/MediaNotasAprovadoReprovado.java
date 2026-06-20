package vetoresArrays;
/*
19.Ler as duas notas bimestrais para um conjunto de 10 alunos.
Armazenar as notas informadas em dois vetores “Nota1” e “Nota2” do
tipo real. Escreva um programa que calcule a média aritmética simples
das notas informadas armazenando o resultado em um vetor “Result”
de mesmo tipo e tamanho. Ao mostrar os resultados exibir a situação
de cada aluno. Se a média calculada for superior ou igual a 7 o aluno
estará “aprovado”, caso contrário, a situação do aluno será
“reprovado”.
*/
public class MediaNotasAprovadoReprovado {
    public static void main(String[] args){

        double[] nota1 = new double[10];
        double[] nota2 = new double[10];
        double[] result = new double[10];
        String[] status = new String[10];

        nota1[0] = 8.5;
        nota1[1] = 2.7;
        nota1[2] = 5.9;
        nota1[3] = 5.6;
        nota1[4] = 7.8;
        nota1[5] = 9.8;
        nota1[6] = 7.6;
        nota1[7] = 3.8;
        nota1[8] = 6.5;
        nota1[9] = 7.1;

        nota2[0] = 3.6;
        nota2[1] = 4.5;
        nota2[2] = 8.9;
        nota2[3] = 7.5;
        nota2[4] = 2.9;
        nota2[5] = 4.5;
        nota2[6] = 9.5;
        nota2[7] = 5.6;
        nota2[8] = 7.2;
        nota2[9] = 6.8;

        for (int i=0; i<nota1.length; i++){
            result[i] = (nota1[i] + nota2[i])/2;
            if (result[i] >= 7){
                status[i] = "Aprovado";
            } else {
                status[i] = "Reprovado";
            }
            System.out.println("Resultado: " + result[i] + "     Status: " + status[i]);

        }


    }
}
