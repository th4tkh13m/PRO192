package EncapsulationDemo;

public class Main {
    public static void main(String[] args) {
        Account acc01 = new Account(111, 2000, "09/01/2002");
        System.out.println("" + acc01.getBalance());
        acc01.setBalance(3000);
        System.out.println("" + acc01.toString());
    }
}
