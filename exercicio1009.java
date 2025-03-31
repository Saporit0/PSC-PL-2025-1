import javax.swing.JOptionPane;

public class exercicio1009 {

    public static void main(String[] args) {
        
        String nome = JOptionPane.showInputDialog("Digite seu nome: ");
        double salarioFixo = Double.parseDouble(JOptionPane.showInputDialog("Digite seu salário fixo: "));
        double montanteVendas = Double.parseDouble(JOptionPane.showInputDialog("Digite o montante de vendas do mês: "));

        double salarioTotal = ((montanteVendas * 15) / 100) + salarioFixo;

        JOptionPane.showMessageDialog(null, "Olá " + nome + ", seu salário total é " + salarioTotal + ".");
    }
    
}
