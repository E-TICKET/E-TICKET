package model;
/***********************************************************************
 * Module:  Evenement.java
 * Author:  Oussama
 * Purpose: Defines the Class Evenement
 ***********************************************************************/

import java.util.*;


public class Evenement {

   public int numEvenement;

   public String nomEvenement;

   public int qteStock;

   public int prixMin;
   
   public Collection<LigneCommande> ligneCommande;
   /** @pdRoleInfo migr=no name=Date assc=evenementDate coll=java.util.Collection impl=java.util.HashSet mult=1..* */
   public Date_Ev date;
   public Collection<EvenementCategorie> evenementCategorie;
   
   
   
   
  
  
  
   
   public Date_Ev getDate() {
	return date;
}

public void setDate(Date_Ev date) {
	this.date = date;
}

public int getNumEvenement() {
	return numEvenement;
}

public void setNumEvenement(int numEvenement) {
	this.numEvenement = numEvenement;
}

public String getNomEvenement() {
	return nomEvenement;
}

public void setNomEvenement(String nomEvenement) {
	this.nomEvenement = nomEvenement;
}

public int getQteStock() {
	return qteStock;
}

public void setQteStock(int qteStock) {
	this.qteStock = qteStock;
}

public int getPrixMin() {
	return prixMin;
}

public void setPrixMin(int prixMin) {
	this.prixMin = prixMin;
}

public Collection getLigneCommande() {
	return ligneCommande;
}

public void setLigneCommande(Collection ligneCommande) {
	this.ligneCommande = ligneCommande;
}

public Collection getEvenementCategorie() {
	return evenementCategorie;
}

public void setEvenementCategorie(Collection evenementCategorie) {
	this.evenementCategorie = evenementCategorie;
}



}