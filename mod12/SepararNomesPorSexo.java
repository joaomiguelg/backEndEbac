import java.util.ArrayList;
import java.util.Scanner;

public class SepararNomesPorSexo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> masculino = new ArrayList<>();
        ArrayList<String> feminino = new ArrayList<>();

        System.out.println("Digite os nomes no formato 'nome-sexo' (digite 'fim' para encerrar):");
        while (true) {
            String entrada = scanner.nextLine();
            if (entrada.equalsIgnoreCase("fim")) {
                break;
            }

            String[] partes = entrada.split("-");
            if (partes.length != 2) {
                System.out.println("Formato inválido. Use 'nome-M' para masculino e 'nome-F' para feminino.");
                continue;
            }

            String nome = partes[0];
            String sexo = partes[1];

            if (sexo.equalsIgnoreCase("M")) {
                masculino.add(nome);
            } else if (sexo.equalsIgnoreCase("F")) {
                feminino.add(nome);
            } else {
                System.out.println("Sexo inválido. Use 'M' para masculino e 'F' para feminino.");
            }
        }

        System.out.println("\nGrupo Masculino:");
        for (String nome : masculino) {
            System.out.println(nome);
        }

        System.out.println("\nGrupo Feminino:");
        for (String nome : feminino) {
            System.out.println(nome);
        }

        scanner.close();
    }
}

