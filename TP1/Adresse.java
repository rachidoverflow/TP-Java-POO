package TP1;
public class Adresse  {
    private int numero;
    private String rue;
    private String quartier;
    private String ville;
    private String pays;

    public Adresse() {
        this.numero = 0;
        this.rue = "";
        this.quartier = "";
        this.ville = "";
        this.pays = "";
    }

    public Adresse(int numero, String rue, String quartier, String ville, String pays) {
        this.numero = numero;
        this.rue = rue;
        this.quartier = quartier;
        this.ville = ville;
        this.pays = pays;
    }

    public Adresse(Adresse a) {
        this.numero = a.numero;
        this.rue = a.rue;
        this.quartier = a.quartier;
        this.ville = a.ville;
        this.pays = a.pays;
    }

    // ********** */
    void setNumero(int n) {
        numero = n;
    }

    int getNumero() {
        return numero;
    }

    void setRue(String r) {
        rue = r;
    }

    String getRue() {
        return rue;
    }

    void setQuartier(String q) {
        quartier = q;
    }

    String getString() {
        return quartier;
    }

    void setVille(String v) {
        ville = v;
    }

    String getVille() {
        return ville;
    }

    void setPays(String p) {
        pays = p;
    }

    String getPays() {
        return pays;
    }

    // **************************** */

    @Override
    public String toString() {
        return "Numero : " + numero +
                "Rue : " + rue +
                "Quartier : " + quartier +
                "Ville : " + ville +
                "Pays : " + pays;
    }

    public void afficher() {
        // System.out.println("Numero : " + numero +
        //         "Rue : " + rue +
        //         "Quartier : " + quartier +
        //         "Ville : " + ville +
        //         "Pays : " + pays);

        System.out.println(this.toString());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (obj == null) {
            return false;
        } else {
            Adresse autre =  (Adresse)obj;
            return this.numero == autre.numero && this.rue == autre.rue && this.quartier == autre.quartier
                    && this.ville == autre.quartier && this.pays == autre.pays;
        }
    }
}
