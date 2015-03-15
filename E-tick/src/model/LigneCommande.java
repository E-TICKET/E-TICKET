package model;


/***********************************************************************
 * Module:  LigneCommande.java
 * Author:  Oussama
 * Purpose: Defines the Class LigneCommande
 ***********************************************************************/



public class LigneCommande {

   public int qteCommandee; 
   public Evenement evenement;
   public Panier panier;
   
   
public void setQteCommandee(int qteCommandee) {
	this.qteCommandee = qteCommandee;
}
public void setEvenementA(Evenement evenementA) {
	this.evenement = evenementA;
}
public void setPanier(Panier panier) {
	this.panier = panier;
}
   
  }