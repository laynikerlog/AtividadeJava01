import javax.swing.JOptionPane;

public class CalculoMediaAlunos {

    public static void main(String[] args) {

        int numAlunos = 15;

        // Arrays para armazenar nomes, notas da PR1 e PR2, médias e situações
        String[] nomes = new String[numAlunos];
        double[] notasPR1 = new double[numAlunos];
        double[] notasPR2 = new double[numAlunos];
        double[] medias = new double[numAlunos];
        String[] situacoes = new String[numAlunos];

        // Preenchimento dos arrays com nomes e notas
        for (int i = 0; i < numAlunos; i++) {
            nomes[i] = JOptionPane.showInputDialog("Digite o nome do aluno " + (i + 1) + ":");
            notasPR1[i] = Double
                    .parseDouble(JOptionPane.showInputDialog("Digite a nota da PR1 do aluno " + nomes[i] + ":"));
            notasPR2[i] = Double
                    .parseDouble(JOptionPane.showInputDialog("Digite a nota da PR2 do aluno " + nomes[i] + ":"));

            // Cálculo da média arredondada
            medias[i] = Math.round((notasPR1[i] + notasPR2[i]) / 2.0);

            // Determinação da situação do aluno
            situacoes[i] = (medias[i] >= 6.0) ? "AP" : "RP";
        }

        // Construção da listagem e impressão
        StringBuilder listagem = new StringBuilder();
        listagem.append("NOME--\tPR1--\tPR2--\tMÉDIA--\tSITUAÇÃO\n");
        for (int i = 0; i < numAlunos; i++) {
            listagem.append(
                    nomes[i] + "\t" + notasPR1[i] + "\t" + notasPR2[i] + "\t" + medias[i] + "\t" + situacoes[i] + "\n");
        }

        JOptionPane.showMessageDialog(null, listagem.toString());
    }
}
