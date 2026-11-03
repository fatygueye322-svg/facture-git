public class Facture {
    static final int PRIX_UNITAIRE = 20;
    static final int FRAIS_LIVRAISON = 5;
    static final int RABAIS_FIDELITE = 10;
    public static void main(String[] args) {
        String client = "Client démonstration";
        int prixUnitaire = PRIX_UNITAIRE;
        int quantite = 3;
        int fraisLivraison = FRAIS_LIVRAISON;
        int rabais = RABAIS_FIDELITE;
        int sousTotal = prixUnitaire * quantite;
        int total = sousTotal + fraisLivraison - rabais;

        System.out.println("Client : " + client);
        System.out.println(quantite + " article(s) à " + prixUnitaire + " $");
        System.out.println("Sous-total : " + sousTotal + " $");
         System.out.println("Total : " + total + " $");; 
        System.out.println("----------"); 
        // client 2 (copie du client 1) 
        String c2 = "Client fidèle"; 
        int q2 = 6; 
        int st2 = prixUnitaire * q2; 
        int t = st2 + FRAIS_LIVRAISON - RABAIS_FIDELITE;
        System.out.println("Client : " + c2); 
        System.out.println(q2 + " article(s) à " + PRIX_UNITAIRE + " $");
        System.out.println("Sous-total : " + st2 + " $"); 
        System.out.println("Total : " + t + " $");
    }
    
}