package programasEstudos;

public class IF_ELSE_e_OperadoresTernarios {
    public static void main(String[] args) {

       /* double nota = 5.0;

        if (nota >= 7){

            System.out.println("APROVADO!");
        } else{
            System.out.println("REPROVADO!");
        }*/

        /*double nota = 5.0;
        if (nota >= 7.0 && nota < 8.0){
            System.out.println("APROVADO! NOTA REGULAR!");

        } else if (nota >= 8.0 && nota < 9.0){
            System.out.println("APROVADO! NOTA BOA!");

        }else if (nota >= 9.0){
            System.out.println("APROVADO! NOTA EXCELENTE!");

        }else {
            System.out.println("REPROVADO!");
        }*/

        double nota = 8.0;
        int idadePessoa = 18;

        String resultadoAluno = (nota >= 7.0) ? "APROVADO" : "REPROVADO";
        double salario =  (idadePessoa >= 18) ? 1400.00 : 0;
        System.out.println(resultadoAluno);
        System.out.printf("%.2f", salario);



    }
}