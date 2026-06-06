package aulasteoricas.metodosimples.aula25;

public class TesteCarro {
	
	public static void main(String[] args) {
		
		Carro van = new Carro();
		van.marca = "Fiat";
		van.modelo = "Ducato";
		van.numPassageiros = 12;
		van.capCombustivel = 60;
		van.consumoCombustivel = 8;
		
		van.exibirAutonomia();
		
		
		
	}

}
