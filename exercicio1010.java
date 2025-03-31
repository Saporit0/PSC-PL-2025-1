import javax.swing.JOptionPane;

public class exercicio1010 {

    public static void main(String[] args) {

        String produto1 = JOptionPane.showInputDialog("Digite o código do produto: ");
        int quantidade1 = Integer.parseInt(JOptionPane.showInputDialog("Digite quantos produtos você pegou: "));
        double valor1 = Double.parseDouble(JOptionPane.showInputDialog("Digite quanto custa o produto: "));
        String produto2 = JOptionPane.showInputDialog("Digite o código do produto: ");
        int quantidade2 = Integer.parseInt(JOptionPane.showInputDialog("Digite quantos produtos você pegou: "));
        double valor2 = Double.parseDouble(JOptionPane.showInputDialog("Digite quanto custa o produto: "));

        double valorTotal = (valor1 * quantidade1) + (valor2 * quantidade2);

        JOptionPane.showMessageDialog(null, "Você adicionou " + quantidade1 + " " + produto1 + "(s) ao carrinho.");
        JOptionPane.showMessageDialog(null, "Você adicionou " + quantidade2 + " " + produto2 + "(s) ao carrinho.");
        JOptionPane.showMessageDialog(null, "O valor total a ser pago é: R$ " + valorTotal);

    }

}
