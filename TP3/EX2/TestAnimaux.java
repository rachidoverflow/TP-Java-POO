package TP3.EX2;

public class TestAnimaux {
    public static void main(String[] args) {
        Poisson p = new Poisson("Poisson rouge");
        Oiseau o = new Oiseau("Aigle");
        Canard c = new Canard("Canard");

        p.afficherNom();
        p.nager();
        System.out.println();

        o.afficherNom();
        o.voler();
        System.out.println();

        c.afficherNom();
        c.nager();
        c.voler();
    }
}
