import javax.swing.JOptionPane;

public class exercicio1001 {

    public static void main(String[] args) {

        int a = Integer.parseInt(JOptionPane.showInputDialog("Insira um número inteiro: "));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Insira outro número inteiro: "));

        int x = a + b;

        JOptionPane.showMessageDialog(null, "X = " + x);
    }

}
