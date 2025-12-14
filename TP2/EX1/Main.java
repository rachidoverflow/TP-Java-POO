package TP2.EX1;

public class Main {
    public static void main(String[] args) {
        Bibliotheque biblio = new Bibliotheque(10, 10);

        Livre l1 = new Livre("Java", "Deitel", 2020);
        Livre l2 = new Livre("POO", "Bouchard", 2018);

        Emprunteur e1 = new Emprunteur("Ali", "Karim", 1);
        Emprunteur e2 = new Emprunteur("Sara", "Amine", 2);

        biblio.ajouterLivre(l1);
        biblio.ajouterLivre(l2);

        biblio.ajouterEmprunteur(e1);
        biblio.ajouterEmprunteur(e2);

        e1.emprunterLivre(l1);
        e1.rendreLivre(l1);

        biblio.afficherLivres();
        biblio.afficherEmprunteurs();
    }
}
