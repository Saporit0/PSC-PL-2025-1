package Banco;

public class Main {
    public static void main(String[] args) {
        ContaBancaria cb = new ContaBancaria();
        cb.setSaldo(10);
        System.out.println(cb.getSaldo());
    }
}
