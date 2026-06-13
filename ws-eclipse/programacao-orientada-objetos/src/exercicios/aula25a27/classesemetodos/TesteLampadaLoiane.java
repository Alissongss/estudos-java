package exercicios.aula25a27.classesemetodos;

public class TesteLampadaLoiane {

    public static void main(String[] args) {
        LampadaLoiane lampada = new LampadaLoiane();


        lampada.ligar();
        lampada.mostrarStatus();
        lampada.mudarStatus();
        lampada.mostrarStatus();

        lampada.desligar();
        lampada.mostrarStatus();
        lampada.mudarStatus();
        lampada.mostrarStatus();


    }

}
