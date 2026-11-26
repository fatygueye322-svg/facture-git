public class ResumeFacture {
    String client;
    int quantite;
    int sousTotal;
    int total;

    ResumeFacture(String client, int quantite, int sousTotal, int total) {
        this.client = client;
        this.quantite = quantite;
        this.sousTotal = sousTotal;
        this.total = total;
    }
}