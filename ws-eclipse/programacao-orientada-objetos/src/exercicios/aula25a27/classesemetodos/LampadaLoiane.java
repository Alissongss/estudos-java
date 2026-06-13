package exercicios.aula25a27.classesemetodos;

public class LampadaLoiane {
    String marca;
    String modelo;
    String tensao;
    String potencia;
    String tipoLuz;
    int garantiaMeses;
    String[] tipos;
    boolean tipoAbajour;
    boolean ligada;

    void ligar() {
        ligada = true;
    }

    void desligar() {
        ligada = false;
    }

    void mostrarStatus() {
        if (ligada) {
            System.out.println("A lampada está ligada.");
        } else {
            System.out.println("A lampada está desligada.");
        }
    }

    void mudarStatus(){
        if (ligada){
            desligar();
        } else {
            ligar();
        }
    }


}
