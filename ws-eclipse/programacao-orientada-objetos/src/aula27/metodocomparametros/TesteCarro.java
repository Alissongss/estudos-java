package aula27.metodocomparametros;
import java.util.Scanner;


public class TesteCarro {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Carro van = new Carro();
		van.marca = "Fiat";
		van.modelo = "Ducato";
		van.capCombustivel = 60;
		van.consumoCombustivel = 8;
		
		System.out.println("Digite a distância a ser percorrida na viagem: ");
		double distancia = sc.nextDouble();
		
		double totalCombustivel = van.calcularCombustivel(distancia);
		
		
		
				
		System.out.printf("1-A quantidade de combustível será: %.2f litros%n", van.calcularCombustivel(distancia));
		System.out.printf("2-A quantidade de combustível será: %.2f litros%n", totalCombustivel);
		
		sc.close();
		
	}
	
	

}
