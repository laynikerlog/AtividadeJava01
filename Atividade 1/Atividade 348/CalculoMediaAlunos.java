import java.util.Scanner;

public class CalculoMediaAlunos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroDeAlunos = 5;
        String[] nomes = new String[numeroDeAlunos];
        double[][] notas = new double[numeroDeAlunos][2];
        double[] medias = new double[numeroDeAlunos];

        for (int i = 0; i < numeroDeAlunos; i++) {
            System.out.println("Digite o nome do aluno " + (i + 1) + ":");
            nomes[i] = scanner.nextLine();

            System.out.println("Digite a primeira nota do aluno " + (i + 1) + ":");
            notas[i][0] = scanner.nextDouble();

            System.out.println("Digite a segunda nota do aluno " + (i + 1) + ":");
            notas[i][1] = scanner.nextDouble();

            // Limpa o buffer do scanner
            scanner.nextLine();

            // Calcula a média do aluno
            medias[i] = (notas[i][0] + notas[i][1]) / 2;
        }

        System.out.println("\nListagem de Alunos:");
        for (int i = 0; i < numeroDeAlunos; i++) {
            System.out.println("Aluno: " + nomes[i]);
            System.out.println("Nota 1: " + notas[i][0]);
            System.out.println("Nota 2: " + notas[i][1]);
            System.out.println("Média: " + medias[i]);
            System.out.println("=========================");
        }

        scanner.close();
    }
}
