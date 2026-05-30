package entidade;

import java.sql.SQLOutput;

public class FuncionarioEmpresa {

    public double salario = 1000.89;

    public void calcularSalarioFinal(){

        /*Digamos que dentro desse método eu implemente os descontos ou acrécimos necessários
        * FGTS
        * HORAS EXTRAS
        * GRATIFICAÇÕES        *
        */

        double salarioFinal = salario - 20;
        System.out.println("Salário com ajustes = R$ " + salarioFinal);




    }


}
