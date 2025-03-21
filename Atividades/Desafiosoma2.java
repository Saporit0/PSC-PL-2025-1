package Atividades;

import javax.swing.JOptionPane;

public class Desafiosoma2 {
    public static void main(String[] args) {
        String entrada = JOptionPane.showInputDialog("Insira um número: ");
        int entradaInt = Integer.parseInt(entrada);
        for(int numero = 1; numero <= entradaInt; numero = numero + 1){
            System.out.println(entradaInt + numero);
        }
    }
}
