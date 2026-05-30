package entidade;

import java.sql.SQLOutput;

public class Carro {

    //atributos da classe Carros
    public String cor; //coloquei o public para que os atributos da classe sejam acessados de qualquer lugar do programa que instanciar a classe Carro.
    public int tamanhoDeRoda;
    public int numeroDePortas;

    //Criando/iniciando/inicializando métodos (verbos, ações). Lêmbre-se que void significa que o método não retorna nada (null, vazio)

    void ligarMotor(){
        System.out.println("MOTOR FOI LIGADO");
    }

    void ligarFarol(){
        System.out.println("FAROL FOI LIGADO");
    }

    void iniciarDeslocamento(){
        System.out.println("DESLOCAMENTO INICIADO");
    }




}
