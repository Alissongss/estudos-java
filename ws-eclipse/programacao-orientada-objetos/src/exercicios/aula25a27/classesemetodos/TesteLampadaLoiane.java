package exercicios.aula25a27.classesemetodos;

public class TesteLampadaLoiane {
    public static void main(String[] args) {

        LampadaLoiane lampada = new LampadaLoiane();

        lampada.ligar();
        lampada.mostrarEstado();

        lampada.desligar();
        lampada.mostrarEstado();

        lampada.mudarEstado();
        lampada.mostrarEstado();



    }
}
