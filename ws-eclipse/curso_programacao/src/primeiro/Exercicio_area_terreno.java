package primeiro;
import java.util.Scanner;
import java.util.Locale;

public class Exercicio_area_terreno {
	
	public static void main(String[] args) {
		
		// ENTRADA DE DADOS: largura e comprimento do terreno com uma casa deciamal; preço do metro quadrado com duas casas decimais.
		//Locale.setDefault(new Locale("pt", "BR")); - esta forma foi depreciada a partir do java 19
		
		Locale.setDefault(Locale.forLanguageTag("pt-BR")); // coloca a saída de dados no padrão pt-BR
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Obs.: as casas decimais devem ser separadas por vírgula. Estamos usando o padrão pt-BR.\n\n");
		System.out.println("Digite a largura do terreno: ");
		double x = sc.nextDouble();
		System.out.println("Digite o comprimento do terreno: ");
		double y = sc.nextDouble();
		System.out.println("Digite o preço do metro quadrado do terreno: ");
		double p = sc.nextDouble();
		
		// Cálculo da área e do valor do terreno
		
		double AREA = x * y;
		double PRECO = AREA * p;
		
		// Saída de dados:
		
		System.out.printf("As dimensões do terreno são: Largura = %,.1f m e Comprimento = %,.1f m.\n", x, y);
		System.out.printf("Preço do metro quadrado do terreno: R$ %,.2f\n", p);
		System.out.printf("A área do terreno é A = %,.2f m\u00B2\n", AREA);
		System.out.printf("O preço do terreno é = R$ %,.2f", PRECO);
					
		sc.close();
		
		
		
	}
	

}
