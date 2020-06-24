package exemplowitch;

import javax.swing.JOptionPane;

/**
 *
 * @author Jeferson Leon
 */
public class Exemplowitch {

    public static void main(String[] args) {
        int op;
        for (int i = 1; i <= 8; i++) {
            op = Integer.parseInt(JOptionPane.
                    showInputDialog("Digite o dia da"
                            + " semana numérico"));
            switch (op) {
                case 1:
                    JOptionPane.showMessageDialog(null, "Domingo");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Segunda");
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Terça");
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Quarta");
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Quinta");
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null, "Sexta");
                    break;
                case 7:
                    JOptionPane.showMessageDialog(null, "Sábado");
                    break;
                default:
                    if(op>=8 && op<=10){
                    JOptionPane.showMessageDialog(null, "Por que você digitou"
                            + " o nº "+op+"?");
                    }else{
                        JOptionPane.showMessageDialog(null, "Você não sabe que o nº "
                                +op+" é maior que o dia da semana?");
                    }
            }
        }
    }
}
