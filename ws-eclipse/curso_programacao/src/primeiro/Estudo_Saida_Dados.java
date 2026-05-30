package primeiro;
import java.util.Locale;

public class Estudo_Saida_Dados {
	
	public static void main(String[] args) {
		
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;	
		int y = 32;
		double z = 10.35784;
		System.out.println(y);
		System.out.println(z);
		System.out.printf("%.2f%n", z); // %n no final significa uma quebra de linha. (formato, argumento)
		System.out.printf("%.4f\n", z); // \n no final também significa uma quebra de linha. 
		Locale.setDefault(Locale.US);
		System.out.printf("%.2f%n", z); // %n no final significa uma quebra de linha. (formato, argumento)
		System.out.printf("%.4f\n", z); // \n no final também significa uma quebra de linha. 
		
		//O separador de decimais que o printf utiliza é o que o computador está utilizando. No meu caso, meu computador está com sistema operacional emm português, 
		//portanto, usa vírgula como separador. Para mudar para ponto, vou usar o camando Locale.setDefault(Locale.US)
		
		//Para concatenar vários elementos usamos o operador +
		
		System.out.println("Resultado = " + z + " metros");
		
		//Agora, usando o printf para colocar marcadores onde as minhas variáveis devem aparecer. Primeiro colocamos os marcadores, ao final 
		//colocamos a sequência de variáveis
		
		System.out.printf("Resultado = %.2f metros.%n", z);
		
		//Another example concatenating multiple elements:
		
		
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais.%n", nome, idade, renda);
		
				
		
		
		
	}

}
