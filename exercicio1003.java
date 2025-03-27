import javax.swing.JOptionPane;

public class exercicio1003 {

    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Insira um número inteiro: "));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Insira outro número inteiro: "));
        int soma = a + b;

        JOptionPane.showMessageDialog(null, "SOMA = " + soma);

    }

}