package com.example.ekwateur;

public class ClientParticulier {
	 private String referenceClient;
	 private String civilite;
	 private String nom;
	 private String prenom;
	 
	 public static final double PRIX_KWH_ELECTRICITE_PARTICULIER = 0.121;
	 public static final double PRIX_KWH_GAZ_PARTICULIER = 0.115;

	 public ClientParticulier(String referenceClient, String civilite, String nom, String prenom) {
	     this.referenceClient = referenceClient;
	     this.civilite = civilite;
	     this.nom = nom;
	     this.prenom = prenom;
	 }
	    
	 // Méthode pour calculer le montant à facturer pour un client Particulier
	 public static double calculerMontantFacture(double consommationElectricite, double consommationGaz) {
	     return (consommationElectricite * PRIX_KWH_ELECTRICITE_PARTICULIER) + (consommationGaz * PRIX_KWH_GAZ_PARTICULIER);
	 }    
}
