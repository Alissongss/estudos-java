package vetoresArrays;
/*18.Ler um vetor A com 10 elementos inteiros correspondentes as idades
de um grupo de pessoas. Escreva um programa que determine e
escreva a menor e a maior idades e suas respectivas posições.*/
public class MaiorEMenorIdade {
    public static void main(String[] args) {


        int[] A = new int[10];

        A[0] = 25;
        A[1] = 28;
        A[2] = 37;
        A[3] = 75;
        A[4] = 5;
        A[5] = 63;
        A[6] = 7;
        A[7] = 48;
        A[8] = 19;
        A[9] = 24;

        int maior = A[9];
        int menor = A[0];

        for (int i = 0; i < A.length; i++){
            if (A[i] > maior){
                maior = A[i];
            } if (A[i] < menor){
                menor = A[i];
            }
        }
        System.out.println(maior);
        System.out.println(menor);;


    }
}
