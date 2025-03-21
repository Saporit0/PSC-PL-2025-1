package Atividades;

import javax.swing.JOptionPane;

public class Desafiosoma {
    public static void main(String[] args) {
        int soma = 0;
        String entrada = JOptionPane.showInputDialog("Insira um número: ");
        int entradaInt = Integer.parseInt(entrada);
        for(int numero = 1; numero <= entradaInt; numero = numero + 1){
            soma = soma + numero;
            System.out.println(soma);
        }
    }
}
