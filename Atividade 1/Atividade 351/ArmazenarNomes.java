import javax.swing.JOptionPane;

public class ArmazenarNomes {

    public static void main(String[] args) {
        // Criar um vetor para armazenar os nomes
        String[] nomes = new String[5];

        // Preencher o vetor com nomes
        for (int i = 0; i < 5; i++) {
            nomes[i] = JOptionPane.showInputDialog("Digite o nome da pessoa " + (i + 1) + ":");
        }

        // Solicitar ao usuário um número de 1 a 5
        String input = JOptionPane.showInputDialog("Digite um número de 1 a 5 para obter o nome correspondente:");

        try {
            // Converter a entrada do usuário em um número inteiro
            int numero = Integer.parseInt(input);

            // Verificar se o número está dentro do intervalo válido
            if (numero >= 1 && numero <= 5) {
                // Recuperar e imprimir o nome correspondente
                String nomeCorrespondente = nomes[numero - 1];
                JOptionPane.showMessageDialog(null,
                        "O nome correspondente ao número " + numero + " é: " + nomeCorrespondente);
            } else {
                JOptionPane.showMessageDialog(null, "Número fora do intervalo válido.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada inválida. Por favor, digite um número válido de 1 a 5.");
        }
    }
}
