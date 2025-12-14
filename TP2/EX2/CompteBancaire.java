package TP2.EX2;

public class CompteBancaire {
    private int numeroCompte;
    private String titulaire;
    private double solde;

    public CompteBancaire(int numeroCompte, String titulaire, double solde) {
        this.numeroCompte = numeroCompte;
        this.titulaire = titulaire;
        this.solde = solde;
    }

    public int getNumeroCompte() {
        return numeroCompte;
    }

    public double getSolde() {
        return solde;
    }

    public void deposer(double montant) {
        solde += montant;
    }

    public boolean retirer(double montant) {
        if (montant <= solde) {
            solde -= montant;
            return true;
        }
        return false;
    }

    public void afficherDetails() {
        System.out.println("Compte : " + numeroCompte + ", Titulaire : " + titulaire + ", Solde : " + solde);
    }
}
