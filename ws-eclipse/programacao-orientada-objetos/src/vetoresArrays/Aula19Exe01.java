package vetoresArrays;
//1. Criar um vetor A com 5 elementos inteiros. Construir um vetor B de
//mesmo tipo e tamanho e com os "mesmos" elementos do vetor A, ou
//seja, B[i] = A[i].

public class Aula19Exe01 {
    public static void main(String[] args){
        int[] A = new int[5];
        int[] B = new int[5];

        A[0] = 10;
        A[1] = 20;
        A[2] = 30;
        A[3] = 40;
        A[4] = 50;

        for (int i=0; i<A.length; i++){
            B[i] = A[i];
            System.out.println(B[i] + " " + A[i]);
        }
    }
}
