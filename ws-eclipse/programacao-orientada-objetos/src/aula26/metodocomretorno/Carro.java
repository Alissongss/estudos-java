package aula26.metodocomretorno;

public class Carro {
	
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	// método com retorno. Nesse caso eu preciso dizer qual o tipo que o método vai retornar (int, strig, double, etc.)
	
	double obterAutonomia(){   // usar verbo pra nome de método. Método é uma ação.
		
		return capCombustivel * consumoCombustivel;
		
		
	}
	
	
	
	

}
