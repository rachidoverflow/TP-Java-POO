package TP1;
public class Essai {
    public static void main(String[] args) {
        Adresse adr = new Adresse(123, "mokhayam", "lwakala", "dakhla", "maroc");
        Etudiant et1 = new Etudiant("MC656565", "RACHID", "ELOUIZI", adr);
        InfoS5 info = new InfoS5("Dev logiciel");
        System.out.println(et1.toString());
        System.out.println(et1.getNbrEtudiants());
        info.getNomFiliere();
    }
}
