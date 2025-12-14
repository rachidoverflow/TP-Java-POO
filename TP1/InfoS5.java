package TP1;
import java.util.ArrayList;
public class InfoS5 {
    private String nomFiliere;
    private ArrayList<Etudiant> listeEtudiants;
    
    public InfoS5(){
        nomFiliere = "BIG DATA";
        listeEtudiants = new ArrayList<>();
    }

    public InfoS5(String nomFiliere){
        this.nomFiliere = nomFiliere;
        listeEtudiants = new ArrayList<>();
    }
    public InfoS5(InfoS5 autre){
        this.nomFiliere = autre.nomFiliere;
        this.listeEtudiants = new ArrayList<>(autre.listeEtudiants);
    }

    public String getNomFiliere(){
        return nomFiliere;
    }
    public void setNomFiliere(String nomFiliere){
        this.nomFiliere = nomFiliere;
    }
    public ArrayList<Etudiant> getListeEtudiants(){
        return listeEtudiants;
    }
    public void setListeEtudiants(ArrayList<Etudiant> listeEtudiants){
        this.listeEtudiants = new ArrayList<>(listeEtudiants);
    }

    public void afficherFiliere(){
         System.out.println("nom de filiere est : "+nomFiliere);
    }
    
    public void afficherListe(){
        for(Etudiant e:listeEtudiants){
            String liste = "Nom :"+e.getNom()
            +"\n Prenom : "+e.getPrenom()
            +"\n CNE :"+e.getCNE()
            +"\n---------------";
            System.out.println(liste);
        }
    }

    public void afficherTotalEtudiants(){
        System.out.println(listeEtudiants.size());
    }

    public void AjouterEtudiant(Etudiant e){
        listeEtudiants.add(e);
    }
    public Etudiant chercherEtudiant(Etudiant e){
        for(Etudiant etud : listeEtudiants){
            if(etud.getCNE().equals(e.getCNE())){
                return etud;
            }
            
        }
        return null;
    }


}
