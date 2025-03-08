public static void main(String[] args){

//numerosPares();
//consumoMedio();
notaStatus();
}

public static void numerosPares(){

    int numero = 1;
    while(numero <= 100){
        if(numero%2 == 0)
            System.out.println("Seu numero é par: " + numero);
    numero = numero + 1;
    }
}

    public static void consumoMedio(){

        double distancia = 10;
        double consumo = 2;
        double consumoMedio = distancia / consumo;
        System.out.println("O consumo médio é : " + consumoMedio + " km/L");

    }

    public static void notaStatus(){

        double nota1 = 7.5;
        double nota2 = 7.5;
        double nota3 = 7.5;
        double media = (nota1 + nota2 + nota3) / 3;
        System.out.println(media);
        
        if(nota1 > 10 || nota2 > 10 || nota3 > 10){
            System.out.println("Sua nota não pode exceder 10.");
        }
            else if(media >= 9){
                System.out.println("O estado da sua média é: A - " + media);
            }
            else if(media >= 7.5 && media < 9){

                System.out.println("O estado da sua média é: B - " + media);
            }
            else if(media >= 6 && media < 7.5){

                System.out.println("O estado da sua média é: C - " + media);
            }
            else if(media >= 4 && media < 6){

                System.out.println("O estado da sua média é: D - " + media);
            }
            else{
                System.out.println("O estado da sua média é: E - " + media);
            }
        
        }
