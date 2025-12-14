package TP3.EX2;

public class Canard extends Animal implements Nageur, Volant {
    public Canard(String nom) {
        super(nom);
    }

    public void nager() {
        System.out.print("Capacité : Je nage ");
    }

    public void voler() {
        System.out.println("et je vole.");
    }
}
