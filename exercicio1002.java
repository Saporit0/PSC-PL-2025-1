import javax.swing.JOptionPane;

public class exercicio1002 {
    public static void main(String[] args) {

        double raio = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do raio: "));
        double area = 3.14159 * (raio * raio);

        JOptionPane.showMessageDialog(null, "A = " + area);
    }
}
