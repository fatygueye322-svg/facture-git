public class Facture {
  public static void main(String[] args) {
        afficherFacture("Client démonstration", 3);
        System.out.println("----------");
        afficherFacture("Client fidèle", 6);
    }

    static void afficherFacture(String client, int quantite) {
        int sousTotal = CalculFacture.calculerSousTotal(quantite);
        int total = CalculFacture.calculerTotal(sousTotal);
        System.out.println("Client : " + client);
        System.out.println(quantite + " article(s) à "
                + CalculFacture.PRIX_UNITAIRE + " $");
        System.out.println("Sous-total : " + sousTotal + " $");
        System.out.println("Total : " + total + " $");
    }
}   