package TP3.EX1;

public class Cercle extends Forme {
    private double rayon;

    public Cercle(double rayon) {
        this.rayon = rayon;
    }

    public double calculerSurface() {
        return Math.PI * rayon * rayon;
    }

    public double calculerPerimetre() {
        return 2 * Math.PI * rayon;
    }

    public void afficher() {
        
        System.out.println("Rayon : " + rayon);
        System.out.println("Surface : " + calculerSurface());
        System.out.println("Périmètre : " + calculerPerimetre());
    }
}
