package TP4.EX1;
public class TestVehicules {
    public static void main(String[] args) {
        Vehicule[] vehicules = {
                new Voiture(),
                new Moto(),
                null
        };

        try {
            for (Vehicule v : vehicules) {
                if (v == null) {
                    throw new NullPointerException();
                }
                v.seDeplacer();
                ((VehiculeTerrestre) v).afficherRoues();
            }
        } catch (NullPointerException e) {
            System.out.println("Le véhicule est null.");
        } catch (Exception e) {
            System.out.println("Erreur inattendue.");
        } finally {
            System.out.println("Fin du programme.");
        }
    }
}
