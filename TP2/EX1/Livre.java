package TP2.EX1;

public class Livre {
    private String titre;
    private String auteur;
    private int anneePublication;
    private boolean disponible;

    public Livre(String titre, String auteur, int anneePublication) {
        this.titre = titre;
        this.auteur = auteur;
        this.anneePublication = anneePublication;
        this.disponible = true;
    }

    public void afficherInfoLivre() {
        System.out.println("Titre : " + titre + ", Auteur : " + auteur +
                ", Année : " + anneePublication + ", Disponible : " + disponible);
    }

    public boolean emprunterLivre() {
        if (disponible) {
            disponible = false;
            return true;
        }
        return false;
    }

    public void rendreLivre() {
        disponible = true;
    }

    public boolean isDisponible() {
        return disponible;
    }
}
