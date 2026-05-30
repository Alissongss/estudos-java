package primeiro;


public class funcoes_matematicas {
	
	public static void main(String[] args) {
		
		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		double A, B, C;
		
		A = Math.sqrt(x);
		B = Math.sqrt(y);
		C = Math.sqrt(25);
		System.out.println("A raiz quadrade de " + x + " = " + A);
		
		A = Math.pow(x,  y);
		System.out.println(x + " elevado a " + y + " = " + A);
		
		A = Math.abs(z);
		System.out.println("O valor absoluto de " + z + " = " + A);
		
		
	}

}
