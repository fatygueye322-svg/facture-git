public class Facture {
    public static void main(String[] args) {
        String client = "Client démonstration";
        int prixUnitaire = 20;
        int quantite = 3;
        int fraisLivraison = 5;
        int rabais = 10;
        int total = prixUnitaire * quantite + fraisLivraison - rabais;
        System.out.println("Client : " + client);
        System.out.println("Total : " + total + " $");
    }
}