package exercicios.aula25a27.classesemetodos;

public class TesteContaCorrenteLoiane {
    public static void main(String[] args) {

        ContaCorrenteLoiane conta = new ContaCorrenteLoiane();
        conta.numero = "123456";
        conta.agencia = "1234";
        conta.especial = true;
        conta.limiteEspecial = 500;
        conta.saldo = -10;

        conta.entrarNoSistema();
    }
}
