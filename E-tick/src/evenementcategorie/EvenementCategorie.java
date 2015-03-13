package evenementcategorie;

import categorie.Categorie;
import evenement.Evenement;

/***********************************************************************
 * Module:  EvenementCategorie.java
 * Author:  Oussama
 * Purpose: Defines the Class EvenementCategorie
 ***********************************************************************/




public class EvenementCategorie {
  
   public int prix;
   
   public Categorie categorieA;
   public Evenement evenementB;
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