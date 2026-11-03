public class Facture {
    static final int PRIX_UNITAIRE = 20;
    static final int FRAIS_LIVRAISON = 5;
    static final int RABAIS_FIDELITE = 10;
    static final int SEUIL_LIVRAISON_GRATUITE = 100;
    public static void main(String[] args) {
        String client = "Client démonstration";
        int quantite = 3;

        afficherFacture(client, quantite);
        
        System.out.println("----------"); 
        // client 2 (copie du client 1) 
       String client2 = "Client fidèle";
       int quantite2 = 6;

      afficherFacture(client2, quantite2);
    }
    

    static void afficherFacture(String client, int quantite) {
        int sousTotal = calculerSousTotal(quantite);
        int total = calculerTotal(sousTotal);
        System.out.println("Client : " + client);
        System.out.println(quantite + " article(s) à " + PRIX_UNITAIRE + " $");
        System.out.println("Sous-total : " + sousTotal + " $");
        System.out.println("Total : " + total + " $");
    }
    static int calculerSousTotal(int quantite) {
    return PRIX_UNITAIRE * quantite;
}
static int calculerFraisLivraison(int sousTotal) {
    if (sousTotal >= SEUIL_LIVRAISON_GRATUITE) {
        return 0;
    }
    return FRAIS_LIVRAISON;
}
static int calculerTotal(int sousTotal) {
    int x = sousTotal + calculerFraisLivraison(sousTotal);
    System.out.println("DEBUG x = " + x);
    if (sousTotal > 100) {
        x = x - 15;
    } else {
        x = x - RABAIS_FIDELITE;
    }
    return x;
}
}