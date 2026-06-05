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
		
		lampada.tipos = new String[5];// preciso iniciar o array de String antes.
		lampada.tipos[0] = "Abajour";
		lampada.tipos[1] = "Lampeões";
		
		
		
		System.out.println(lampada.marca);
		System.out.println(lampada.formato);
		System.out.println(lampada.modelo);
		System.out.println(lampada.tensao);
		System.out.println(lampada.potencia);
		System.out.println(lampada.tipos[0]);
		System.out.println(lampada.tipos[1]);
		
		
		
		
		
		

	}

}
