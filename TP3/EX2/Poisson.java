package TP3.EX2;

public class Poisson extends Animal implements Nageur {
    public Poisson(String nom) {
        super(nom);
    }

    public void nager() {
        System.out.println("Capacité : Je nage.");
    }
}
