package exercicios.aula25a27.classesemetodos;

public class TesteLampada {
    public static void main(String[] args){

        Lampada lampada = new Lampada();
        lampada.marca = "ge";
        lampada.modelo = "bulbo";
        lampada.potencia = 35;
        lampada.tecnologia = "LED";
        lampada.tensao = "bivolt";

        lampada.LigarLampada();

        lampada.DesligarLampada();

        lampada.ligar();
        System.out.println("Lâmpada está "+ lampada.ligada);

        lampada.desligar();
        System.out.println("Lâmpada está "+ lampada.ligada);





    }
}
