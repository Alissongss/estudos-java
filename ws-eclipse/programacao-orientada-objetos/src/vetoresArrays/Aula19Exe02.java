package vetoresArrays;
//2. Criar um vetor A com 8 elementos inteiros. Construir um vetor B de
//mesmo tipo e tamanho e com os elementos do vetor A multiplicados
//por 2, ou seja: B[i] = A[i] * 2

public class Aula19Exe02 {
    public static void main(String[] args) {

        /*int[] A = new int[8];
        int[] B = new int[8];

        A[0] = 10;
        A[1] = 20;
        A[2] = 30;
        A[3] = 40;
        A[4] = 50;
        A[5] = 60;
        A[6] = 70;
        A[7] = 80;

        for (int i=0; i<A.length; i++){
            B[i] = A[i] * 2;
            System.out.println(B[i]);
        }*/

        /*11.Criar um vetor A com 10 elementos inteiros. Implementar um programa
        que defina e escreva a quantidade de elementos armazenados neste
        vetor que são pares.
        */

       /* int[] A = new int[10];

        A[0] = 1;
        A[1] = 2;
        A[2] = 3;
        A[3] = 4;
        A[4] = 5;
        A[5] = 6;
        A[6] = 7;
        A[7] = 8;
        A[8] = 9;
        A[9] = 10;

        for (int i = 0; i < A.length; i++) {
            if ((A[i] % 2) == 0) {
                System.out.println(A[i]);
            }
        }*/
       /* 12.Criar um vetor A com 10 elementos inteiros. Implementar um programa
        que defina e escreva a soma de todos os elementos armazenados
        neste vetor.*/

       /* int[] A = new int[10];

        A[0] = 1;
        A[1] = 2;
        A[2] = 3;
        A[3] = 4;
        A[4] = 5;
        A[5] = 6;
        A[6] = 7;
        A[7] = 8;
        A[8] = 9;
        A[9] = 10;
        int soma = 0;
        for (int i = 0; i < A.length; i++) {
            soma += A[i];
        }
        System.out.println(soma);*/

       /* 13.Criar um vetor A com 10 elementos inteiros. Implementar um programa
        que determine a soma dos elementos armazenados neste vetor que
        são múltiplos de 5.  */

       /* int[] A = new int[10];

        A[0] = 1;
        A[1] = 2;
        A[2] = 3;
        A[3] = 4;
        A[4] = 5;
        A[5] = 6;
        A[6] = 7;
        A[7] = 8;
        A[8] = 9;
        A[9] = 10;

        for (int i = 0; i < A.length; i++) {
            if ((A[i] % 5) == 0) {
                System.out.println(A[i]);
            }
        }*/
        /*15.Criar um vetor A com 10 elementos inteiros. Desenvolver um programa
        que defina o percentual de elementos pares e ímpares,
                respectivamente, armazenados neste vetor.*/

        int[] A = new int[10];

        A[0] = 1;
        A[1] = 2;
        A[2] = 3;
        A[3] = 7;
        A[4] = 5;
        A[5] = 6;
        A[6] = 7;
        A[7] = 8;
        A[8] = 9;
        A[9] = 10;

        int quantPar = 0;
        int quantImpar = 0;
        int comprimento = A.length;
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                quantPar += 1;
            } else {
                quantImpar += 1;
            }
        }
        System.out.println("A porcentagem de números pares é: " + (quantPar * 100/ comprimento) + "%");
        System.out.println("A porcentagem de números ímpares é: " + (quantImpar * 100 / comprimento) + "%");
    }
}
