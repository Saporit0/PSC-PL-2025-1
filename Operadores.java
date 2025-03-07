public class Operadores{
    
   
   public static void main(String[] args){
        //Operadores aritméticos
    int a = 10;
    int b = 5;
    System.out.println("-------------------");
    System.out.println(a + b);
    System.out.println(a / b);
    System.out.println(a * b);
    System.out.println(a - b);
    System.out.println(a % b);

        // Operadores de comparação

    int c = 500;
    int d = 200;
    System.out.println("-------------------");
    System.out.println(c == d);
    System.out.println(c != d);
    System.out.println(c > d);
    System.out.println(c < d);
    System.out.println(c >= d);
    System.out.println(c <= d);

        // Operadores lógicos
    
    boolean e = true;
    boolean f = false;
    System.out.println("-------------------");
    System.out.println(e && f);
    System.out.println(e || f);
    System.out.println(!e);

        // Operadores de atribuição

    System.out.println("-------------------");
    int g = 10;

    g+=5; // g = g + 5 <--- São iguais
    g-=5; // g = g - 5 <--- São iguais
    g/=5; // g = g / 5 <--- São iguais
    g*=5; // g = g * 5 <--- São iguais
    g%=5; // g = g % 5 <--- São iguais
    }
}