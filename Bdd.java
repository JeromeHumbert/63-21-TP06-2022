public class Bdd {
    public static String[][] chargerVehicule(){
        //Taxi ou Limo  /  Lieu  / Marque  / Modèle  /  NbPlaces  /  Propriétaire  / TraitementVIP(ou grandCoffre)  / prixLocation (ou prix à la minute)
        String[][] tab = {{"Taxi","Genève","Mercedes","ML200","5","Paul Gaultier","true","5.8"},
                {"Taxi","Lausanne","BMW","M5","5","Joseph Parl","false","4.7"},
                {"Taxi","Nyon","Chrysler","Van","7","Josephine Ruby","true","3.8"},
                {"Taxi","Genève","Ford","Mondeo","5","Séverine Mona","true","2.8"},
                {"Taxi","Lausanne","BMW","C300","5","Jacques Pierre","false","3.1"},
                {"Taxi","Nyon","Audi","A6","5","Aline Tricat","true","5.2"},
                {"Limousine","Lausanne","Lincoln","L2","9","Bob Brico","false","2300"},
                {"Limousine","Genève","Lincoln","L4","12","Michelle Alab","true","3100"},
                {"Limousine","Zürich","Cadillac","Luxious","10","Michael Taleur","false","2000"},
                {"Limousine","Genève","Lincoln","L2","9","Ivan Matius","true","2800"},
                {"Limousine","Nyon","Cadillac","Luxious 3","14","Estelle Paro","true","4500"}};
        return tab;
    }
}
