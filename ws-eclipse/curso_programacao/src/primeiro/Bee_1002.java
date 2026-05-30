package primeiro;
import java.util.Scanner;
import java.util.Locale;

public class Bee_1002 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.forLanguageTag("US")); // coloca a saída de dados no padrão US
		
		double n = 3.14159;
		System.out.println("Cálculo da área de uma circunferência.");
		System.out.print("Digite o valor do raio: ");
		
		Scanner sc = new Scanner(System.in);
		
		double Raio = sc.nextDouble();
		double Area = n * Math.pow(Raio,  2);
		
		System.out.printf("O valor da área é: %.4f\n", Area);
		
		
		sc.close();
		
		
		
		
		
	}

}
