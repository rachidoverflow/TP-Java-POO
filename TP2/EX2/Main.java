package TP2.EX2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Banque banque = new Banque();
        Scanner sc = new Scanner(System.in);
        int choix;

        do {
            System.out.println("1. Ajouter un compte");
            System.out.println("2. Rechercher un compte par numéro");
            System.out.println("3. Déposer de l'argent");
            System.out.println("4. Retirer de l'argent");
            System.out.println("5. Afficher tous les comptes");
            System.out.println("0. Quitter");
            choix = sc.nextInt();

            if (choix == 1) {
                int num = sc.nextInt();
                String nom = sc.next();
                double solde = sc.nextDouble();
                banque.ajouterCompte(new CompteBancaire(num, nom, solde));
            }

            if (choix == 2) {
                int num = sc.nextInt();
                CompteBancaire c = banque.rechercherCompteParNumero(num);
                if (c != null) c.afficherDetails();
            }

            if (choix == 3) {
                int num = sc.nextInt();
                double m = sc.nextDouble();
                CompteBancaire c = banque.rechercherCompteParNumero(num);
                if (c != null) c.deposer(m);
            }

            if (choix == 4) {
                int num = sc.nextInt();
                double m = sc.nextDouble();
                CompteBancaire c = banque.rechercherCompteParNumero(num);
                if (c != null) c.retirer(m);
            }

            if (choix == 5) {
                banque.afficherTousLesComptes();
            }

        } while (choix != 0);
    }
}
