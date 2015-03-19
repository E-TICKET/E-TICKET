package model;


/***********************************************************************
 * Module:  EvenementCategorie.java
 * Author:  Oussama
 * Purpose: Defines the Class EvenementCategorie
 ***********************************************************************/




public class EvenementCategorie {

	public int prix;
	public int numEvenementCategorie;
	
	public Categorie categorieA;
	public Evenement evenementB;
	
	public int getPrix() {
		return prix;
	}

	public int getNumEvenementCategorie() {
		return numEvenementCategorie;
	}

	public Categorie getCategorieA() {
		return categorieA;
	}

	public Evenement getEvenementB() {
		return evenementB;
	}

	public void setNumEvenementCategorie(int numEvenementCategorie) {
		this.numEvenementCategorie = numEvenementCategorie;
	}
	
	public void setPrix(int prix) {
		this.prix = prix;
	}
	public void setCategorieA(Categorie categorieA) {
		this.categorieA = categorieA;
	}
	public void setEvenementB(Evenement evenementB) {
		this.evenementB = evenementB;
	}

}