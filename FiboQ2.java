import java.util.ArrayList;
import java.util.List;

public class Fibo {

    private static List<Integer> fiboSerie = new ArrayList<>();
    public static void calcularFibonacciRecursivo(int n) {
    
        int penultimo = fiboSerie.get(n - 2);
        int ultimo = fiboSerie.get(n - 1);
        int proximoNumero = penultimo + ultimo;
        
        fiboSerie.add(proximoNumero);
        if (proximoNumero > 100) {
            return; 
        }
        calcularFibonacciRecursivo(n + 1);
    }
    public static void main(String[] args) {
        fiboSerie.add(0);
        fiboSerie.add(1);
        calcularFibonacciRecursivo(2);

        System.out.println("Série de Fibonacci até passar de 100:");
        for (int numero : fiboSerie) {
            System.out.print(numero + " ");
        }
    }
}
