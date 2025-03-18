package atividadeClasse;

import javax.swing.JOptionPane;

public class Main {
    
    public static void main(String[] args){

        Notas notas = new Notas();
        
         notas.portugues = Double.parseDouble(JOptionPane.showInputDialog("Digite sua nota de inglês: "));
         notas.ingles = Double.parseDouble(JOptionPane.showInputDialog("Digite sua nota de português: "));
         notas.matematica = Double.parseDouble(JOptionPane.showInputDialog("Digite sua nota de matématica: "));
         notas.setMedia(notas);
         
         if(notas.getMedia() >= 7){

            JOptionPane.showMessageDialog(null,"Você está aprovado!");
         }
         else{
            
            JOptionPane.showMessageDialog(null, "Você está reprovado!"); 
        }
         
         JOptionPane.showMessageDialog(null, "Português: " + notas.portugues + 
         " | Inglês: " + notas.ingles + 
         " | Matématica: " + notas.matematica + " | Média: " + notas.getMedia());;
    }
}

