package model;
import java.util.* ;


public class Date {
   
   public int numDate;

   public Date dateDebut;
   
   public Date dateFin;
   
  
   public Collection<Seance> seance;
   
   public Collection<Evenement> evenement;
   
   
 
   public Collection<Seance> getSeance() {
      if (seance == null)
         seance = new HashSet<Seance>();
      return seance;
   }
   
   /** @pdGenerated default iterator getter */
   public Iterator getIteratorSeance() {
      if (seance == null)
         seance = new HashSet<Seance>();
      return seance.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newSeance */
   public void setSeance(Collection<Seance> newSeance) {
      removeAllSeance();
      for (Iterator iter = newSeance.iterator(); iter.hasNext();)
         addSeance((Seance)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newSeance */
   public void addSeance(Seance newSeance) {
      if (newSeance == null)
         return;
      if (this.seance == null)
         this.seance = new HashSet<Seance>();
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
         for (Iterator iter = getIteratorSeance(); iter.hasNext();)
         {
            oldSeance = (Seance)iter.next();
            iter.remove();
            oldSeance.removeDate(this);
         }
      }
   }
   /** @pdGenerated default getter */
   public Collection<Evenement> getEvenement() {
      if (evenement == null)
         evenement = new HashSet<Evenement>();
      return evenement;
   }
   
   /** @pdGenerated default iterator getter */
   public Iterator getIteratorEvenement() {
      if (evenement == null)
         evenement = new HashSet<Evenement>();
      return evenement.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newEvenement */
   public void setEvenement(java.util.Collection<Evenement> newEvenement) {
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
         for (Iterator iter = getIteratorEvenement(); iter.hasNext();)
         {
            oldEvenement = (Evenement)iter.next();
            iter.remove();
            oldEvenement.removeDate(this);
         }
      }
   }

}