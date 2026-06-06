package aulasteoricas.metodocomretorno.aula26;

public class TesteCarro {
	
	public static void main(String[] args) {
		
		Carro van = new Carro();
		van.marca = "Fiat";
		van.modelo = "Ducato";
		van.numPassageiros = 12;
		van.capCombustivel = 60;
		van.consumoCombustivel = 8;
		
		double autonomia = van.obterAutonomia();
		
		System.out.printf("A autonomia do veículo é: %.2f km%n", autonomia);
		System.out.printf("A autonomia do veículo é: %.2f km%n", van.obterAutonomia());
		
		
		
		
		
	}
	

}
