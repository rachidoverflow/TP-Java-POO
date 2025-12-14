package TP3.EX1;

public class Rectangle extends Forme {
    private double longueur;
    private double largeur;

    public Rectangle(double longueur, double largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }

    public double calculerSurface() {
        return longueur * largeur;
    }

    public double calculerPerimetre() {
        return 2 * (longueur + largeur);
    }

    public void afficher() {
         System.out.println("Longueur : " + longueur);
        System.out.println("Largeur : " + largeur);
        System.out.println("Surface : " + calculerSurface());
        System.out.println("Périmètre : " + calculerPerimetre());
    }
}
