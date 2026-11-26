public class CalculFacture {
  static final int PRIX_UNITAIRE = 20;
    static final int FRAIS_LIVRAISON = 5;
    static final int RABAIS_FIDELITE = 10;
    static final int SEUIL_LIVRAISON_GRATUITE = 100;

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
        int totalAvantRabais = sousTotal + calculerFraisLivraison(sousTotal);
        return totalAvantRabais - RABAIS_FIDELITE;
    }
}   
    

