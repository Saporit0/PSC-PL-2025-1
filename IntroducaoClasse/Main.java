package introducaoClasse;

public class Main {
    
    public static void main(String[] args){

        Funcaoclasse individuo1 = new Funcaoclasse();
        Funcaoclasse individuo2 = new Funcaoclasse();
        Funcaoclasse individuo3 = new Funcaoclasse();
        individuo1.nome = "jose";
        individuo1.setPeso(120);
        individuo2.nome = "maria";
        individuo2.setPeso(90);
        individuo3.nome = "Edipo";
         for( int i=0; i <= 50; i = i + 1)
        System.out.println("individuo 1: " + individuo1.nome + ", " + individuo1.getPeso() + "kg." );
        System.out.println("individuo 2: " + individuo2.nome + ", " + individuo2.getPeso() + "kg." );
    }
}
