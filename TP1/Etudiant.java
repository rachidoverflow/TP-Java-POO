package TP1;
public class Etudiant {
    private String CNE;
    private String nom;
    private String prenom;
    private Adresse adresse;
    private int nbrEtudiants = 0;

    public Etudiant() {
        this.CNE = "";
        this.nom = "";
        this.prenom = "";
        this.adresse = null;
        nbrEtudiants++;
    }

    public Etudiant(String CNE, String nom, String prenom, Adresse adresse) {
        this.CNE = CNE;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        nbrEtudiants++;
    }

    public Etudiant(Etudiant e) {
        this.CNE = e.CNE;
        this.nom = e.nom;
        this.prenom = e.prenom;
        this.adresse = e.adresse;
        nbrEtudiants++;
    }

    public void setCNE(String cne) {
        this.CNE = cne;
    }

    public String getCNE() {
        return CNE;
    }

    public void setNom(String n) {
        this.nom = n;
    }

    public String getNom() {
        return nom;
    }

    public void setPrenom(String p) {
        this.prenom = p;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setAdresse(Adresse adr) {
        this.adresse = adr;
    }

    public Adresse getAdresse() {
        return adresse;
    }
    
    public int getNbrEtudiants(){
        return nbrEtudiants;
    }
    @Override
    public String toString() {
        return "CNE" + CNE +
                "Nom : " + nom +
                "Prenom : " + prenom +
                "Adresse : " + adresse.toString();
    }
@Override
public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;

    Etudiant autre = (Etudiant) obj;

    return this.CNE.equals(autre.CNE)
        && this.nom.equals(autre.nom)
        && this.prenom.equals(autre.prenom)
        && this.adresse.equals(autre.adresse);
}


    public void afficherCoordonnees() {
        System.out.println(this.adresse);
    }
}
