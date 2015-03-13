/***********************************************************************
 * Module:  Evenement.java
 * Author:  Oussama
 * Purpose: Defines the Class Evenement
 ***********************************************************************/


/** @pdOid b2863de7-937a-49c2-a10c-ea6593f8003c */
public class Evenement {
   /** @pdOid 0be97fb8-9263-4ee5-8f27-0997179dcd0d */
   public java.lang.String numEvenement;
   /** @pdOid 5b6dd638-3ab5-4cba-b30f-cc9f81984c6a */
   public java.lang.String nomEvenement;
   /** @pdOid a41941cc-1663-41f6-8993-e2a0382f1d14 */
   public int qteStock;
   /** @pdOid 9e841fa1-3972-45f1-851e-e187e157ca6c */
   public int prixMin;
   
   public java.util.Collection ligneCommande;
   /** @pdRoleInfo migr=no name=Date assc=evenementDate coll=java.util.Collection impl=java.util.HashSet mult=1..* */
   public java.util.Collection<Date> date;
   public java.util.Collection evenementCategorie;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Date> getDate() {
      if (date == null)
         date = new java.util.HashSet<Date>();
      return date;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorDate() {
      if (date == null)
         date = new java.util.HashSet<Date>();
      return date.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newDate */
   public void setDate(java.util.Collection<Date> newDate) {
      removeAllDate();
      for (java.util.Iterator iter = newDate.iterator(); iter.hasNext();)
         addDate((Date)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newDate */
   public void addDate(Date newDate) {
      if (newDate == null)
         return;
      if (this.date == null)
         this.date = new java.util.HashSet<Date>();
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
   
   /** @pdGenerated default removeAll */
   public void removeAllDate() {
      if (date != null)
      {
         Date oldDate;
         for (java.util.Iterator iter = getIteratorDate(); iter.hasNext();)
         {
            oldDate = (Date)iter.next();
            iter.remove();
            oldDate.removeEvenement(this);
         }
      }
   }

}