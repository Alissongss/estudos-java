package exercicios.aula24;

public class TesteLivro{
	
	public static void main(String[] args) {
		
		Livro livro1 = new Livro();
		
		livro1.anoPublicacao = 2024;
		livro1.autor = "Jorge Amado";
		livro1.editora = "Século";
		livro1.genero = "Ficção";
		livro1.titulo = "Não importa o que aconteça";
		livro1.numeroPaginas = 256;
		
		
		System.out.println("O título do livro é: " + livro1.titulo);
		
		
		
	}
	
	
}