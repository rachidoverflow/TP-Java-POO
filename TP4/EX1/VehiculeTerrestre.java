package TP4.EX1;
public abstract class VehiculeTerrestre implements Vehicule {
    protected int nombreRoues;

    public VehiculeTerrestre(int nombreRoues) {
        this.nombreRoues = nombreRoues;
    }

    public void afficherRoues() {
        System.out.println("Nombre de roues : " + nombreRoues);
    }
}