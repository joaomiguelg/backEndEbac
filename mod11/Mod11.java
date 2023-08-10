import java.util.ArrayList;
import java.util.Scanner;


public class Mod11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> masculino = new ArrayList<>();
        ArrayList<String> feminino = new ArrayList<>();

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

