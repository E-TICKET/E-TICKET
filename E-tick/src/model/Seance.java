package model;
/***********************************************************************
 * Module:  Seance.java
 * Author:  Oussama
 * Purpose: Defines the Class Seance
 ***********************************************************************/

import java.sql.Time;
import java.util.*;


public class Seance {
 
   public int numSeance;

   public Time heureDebut;

   public Time heureFin;
  
   
 
   public void setNumSeance(int numSeance) {
	this.numSeance = numSeance;
}

public void setHeureDebut(Time heureDebut) {
	this.heureDebut = heureDebut;
}

public void setHeureFin(Time heureFin) {
	this.heureFin = heureFin;
}

public Collection<Date_Ev> date;
   
   

   public Collection<Date_Ev> getDate() {
      if (date == null)
         date = new HashSet<Date_Ev>();
      return date;
   }
   
   /** @pdGenerated default iterator getter */
   public Iterator getIteratorDate() {
      if (date == null)
         date = new HashSet<Date_Ev>();
      return date.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newDate */
   public void setDate(Collection<Date_Ev> newDate) {
      removeAllDate();
      for (Iterator iter = newDate.iterator(); iter.hasNext();)
         addDate((Date_Ev)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newDate */
   public void addDate(Date_Ev newDate) {
      if (newDate == null)
         return;
      if (this.date == null)
         this.date = new HashSet<Date_Ev>();
      if (!this.date.contains(newDate))
      {
         this.date.add(newDate);
         newDate.addSeance(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldDate */
   public void removeDate(Date_Ev oldDate) {
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
    	  Date_Ev oldDate;
         for (Iterator iter = getIteratorDate(); iter.hasNext();)
         {
            oldDate = (Date_Ev)iter.next();
            iter.remove();
            oldDate.removeSeance(this);
         }
      }
   }

}