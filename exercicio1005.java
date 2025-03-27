import javax.swing.JOptionPane;

public class exercicio1005 {
    public static void main(String[] args) {

        double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da A1: "));
        double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Insira a nota da A2: "));
        double media = (nota1  + nota2)/2;

        JOptionPane.showMessageDialog(null, "MEDIA = " + media);
    }

}
