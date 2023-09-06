import javax.swing.JOptionPane;

public class CalculoLucroMercadorias {

    public static void main(String[] args) {
        // Número de mercadorias
        int numMercadorias = 100;

        // Arrays para armazenar os preços de compra e venda
        double[] precoCompra = new double[numMercadorias];
        double[] precoVenda = new double[numMercadorias];

        // Contadores para acompanhar as categorias de lucro
        int lucroMenorQue10 = 0;
        int lucroEntre10E20 = 0;
        int lucroMaiorQue20 = 0;

        // Leitura dos preços de compra e venda
        for (int i = 0; i < numMercadorias; i++) {
            precoCompra[i] = Double.parseDouble(
                    JOptionPane.showInputDialog("Digite o preço de compra da mercadoria " + (i + 1) + ":"));
            precoVenda[i] = Double
                    .parseDouble(JOptionPane.showInputDialog("Digite o preço de venda da mercadoria " + (i + 1) + ":"));

            // Cálculo do lucro percentual
            double lucroPercentual = ((precoVenda[i] - precoCompra[i]) / precoCompra[i]) * 100;

            // Classificação do lucro
            if (lucroPercentual < 10) {
                lucroMenorQue10++;
            } else if (lucroPercentual >= 10 && lucroPercentual <= 20) {
                lucroEntre10E20++;
            } else {
                lucroMaiorQue20++;
            }
        }

        // Impressão dos resultados
        JOptionPane.showMessageDialog(null,
                "Mercadorias com lucro menor que 10%: " + lucroMenorQue10 + " mercadorias\n" +
                        "Mercadorias com lucro entre 10% e 20%: " + lucroEntre10E20 + " mercadorias\n" +
                        "Mercadorias com lucro maior que 20%: " + lucroMaiorQue20 + " mercadorias");
    }
}
