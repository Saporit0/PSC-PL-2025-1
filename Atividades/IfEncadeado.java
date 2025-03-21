package Atividades;
import javax.swing.JOptionPane;
public class IfEncadeado {

    public static void main(String[] args) {
        double a1 = Double.parseDouble(JOptionPane.showInputDialog("Digite sua nota da A1: "));
        double a2 = Double.parseDouble(JOptionPane.showInputDialog("Digite sua nota da A2: "));
        double a3 = Double.parseDouble(JOptionPane.showInputDialog("Digite sua nota da A3: "));
        double soma = a1 + a2 + a3;

        if(a1 > 30 || a2 > 30 || a3 > 40){

            System.out.println("Insira uma nota válida.");
        }
        
        else if (soma >= 70) {
            System.out.println("Você foi aprovado!");
        }

        else if (soma >= 60) {
            System.out.println("Você está de recuperação!");
        }
        else{

            System.out.println("Você está reprovado!");
        }

    }

}
