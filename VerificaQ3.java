import java.util.Scanner;

public class VerificaQ3 {

   
    public static boolean verificar(String texto) {
        String textoLimpo = texto.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        PilhaListaQ3 pilha = new PilhaListaQ3();
        for (char c : textoLimpo.toCharArray()) {
            pilha.adicionarNoFim(c); 
        }
        int tamanho = pilha.getTamanho(); 
        for (int i = 0; i < tamanho / 2; i++) { 
            char charOriginal = pilha.get(i); 
            char charInverso = pilha.desempilha();
            if (charOriginal != charInverso) {
                return false; 
            }
        }
        return true; 
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- Verificador de Palíndromo Q3 ---");
        System.out.println("Digite a palavra ou frase para verificar:");
        String entrada = scanner.nextLine();
        scanner.close();

        if (verificar(entrada)) {
            System.out.println(">>> A string '" + entrada + "' é um PALÍNDROMO!");
        } else {
            System.out.println(">>> A string '" + entrada + "' NÃO é um palíndromo.");
        }
    }
}
