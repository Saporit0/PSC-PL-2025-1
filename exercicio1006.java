import javax.swing.JOptionPane;

public class exercicio1006 {

    public static void main(String[] args) {
        
        double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Insira a nota da A1: "));
        double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Insira a nota da A2: "));
        double nota3 = Double.parseDouble(JOptionPane.showInputDialog("Insira a nota da A3: "));
        double media = (nota1 + nota2 + nota3)/3;

        JOptionPane.showMessageDialog(null, "MEDIA = " + media);
    }
}