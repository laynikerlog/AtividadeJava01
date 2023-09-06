import javax.swing.JOptionPane;

public class Horoscopo {

    public static void main(String[] args) {
        while (true) {
            // Ler a data de nascimento como uma string
            String dataNascimento = JOptionPane
                    .showInputDialog("Digite a data de nascimento (ddmm), ou 9999 para sair:");

            // Verificar se o usuário deseja sair
            if (dataNascimento.equals("9999")) {
                break;
            }

            // Extrair o mês e o dia da data de nascimento
            int mes = Integer.parseInt(dataNascimento.substring(2, 4));
            int dia = Integer.parseInt(dataNascimento.substring(0, 2));

            // Determinar o signo com base no mês e dia
            String signo = determinarSigno(mes, dia);

            // Exibir o signo correspondente
            JOptionPane.showMessageDialog(null, "Seu signo do zodíaco é: " + signo);
        }
    }

    public static String determinarSigno(int mes, int dia) {
        if (mes == 1 && dia <= 20) {
            return "Capricórnio";
        } else if ((mes == 1 && dia >= 21) || (mes == 2 && dia <= 19)) {
            return "Aquário";
        } else if ((mes == 2 && dia >= 20) || (mes == 3 && dia <= 20)) {
            return "Peixes";
        } else if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 20)) {
            return "Áries";
        } else if ((mes == 4 && dia >= 21) || (mes == 5 && dia <= 20)) {
            return "Touro";
        } else if ((mes == 5 && dia >= 21) || (mes == 6 && dia <= 20)) {
            return "Gêmeos";
        } else if ((mes == 6 && dia >= 21) || (mes == 7 && dia <= 21)) {
            return "Câncer";
        } else if ((mes == 7 && dia >= 22) || (mes == 8 && dia <= 22)) {
            return "Leão";
        } else if ((mes == 8 && dia >= 23) || (mes == 9 && dia <= 22)) {
            return "Virgem";
        } else if ((mes == 9 && dia >= 23) || (mes == 10 && dia <= 22)) {
            return "Libra";
        } else if ((mes == 10 && dia >= 23) || (mes == 11 && dia <= 21)) {
            return "Escorpião";
        } else if ((mes == 11 && dia >= 22) ||
                (mes == 12 && dia <= 21)) {
            return "Sagitário";
        }
        return "Capricórnio";
    }
}
