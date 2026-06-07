package aula27.metodocomparametros;

public class Carro {

	String marca;
	String modelo;
	double capCombustivel;
	double consumoCombustivel;

	double calcularCombustivel(double distancia) {
		return distancia / consumoCombustivel;
	}

}
