package IntroducaoMatrizes;

public class Exceptionexemplo {

    public static void main(String[] args) {
        
        int[] valores = {1, 2, 3, 4, 5};
        
        try {
            
            System.out.println("Valor" + valores[5]);
            
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("erro");
        }
        
    }
    
}
