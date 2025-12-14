package TP4.EX2;

public class Produit {
    private String nom;
    private double prix;

    public Produit(String nom, double prix) throws PrixInvalideException {
        if (prix <= 0) {
            throw new PrixInvalideException("Erreur : Le prix du produit " + nom + " est invalide.");
        }
        this.nom = nom;
        this.prix = prix;
    }

    public void afficherDetails() {
        System.out.println("Produit : " + nom + ", Prix : " + prix);
    }
}
