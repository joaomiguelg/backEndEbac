import java.util.Scanner;

public class CastingExemplo {
    public static void main(String[] args) {
        int numeroInteiro = lerNumeroInteiro();
        
        Integer numeroWrapper = transformarEmWrapper(numeroInteiro);
        
        System.out.println("Número em formato Integer: " + numeroWrapper);
    }
    
    public static int lerNumeroInteiro() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();
        scanner.close();
        return numero;
    }
    
    public static Integer transformarEmWrapper(int numero) {
        Integer wrapper = Integer.valueOf(numero);
        return wrapper;
    }
}
