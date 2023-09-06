import java.util.Scanner;

import javax.swing.JOptionPane;

public class ManipulacaoDeFrase {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String frase = JOptionPane.showInputDialog("Digite a frase");

        while (true) {
            System.out.println("MENU");
            System.out.println("1 - Imprime o comprimento da frase");
            System.out.println("2 - Imprime os dois primeiros e os dois últimos caracteres da frase");
            System.out.println("3 - Imprime a frase espelhada");
            System.out.println("4 - Termina o algoritmo");
            System.out.print("OPÇÃO: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer do scanner

            switch (opcao) {

                case 1:
                    System.out.println("Comprimento da frase: " + frase.length());
                    break;
                case 2:
                    if (frase.length() >= 4) {
                        System.out.println("Dois primeiros caracteres: " + frase.substring(0, 2));
                        System.out.println("Dois últimos caracteres: " + frase.substring(frase.length() - 2));
                    } else {
                        System.out.println("A frase deve conter pelo menos 4 caracteres.");
                    }
                    break;
                case 3:
                    String fraseEspelhada = new StringBuilder(frase).reverse().toString();
                    System.out.println("Frase espelhada: " + fraseEspelhada);
                    break;
                case 4:
                    System.out.println("Algoritmo encerrado.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Escolha uma opção válida.");
            }
        }
    }
}
