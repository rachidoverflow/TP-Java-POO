package TP2.EX2;

public class Banque {
    private CompteBancaire[] comptes;
    private int nbComptes;

    public Banque() {
        comptes = new CompteBancaire[100];
        nbComptes = 0;
    }

    public void ajouterCompte(CompteBancaire compte) {
        comptes[nbComptes++] = compte;
    }

    public CompteBancaire rechercherCompteParNumero(int numero) {
        for (int i = 0; i < nbComptes; i++) {
            if (comptes[i].getNumeroCompte() == numero) {
                return comptes[i];
            }
        }
        return null;
    }

    public void afficherTousLesComptes() {
        for (int i = 0; i < nbComptes; i++) {
            comptes[i].afficherDetails();
        }
    }
}
