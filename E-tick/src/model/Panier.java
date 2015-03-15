package model;
/***********************************************************************
 * Module:  Panier.java
 * Author:  Oussama
 * Purpose: Defines the Class Panier
 ***********************************************************************/



public class Panier {
   
   public int numPanier;
   
   public LigneCommande ligneCommande;

public int getNumPanier() {
	return numPanier;
}

public void setNumPanier(int numPanier) {
	this.numPanier = numPanier;
}

public LigneCommande getLigneCommande() {
	return ligneCommande;
}

public void setLigneCommande(LigneCommande ligneCommande) {
	this.ligneCommande = ligneCommande;
}

}