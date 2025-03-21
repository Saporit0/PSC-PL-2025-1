package Atividades;

import javax.swing.JOptionPane;

public class Desafiotabuada {
    public static void main(String[] args) {
        String entrada = JOptionPane.showInputDialog("Insira um número: ");
        int entradaInt = Integer.parseInt(entrada);
        for(int multiplicacao = 1; multiplicacao <= 10; multiplicacao = multiplicacao + 1){

            System.out.println(multiplicacao * entradaInt);
        }
    }
}
