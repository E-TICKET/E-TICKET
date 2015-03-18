package model;
/***********************************************************************
 * Module:  Lieu.java
 * Author:  Oussama
 * Purpose: Defines the Class Lieu
 ***********************************************************************/


import java.util.*;


public class Lieu {

   public int numLieu;
 
   public String nomLieu;

   public String adresse;

   public int nbCategorie;
 
   public int capacite;
   
  
   public int getNumLieu() {
	return numLieu;
}

public void setNumLieu(int numLieu) {
	this.numLieu = numLieu;
}

public String getNomLieu() {
	return nomLieu;
}

public void setNomLieu(String nomLieu) {
	this.nomLieu = nomLieu;
}

public String getAdresse() {
	return adresse;
}

public void setAdresse(String adresse) {
	this.adresse = adresse;
}

public int getNbCategorie() {
	return nbCategorie;
}

public void setNbCategorie(int nbCategorie) {
	this.nbCategorie = nbCategorie;
}

public int getCapacite() {
	return capacite;
}

public void setCapacite(int capacite) {
	this.capacite = capacite;
}

public Collection<Evenement> evenement;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Evenement> getEvenement() {
      if (evenement == null)
         evenement = new java.util.HashSet<Evenement>();
      return evenement;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorEvenement() {
      if (evenement == null)
         evenement = new HashSet<Evenement>();
      return evenement.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newEvenement */
   public void setEvenement(Collection<Evenement> newEvenement) {
      removeAllEvenement();
      for (Iterator iter = newEvenement.iterator(); iter.hasNext();)
         addEvenement((Evenement)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newEvenement */
   public void addEvenement(Evenement newEvenement) {
      if (newEvenement == null)
         return;
      if (this.evenement == null)
         this.evenement = new HashSet<Evenement>();
      if (!this.evenement.contains(newEvenement))
         this.evenement.add(newEvenement);
   }
   
   /** @pdGenerated default remove
     * @param oldEvenement */
   public void removeEvenement(Evenement oldEvenement) {
      if (oldEvenement == null)
         return;
      if (this.evenement != null)
         if (this.evenement.contains(oldEvenement))
            this.evenement.remove(oldEvenement);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllEvenement() {
      if (evenement != null)
         evenement.clear();
   }

}