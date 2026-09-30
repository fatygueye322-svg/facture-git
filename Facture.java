public class Facture {
    public static void main(String[] args) {
        String client = "Client démonstration";
        int prixUnitaire = 20;
        int quantite = 3;
        int total = prixUnitaire * quantite;

        System.out.println("Client : " + client);
        System.out.println("Total : " + total + " $");
    }
}