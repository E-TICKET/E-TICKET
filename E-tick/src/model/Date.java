package model;
/***********************************************************************
 * Module:  Date.java
 * Author:  Oussama
 * Purpose: Defines the Class Date
 ***********************************************************************/


/** @pdOid 62dfa4af-1c65-49fd-8973-4c3bd29f5559 */
public class Date {
   /** @pdOid 477d7f92-0e3f-4ae7-a874-75ec4b216506 */
   public int numDate;
   /** @pdOid 7c615fcc-9b63-4f0d-b69f-c1906b9dae7a */
   public java.util.Date dateDebut;
   /** @pdOid c750b605-cf00-492a-a383-4362fec49b4e */
   public java.util.Date dateFin;
   
   /** @pdRoleInfo migr=no name=Seance assc=seanceDate coll=java.util.Collection impl=java.util.HashSet mult=1..* */
   public java.util.Collection<Seance> seance;
   /** @pdRoleInfo migr=no name=Evenement assc=evenementDate coll=java.util.Collection impl=java.util.HashSet mult=1..* side=A */
   public java.util.Collection<Evenement> evenement;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Seance> getSeance() {
      if (seance == null)
         seance = new java.util.HashSet<Seance>();
      return seance;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorSeance() {
      if (seance == null)
         seance = new java.util.HashSet<Seance>();
      return seance.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newSeance */
   public void setSeance(java.util.Collection<Seance> newSeance) {
      removeAllSeance();
      for (java.util.Iterator iter = newSeance.iterator(); iter.hasNext();)
         addSeance((Seance)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newSeance */
   public void addSeance(Seance newSeance) {
      if (newSeance == null)
         return;
      if (this.seance == null)
         this.seance = new java.util.HashSet<Seance>();
      if (!this.seance.contains(newSeance))
      {
         this.seance.add(newSeance);
         newSeance.addDate(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldSeance */
   public void removeSeance(Seance oldSeance) {
      if (oldSeance == null)
         return;
      if (this.seance != null)
         if (this.seance.contains(oldSeance))
         {
            this.seance.remove(oldSeance);
            oldSeance.removeDate(this);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllSeance() {
      if (seance != null)
      {
         Seance oldSeance;
         for (java.util.Iterator iter = getIteratorSeance(); iter.hasNext();)
         {
            oldSeance = (Seance)iter.next();
            iter.remove();
            oldSeance.removeDate(this);
         }
      }
   }
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
      {
         this.evenement.add(newEvenement);
         newEvenement.addDate(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldEvenement */
   public void removeEvenement(Evenement oldEvenement) {
      if (oldEvenement == null)
         return;
      if (this.evenement != null)
         if (this.evenement.contains(oldEvenement))
         {
            this.evenement.remove(oldEvenement);
            oldEvenement.removeDate(this);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllEvenement() {
      if (evenement != null)
      {
         Evenement oldEvenement;
         for (java.util.Iterator iter = getIteratorEvenement(); iter.hasNext();)
         {
            oldEvenement = (Evenement)iter.next();
            iter.remove();
            oldEvenement.removeDate(this);
         }
      }
   }

}