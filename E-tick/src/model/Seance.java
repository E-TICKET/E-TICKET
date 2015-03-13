package model;
/***********************************************************************
 * Module:  Seance.java
 * Author:  Oussama
 * Purpose: Defines the Class Seance
 ***********************************************************************/

import java.util.*;


public class Seance {
 
   public int numSeance;

   public Date heureDebut;

   public Date heureFin;
   
 
   public Collection<Date> date;
   
   

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
         for (Iterator iter = getIteratorDate(); iter.hasNext();)
         {
            oldDate = (Date)iter.next();
            iter.remove();
            oldDate.removeSeance(this);
         }
      }
   }

}