package primeiro;

public class Processamento_Casting {
	
	public static void main(String[] args) {
		
		//Example 1
		
	
		/*
		int x, y;
		x = 5;
		y = 2 * x;
		
		System.out.println(x);
		System.out.println(y);
		System.out.println();
		
		*/
		
		// Example 2 --------------------------------------------------------------------------------------------------------------------
		
		/*
		int x;
		double y; //We are declaring the variable y as a double
		
		x = 5;
		y = 2 * x;
		
		System.out.println(x);
		System.out.println(y);
		
		*/
		// --------------------------------------------------------------------------------------------------------------------------------
		// Example 3 - calculating the area of a trapezoid. Or, Calculating trapezoid area.
		
		/*
		
		double b, B, h, area;
		
		b = 6.0;  // usei o ponto zero (.0) para enfatizar que as variáveis são do tipo double, ou seja, ponto flutuante de precisão dupla.
		B = 8.0;  // Caso fosso um ponto flutuante de precisão simples, eu usaria f, exemplo 6f, 8f e 5f
		h = 5.0;
		
		area = (b + B) / 2.0 * h;
		
		System.out.println(area);
		
		*/
		//------------------------------------------------------------------------------------------------------------------------------------
		//Exemplo 4 - fazendo o casting diretamente na expressão de saída
		
		/*
		
		int a, b;
		double resultado;
		
		a = 5;
		b = 2;
		resultado = (double) a / b; //o resultado teria que ser 2.5, porém, ao dividir dois inteiros, o compilador entende que o resultado deve ser inteiro, 2.0
								    //Para resolver isso, precisamos fazer o casting (conversão explícita dos valores), colocando double na expressão do resultado	
		
		System.out.println(resultado);
		*/
		//------------------------------------------------------------------------------------------------------------------------------------
		//Exemplo 5 - 
		
		double a;
		int b;
		
		a = 5.0;
	//	b = a; // neste caso, o compilador não vai aceitar atribuir um valor double a uma variável int. Então, caso queiramos continuar, devemos fazer a conversão de a para int para atribuí-la a b
		b = (int) a; // agora o compilador vai aceitar que b, que é inteiro receba a convertido de double para inteiro.
				     // No caso, aceitamos perder as informações que estão nas casas decimais da variável a.
		System.out.println(b);
		
		
		
		
		

		
	
	}
	
	
	

}
