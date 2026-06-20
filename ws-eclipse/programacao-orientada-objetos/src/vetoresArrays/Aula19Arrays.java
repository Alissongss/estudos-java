package vetoresArrays;

public class Aula19Arrays {
    public static void main(String[] args){
        double[] temperaturas = new double[365]; // o vetor temperaturas foi criado com 365 posições
        temperaturas[0] = 31.3;
        temperaturas[1] = 32;
        temperaturas[2] = 33.7;
        temperaturas[3] = 34;
        temperaturas[4] = 33.1;

for (int i = 0; i < temperaturas.length; i++){
            System.out.printf("O valor da temperatura do dia %d é: %.2f %n", (i+1), temperaturas[i]);
        }
for (double temp : temperaturas){ // for melhorado. Tenho acesso apenas ao valor de cada posição do array, sem o índice.
    System.out.println(temp);
}

    }
}
