package exercicios.aula24;

public class TesteLampada {

	public static void main(String[] args) {
		
		Lampada lampada = new Lampada();
		lampada.formato = "tubo";
		lampada.marca = "ge";
		lampada.modelo = "A60";
		lampada.potencia = 40;
		lampada.tensao = "bivolt";
		lampada.tecnologia = "LED";
		
		
		System.out.println(lampada.marca);
		System.out.println(lampada.formato);
		System.out.println(lampada.modelo);
		System.out.println(lampada.tensao);
		System.out.println(lampada.potencia);
		
		
		
		
		
		

	}

}
