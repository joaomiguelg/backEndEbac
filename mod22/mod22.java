import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class mod22 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> masculino = new ArrayList<>();
        List<String> feminino = new ArrayList<>();

        while (true) {
            System.out.print("Digite o nome da pessoa (ou 'sair' para encerrar): ");
            String nome = scanner.nextLine();
            if (nome.equalsIgnoreCase("sair")) {
                break;
            }

            System.out.print("Digite o sexo da pessoa (M/F): ");
            char sexo = scanner.nextLine().toUpperCase().charAt(0);

            if (sexo == 'M') {
                masculino.add(nome);
            } else if (sexo == 'F') {
                feminino.add(nome);
            } else {
                System.out.println("Sexo inválido. Digite M para masculino ou F para feminino.");
            }
        }

        // Usando expressões lambda para criar e imprimir a lista de nomes femininos
        List<String> femininoLista = feminino;
        System.out.println("\nLista de Nomes Femininos:");
        femininoLista.forEach(nome -> System.out.println(nome));

        scanner.close();
    }
}
