package TP3.EX1;

public class TestFormes {
    public static void main(String[] args) {
        Forme c = new Cercle(5.0);
        Forme r = new Rectangle(4.0, 3.0);

        c.afficher();
        System.out.println();
        r.afficher();
    }
}
