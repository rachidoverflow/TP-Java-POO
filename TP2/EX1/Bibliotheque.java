package TP2.EX1;

public class Bibliotheque {
    private Livre[] livres;
    private Emprunteur[] emprunteurs;
    private int nbLivres;
    private int nbEmprunteurs;

    public Bibliotheque(int maxLivres, int maxEmprunteurs) {
        livres = new Livre[maxLivres];
        emprunteurs = new Emprunteur[maxEmprunteurs];
        nbLivres = 0;
        nbEmprunteurs = 0;
    }

    public void ajouterLivre(Livre livre) {
        livres[nbLivres++] = livre;
    }

    public void ajouterEmprunteur(Emprunteur emprunteur) {
        emprunteurs[nbEmprunteurs++] = emprunteur;
    }

    public void afficherLivres() {
        for (int i = 0; i < nbLivres; i++) {
            livres[i].afficherInfoLivre();
        }
    }

    public void afficherEmprunteurs() {
        for (int i = 0; i < nbEmprunteurs; i++) {
            emprunteurs[i].afficherInfoEmprunteur();
        }
    }
}
