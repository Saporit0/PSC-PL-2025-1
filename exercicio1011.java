import javax.swing.JOptionPane;

public class exercicio1011 {

    public static void main(String[] args) {
        
        double raio = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do raio: "));

        double volume = (4.0/3.0) * 3.14159 * (raio * raio * raio);

        JOptionPane.showMessageDialog(null, "O volume da esfera é: " + volume);
    }
    
}
