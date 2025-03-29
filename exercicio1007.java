import javax.swing.JOptionPane;

public class exercicio1007 {

    public static void main(String[] args) {

        int a = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número: "));
        int c = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número: "));
        int d = Integer.parseInt(JOptionPane.showInputDialog("Digite o último número: "));
        int diferencaProduto = (a * b) - (c * d);

        JOptionPane.showMessageDialog(null, "Diferenca = " + diferencaProduto);
    }
}
