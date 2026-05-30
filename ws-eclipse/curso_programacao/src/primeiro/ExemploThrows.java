package primeiro;

import java.io.FileReader;
import java.io.IOException; 

public class ExemploThrows {
	
    // O 'throws' avisa: "Cuidado, este método pode falhar na leitura"
	
    public static void main(String[] args) throws IOException {
        
        // Tentando abrir um arquivo que não existe no seu PC
        FileReader fr = new FileReader("C:\\meu_projeto\\dados_inexistentes.txt");
        
        System.out.println("Arquivo aberto com sucesso!");
    }
}