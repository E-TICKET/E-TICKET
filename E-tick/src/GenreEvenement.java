/***********************************************************************
 * Module:  GenreEvenement.java
 * Author:  Oussama
 * Purpose: Defines the Class GenreEvenement
 ***********************************************************************/

import java.util.*;

/** @pdOid 05321251-3fa0-49d0-ba94-c46d4c3611e2 */
public class GenreEvenement {
   /** @pdOid 45e0d7b3-4647-4b3e-bfc0-43bf6cb92124 */
   public int numGenreEvenement;
   /** @pdOid 748fc6be-1030-4ff2-a5e7-151e5189d448 */
   public java.lang.String nomGenreEvenement;
   
   /** @pdRoleInfo migr=no name=Evenement assc=appartenir coll=java.util.Collection impl=java.util.HashSet mult=1..* side=A */
   public java.util.Collection<Evenement> evenement;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Evenement> getEvenement() {
      if (evenement == null)
         evenement = new java.util.HashSet<Evenement>();
      return evenement;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorEvenement() {
      if (evenement == null)
         evenement = new java.util.HashSet<Evenement>();
      return evenement.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newEvenement */
   public void setEvenement(java.util.Collection<Evenement> newEvenement) {
      removeAllEvenement();
      for (java.util.Iterator iter = newEvenement.iterator(); iter.hasNext();)
         addEvenement((Evenement)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newEvenement */
   public void addEvenement(Evenement newEvenement) {
      if (newEvenement == null)
         return;
      if (this.evenement == null)
         this.evenement = new java.util.HashSet<Evenement>();
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