package TP2.EX1;

public class Emprunteur {
    private String nom;
    private String prenom;
    private int idEmprunteur;

    public Emprunteur(String nom, String prenom, int idEmprunteur) {
        this.nom = nom;
        this.prenom = prenom;
        this.idEmprunteur = idEmprunteur;
    }

    public void afficherInfoEmprunteur() {
        System.out.println("ID : " + idEmprunteur + ", Nom : " + nom + ", Prénom : " + prenom);
    }

    public void emprunterLivre(Livre livre) {
        livre.emprunterLivre();
    }

    public void rendreLivre(Livre livre) {
        livre.rendreLivre();
    }
}
