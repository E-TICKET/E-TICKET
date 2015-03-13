package evenement;
/***********************************************************************
 * Module:  Evenement.java
 * Author:  Oussama
 * Purpose: Defines the Class Evenement
 ***********************************************************************/

import java.util.*;

import model.Date;

public class Evenement {

   public int numEvenement;

   public String nomEvenement;

   public int qteStock;

   public int prixMin;
   
   public Collection ligneCommande;
   /** @pdRoleInfo migr=no name=Date assc=evenementDate coll=java.util.Collection impl=java.util.HashSet mult=1..* */
   public Collection<Date> date;
   public Collection evenementCategorie;
   
   
   /** @pdGenerated default getter */
   public Collection<Date> getDate() {
      if (date == null)
         date = new HashSet<Date>();
      return date;
   }
   
   /** @pdGenerated default iterator getter */
   public Iterator getIteratorDate() {
      if (date == null)
         date = new HashSet<Date>();
      return date.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newDate */
   public void setDate(Collection<Date> newDate) {
      removeAllDate();
      for (Iterator iter = newDate.iterator(); iter.hasNext();)
         addDate((Date)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newDate */
   public void addDate(Date newDate) {
      if (newDate == null)
         return;
      if (this.date == null)
         this.date = new HashSet<Date>();
      if (!this.date.contains(newDate))
      {
         this.date.add(newDate);
         newDate.addEvenement(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldDate */
   public void removeDate(Date oldDate) {
      if (oldDate == null)
         return;
      if (this.date != null)
         if (this.date.contains(oldDate))
         {
            this.date.remove(oldDate);
            oldDate.removeEvenement(this);
         }
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

/** @pdGenerated default removeAll */
   public void removeAllDate() {
      if (date != null)
      {
         Date oldDate;
         for (Iterator iter = getIteratorDate(); iter.hasNext();)
         {
            oldDate = (Date)iter.next();
            iter.remove();
            oldDate.removeEvenement(this);
         }
      }
   }

}