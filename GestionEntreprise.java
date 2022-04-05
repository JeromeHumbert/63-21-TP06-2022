import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class GestionEntreprise {
    private static HashMap<String, ArrayList<Vehicule>> repartitionVehicules = new HashMap<>();
    private static HashSet<String> lieux = new HashSet<>();
    private static int idVehicule = 1;


    private static void chargerLieux(){
        lieux.add("Genève");
        lieux.add("Nyon");
        lieux.add("Lausanne");
    }


   // A développer

    public static void main(String[] args) {
        chargerLieux();
        System.out.println("---------Chargement des données---------------");
        chargerLaRepartition();
        System.out.println();
        affichageParLieu("Genève");
        System.out.println();
        affichageParLieu("Nyon");
        System.out.println();
        affichageParLieu("Lausanne");
        System.out.println();
        affichageParLieu("Zürich");
        System.out.println();
        System.out.println("---------Tests des klaxons---------------");
        testsDesKlaxons();
    }
}
