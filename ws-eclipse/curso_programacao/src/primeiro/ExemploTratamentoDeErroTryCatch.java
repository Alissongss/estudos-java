package primeiro;
import java.io.FileReader;
import java.io.IOException;

public class ExemploTratamentoDeErroTryCatch {
    public static void main(String[] args) {
        try {
            // Tenta executar este bloco
            FileReader fr = new FileReader("arquivo_que_nao_existe.txt");
            
        } catch (IOException e) {
            // Se der o erro (IOException), ele cai aqui em vez de travar o programa
            System.out.println("Erro: Não consegui encontrar o arquivo de dados.");
            System.out.println("Detalhe técnico: " + e.getMessage());
        }
        
        System.out.println("O programa continua rodando normalmente...");
    }
}