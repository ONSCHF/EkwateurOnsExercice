package com.example.ekwateur;

public class ClientPro {
	private String referenceClient;
	private String siret;
	private String raisonSociale;
	private double ca;
	
	public static final int SEUIL_CA = 1000000;
	
	// Constantes pour les Clients PRO ayant un CA supérieur à 1 000 000 €
    public static final double PRIX_KWH_ELECTRICITE_PRO_CA_SUP = 0.114;
    public static final double PRIX_KWH_GAZ_PRO_CA_SUP = 0.111;
    

    // Constantes pour les Clients PRO ayant un CA inférieur à 1 000 000 €
    public static final double PRIX_KWH_ELECTRICITE_PRO_CA_INF = 0.118;
    public static final double PRIX_KWH_GAZ_PRO_CA_INF = 0.113;
    
    
	public ClientPro(String referenceClient, String siret, String raisonSociale, double ca) {
	     this.referenceClient = referenceClient;
	     this.siret = siret;
	     this.raisonSociale = raisonSociale;
	     this.ca = ca;
	}

	
	 
	 // Méthode pour calculer le montant à facturer pour un client Pro
	 public static double calculerMontantFacture( double consommationElectricite, double consommationGaz, double ca) {
		 double prixElectricite = (ca > SEUIL_CA) ? PRIX_KWH_ELECTRICITE_PRO_CA_SUP : PRIX_KWH_ELECTRICITE_PRO_CA_INF;
	     double prixGaz = (ca > SEUIL_CA) ? PRIX_KWH_GAZ_PRO_CA_SUP : PRIX_KWH_GAZ_PRO_CA_INF;
	     return (consommationElectricite * prixElectricite) + (consommationGaz * prixGaz);

	 }
}
