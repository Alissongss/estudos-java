package vetoresMatrizes;

public class Aula20MatrizesMultidimensionais {
    public static void main(String[] args) {
        //  {{{1,2,3},{1,2,3},{1,2,3}}}

        int[][][] matriz = new int[3][3][3];
        int soma = 0;
        int somaPar = 0;
        int somaImpar = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                for (int k = 0; k < matriz[i][j].length; k++) {
                    matriz[i][j][k] = i + j + k;
                    System.out.print(matriz[i][j][k] + "  ");
                    soma += i + j + k;
                    if (matriz[i][j][k] % 2 == 0){
                        somaPar += matriz[i][j][k];
                    } else {
                        somaImpar += matriz[i][j][k];
                    }
                }
            }
        }
        System.out.println();
        System.out.println("A soma de todos os elementos da matriz é: " + soma);
        System.out.println("A soma de todos os elementos pares é: " + somaPar);
        System.out.println("A soma de todos os elementos ímpares é: " + somaImpar);

    }


}
