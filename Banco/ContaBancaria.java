package Banco;

public class ContaBancaria {

    private double saldo;

    public void depositar(double valor){

        if(valor > 0);{
            saldo = saldo + valor;
            System.out.println("Seu saldo é: " + saldo);
        }
    }

    public double getSaldo() {
        return saldo;
    }

    

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}
