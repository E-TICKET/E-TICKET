/***********************************************************************
 * Module:  Seance.java
 * Author:  Oussama
 * Purpose: Defines the Class Seance
 ***********************************************************************/

import java.util.*;

/** @pdOid 88775d7e-8446-49c9-98e7-450ccbcc6012 */
public class Seance {
   /** @pdOid d8b81c2c-dddd-46b6-b290-67381aa23222 */
   public int numSeance;
   /** @pdOid 59d71673-31e6-4af5-84b0-59966226628b */
   public java.util.Date heureDebut;
   /** @pdOid 90377d0a-6b93-46b2-9670-236f40fc5452 */
   public java.util.Date heureFin;
   
   /** @pdRoleInfo migr=no name=Date assc=seanceDate coll=java.util.Collection impl=java.util.HashSet mult=1..* side=A */
   public java.util.Collection<Date> date;
   
   
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
         newDate.addSeance(this);      
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
            oldDate.removeSeance(this);
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
            oldDate.removeSeance(this);
         }
      }
   }

}