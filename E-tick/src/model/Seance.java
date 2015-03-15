package model;
/***********************************************************************
 * Module:  Seance.java
 * Author:  Oussama
 * Purpose: Defines the Class Seance
 ***********************************************************************/

import java.util.*;


public class Seance {
 
   public int numSeance;

   public Date_E heureDebut;

   public Date_E heureFin;
   
 
   public Collection<Date_E> date;
   
   

   public Collection<Date_E> getDate() {
      if (date == null)
         date = new HashSet<Date_E>();
      return date;
   }
   
   /** @pdGenerated default iterator getter */
   public Iterator getIteratorDate() {
      if (date == null)
         date = new HashSet<Date_E>();
      return date.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newDate */
   public void setDate(Collection<Date_E> newDate) {
      removeAllDate();
      for (Iterator iter = newDate.iterator(); iter.hasNext();)
         addDate((Date_E)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newDate */
   public void addDate(Date_E newDate) {
      if (newDate == null)
         return;
      if (this.date == null)
         this.date = new HashSet<Date_E>();
      if (!this.date.contains(newDate))
      {
         this.date.add(newDate);
         newDate.addSeance(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldDate */
   public void removeDate(Date_E oldDate) {
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
         Date_E oldDate;
         for (Iterator iter = getIteratorDate(); iter.hasNext();)
         {
            oldDate = (Date_E)iter.next();
            iter.remove();
            oldDate.removeSeance(this);
         }
      }
   }

}