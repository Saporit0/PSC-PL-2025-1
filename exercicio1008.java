import javax.swing.JOptionPane;

public class exercicio1008 {
    public static void main(String[] args) {

        int numeroFuncionario = Integer.parseInt(JOptionPane.showInputDialog("Insira o número do funcionário: "));
        double horas = Double.parseDouble(JOptionPane.showInputDialog("Insira quantas horas foram trabalhadas: "));
        double valorHora = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor ganho por hora: "));
        double salario = horas * valorHora;

        JOptionPane.showMessageDialog(null, "Funcionário: " + numeroFuncionario + " | Salário = " + salario);
    }

}
