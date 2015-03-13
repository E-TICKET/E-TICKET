package model;
/***********************************************************************
 * Module:  GenreEvenement.java
 * Author:  Oussama
 * Purpose: Defines the Class GenreEvenement
 ***********************************************************************/

import java.util.*;

import evenement.Evenement;


public class GenreEvenement {

   public int numGenreEvenement;
 
   public String nomGenreEvenement;
   
   
   public Collection<Evenement> evenement;
   
   

   public Collection<Evenement> getEvenement() {
      if (evenement == null)
         evenement = new HashSet<Evenement>();
      return evenement;
   }
   

   public Iterator getIteratorEvenement() {
      if (evenement == null)
         evenement = new HashSet<Evenement>();
      return evenement.iterator();
   }
   

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