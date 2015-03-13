/***********************************************************************
 * Module:  Lieu.java
 * Author:  Oussama
 * Purpose: Defines the Class Lieu
 ***********************************************************************/


/** @pdOid 46a6fa0e-d5e9-41bd-8366-8db7f1acdff7 */
public class Lieu {
   /** @pdOid f1941195-ae9a-41d8-9378-927e7e3f83d8 */
   public java.lang.String numLieu;
   /** @pdOid 6fe91b82-ef3c-4d8a-9aa1-7896eb88563b */
   public java.lang.String nomLieu;
   /** @pdOid 5e7faac0-4b31-4393-800d-29909f2c4a1d */
   public java.lang.String adresse;
   /** @pdOid 98a823e2-f4fb-4be6-b34f-528448e0938c */
   public int nbCategorie;
   /** @pdOid 0f0b4e88-b9ac-4f1a-bfba-3e646342275b */
   public int capacite;
   
   /** @pdRoleInfo migr=no name=Evenement assc=etreDans coll=java.util.Collection impl=java.util.HashSet mult=1..* side=A */
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