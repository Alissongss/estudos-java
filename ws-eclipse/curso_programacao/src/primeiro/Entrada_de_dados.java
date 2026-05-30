package primeiro;
import java.util.Locale;
import java.util.Scanner;

public class Entrada_de_dados {
	
	public static void main(String[] args) {
		
		// Exemplo 1 - escaneando uma string (palavra) que é digitada no teclado
		
		/*System.out.print("Digite alguma coisa: ");
		
		Scanner sc = new Scanner(System.in); //Declaramos uma variável sc do tipo String. Depois associamos o objeto Scanner sc ao teclado no moddo console (System.in)
											 
		
		String x;
		x = sc.nextLine();
		
		
		System.out.println("Você digitou: " + x);
		
		sc.close(); //encerra o objeto sc
*/		
		/*
		 * Em resumo: Classe: É o conceito (Scanner).
		 * 
		 * Objeto: É a instância viva desse conceito (o seu sc).
		 * 
		 * Método: É o que o objeto faz (close, next, nextLine).
		 */
		
		
			
		
		
		// EXAMPLE 2: escaneando um número inteiro que é digitado no teclado e armazenando em uma variável
		
		
		  /*System.out.print("Digite um número inteiro: ");
		  Scanner sc = new Scanner(System.in); 
		  int x; 
		  x = sc.nextInt();
		  System.out.println("O número digitado foi: " + x); 
		  sc.close();
		  */
		//-------------------------------------------------------------------------------------------------------------------------------------------------
		
		//EXAPLE 3: escaneando um double e armazenando na variável x
		
		/*Locale.setDefault(Locale.US);
		System.out.println("Digite um número com ponto flutuante: ");
		Scanner sc = new Scanner(System.in);
		double x;
		x = sc.nextDouble();
		System.out.println("O número digitado foi: " + x);
		sc.close();
		*/
		//--------------------------------------------------------------------------------------------------------------------------------------------------
		
		//EXAMPLE 4: Ler apenas um caractere de uma determinada posição numa string. Usaremos o método charAt(). Entre parêntese colocamos a posição do char.
		
		/*System.out.print("Digite uma palavra ou um caractere: ");
		Scanner sc = new Scanner(System.in);
		char x;
		x = sc.next().charAt(0); // irá escanear o primeiro caractere da palavra.
		System.out.println("O primeiro caractere é: " + x);
		sc.close();
		*/ 
	    //---------------------------------------------------------------------------------------------------------------------------------------------------
	    
		//EXAMPLE 5: Ler vários dados na mesma linha. Digita um dado e dá espasso...
		
		/*System.out.println("Digite dos dados em uma linha:");
		Scanner sc = new Scanner(System.in);
		
		String x;
		int y;
		double z;
		
		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();
		
		System.out.println("Os dados digitados foram: ");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		sc.close();*/
		
		//-----------------------------------------------------------------------------------------------------------------------------------------------
		
	    // QUEBRA DE LINHA PENDENTE
		
		Scanner sc = new Scanner(System.in);
		int x;
		String s1, s2, s3;
		System.out.println("Digite na sequência um número inteiro e três saudações. Aperte ENTER após cada digitação.");
		x = sc.nextInt(); // exemplo: 25\n. Você digitou 25 e deu enter. No buffer fica o número e a quebra de linha \n. Ocorre que nextInt só lê o número.
						  // A quebra de linha \n fica pendente no buffer. nextLine ao ler o \n pendente, entende que a entrada acabou e retorna uma saída vazio, e já pula para a próxima leitura.
		sc.nextLine();    // Esta linha de comando irá consumir a quebra de linha \n que ficou pendente.
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("DADOS DIGITADOS:");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		sc.close();
	    
	    
	}

}
