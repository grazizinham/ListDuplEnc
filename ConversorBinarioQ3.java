import java.util.Scanner;

public class ConversorBinarioQ3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Converta Binário para Decimal Q3 ");
        System.out.print("Digite o número binário: ");
        String binarioStr = scanner.nextLine();
        scanner.close();
        ListaBinarioQ3 lista = new ListaBinarioQ3();
        
        for (char c : binarioStr.toCharArray()) {
            int bit = Character.getNumericValue(c);
            lista.adicionarBit(bit);
        }
        long decimal = lista.converterParaDecimal();
        System.out.println("Binário: " + binarioStr);
        System.out.println("Decimal: " + decimal);
    }
}