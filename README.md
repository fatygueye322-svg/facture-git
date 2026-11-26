\# Application de facturation

&#x20;

Cette application calcule le total d'un achat.

&#x20;

Compilation : javac -encoding UTF-8 Facture.java

Exécution : java Facture

&#x20;

Exemple actuel : 3 articles à 20 dollars avec 5 dollars de frais de livraison donnent 65 dollars.

La facture affiche maintenant la quantité et le prix unitaire des articles.

Pour contribuer, consultez CONTRIBUTING.md.

## Construire et lancer

    ./mvnw clean package
    java -jar target/facture-1.0-SNAPSHOT-jar-with-dependencies.jar