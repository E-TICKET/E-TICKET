package model;
/***********************************************************************
 * Module:  Commande.java
 * Author:  Oussama
 * Purpose: Defines the Class Commande
 ***********************************************************************/



public class Commande {
 
   public String numCommande;
  
   public Date dateCommande;

public String getNumCommande() {
	return numCommande;
}

public void setNumCommande(String numCommande) {
	this.numCommande = numCommande;
}

public Date getDateCommande() {
	return dateCommande;
}

public void setDateCommande(Date dateCommande) {
	this.dateCommande = dateCommande;
}

}