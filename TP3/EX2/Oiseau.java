package TP3.EX2;

public class Oiseau extends Animal implements Volant {
    public Oiseau(String nom) {
        super(nom);
    }

    public void voler() {
        System.out.println("Capacité : Je vole.");
    }
}
