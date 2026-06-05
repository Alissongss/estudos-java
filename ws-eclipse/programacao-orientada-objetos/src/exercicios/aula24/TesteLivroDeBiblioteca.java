package exercicios.aula24;
import java.time.LocalDate;


public class TesteLivroDeBiblioteca {
	
	public static void main(String[] args) {
	
	LivroDeBiblioteca livroBib = new LivroDeBiblioteca();
	
	livroBib.anoPublicacao = 2023;
	livroBib.autor = "Aline Soares";
	livroBib.titulo = "Eu venci na vida";
	livroBib.emprestado = true;
	livroBib.usuarioEmprestimo = "Alisson Soares";
	livroBib.dataEmprestimo = LocalDate.of(2026, 3, 18);
	livroBib.dataDevolucao = LocalDate.of(2026, 4, 18);
	
	System.out.println(livroBib.anoPublicacao);
	System.out.println(livroBib.autor);
	System.out.println(livroBib.titulo);
	System.out.println(livroBib.emprestado);
	System.out.println(livroBib.usuarioEmprestimo);
	System.out.println(livroBib.dataEmprestimo);
	System.out.println(livroBib.dataDevolucao);
	
	
	
	
	
	
	
	
	}
	

}
