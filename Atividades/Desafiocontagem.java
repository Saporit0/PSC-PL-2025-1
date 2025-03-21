package Atividades;

import javax.swing.JOptionPane;

public class Desafiocontagem {
    public static void main(String[] args) {
        String entrada = JOptionPane.showInputDialog("Insira um número: ");
        int entradaInt = Integer.parseInt(entrada);
        for(int contagem = 1; contagem <= entradaInt; contagem = contagem + 1){

            System.out.println(contagem);
        }
    }
}
