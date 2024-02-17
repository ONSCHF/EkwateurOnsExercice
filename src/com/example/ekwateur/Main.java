package com.example.ekwateur;

public class Main {
	

    public static void main(String[] args) {
        

        double consommationElectricite = 1000; // Exemple de consommation en kWh
        double consommationGaz = 500; // Exemple de consommation en kWh
        double ca = 1200000; // Exemple CA en €
        
        // Calcul du montant à facturer pour chaque client
        double montantFactureClientPro = ClientPro.calculerMontantFacture(consommationElectricite, consommationGaz, ca);
        double montantFactureClientParticulier = ClientParticulier.calculerMontantFacture(consommationElectricite, consommationGaz);

        System.out.println("Montant à facturer pour le client Pro : " + montantFactureClientPro + " €");
        System.out.println("Montant à facturer pour le client Particulier : " + montantFactureClientParticulier + " €");
    }
}





