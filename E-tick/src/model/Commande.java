package model;

import java.util.Date;

/***********************************************************************
 * Module:  Commande.java
 * Author:  Oussama
 * Purpose: Defines the Class Commande
 ***********************************************************************/



public class Commande {

	public int numCommande;

	public Date dateCommande;

	

	

	public int getNumCommande() {
		return numCommande;
	}

	public void setNumCommande(int numCommande) {
		this.numCommande = numCommande;
	}

	public Date getDateCommande() {
		return dateCommande;
	}

	public void setDateCommande(Date dateCommande) {
		this.dateCommande = dateCommande;
	}

}