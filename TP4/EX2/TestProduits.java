package TP4.EX2;

public class TestProduits {
    public static void main(String[] args) {
        try {
            Produit p1 = new Produit("Stylo", 10);
            Produit p2 = new Produit("Cahier", -5);
            Produit p3 = new Produit("Livre", 50);

            p1.afficherDetails();
            p2.afficherDetails();
            p3.afficherDetails();

        } catch (PrixInvalideException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Erreur inattendue.");
        } finally {
            System.out.println("Traitement terminé.");
        }
    }
}
