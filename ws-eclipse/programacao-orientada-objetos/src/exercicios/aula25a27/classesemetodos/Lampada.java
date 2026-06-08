package exercicios.aula25a27.classesemetodos;

//1.	Escreva uma classe para representar uma lâmpada. Desenvolva métodos para ligar, desligar a lampada. 

public class Lampada {

    String marca;
    String modelo;
    String tecnologia; //Incandescente, fluotescente , LED
    int potencia;
    String tensao;
    boolean ligada;


    void LigarLampada() {
        System.out.println("A lâmpada foi ligada.");
    }

    void DesligarLampada() {
        System.out.println("A lâmpada foi desligada.");
    }

    void ligar() {
        ligada = true;
    }

    void desligar() {
        ligada = false;
    }
}


