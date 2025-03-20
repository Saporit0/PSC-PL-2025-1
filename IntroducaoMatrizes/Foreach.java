package IntroducaoMatrizes;

public class Foreach {

    public static void main(String[] args) {
        
        String[] nomes = {"josé", "maria", "Edipo"};
        int[] numeros = {1, 3, 6, 8, 11};

        for(String nome: nomes){

            System.out.println("Nome: " + nome);
        }
        for(int numero: numeros){

            System.out.println("Números: " + numero);
        }
    }
    
}
