package model;
/***********************************************************************
 * Module:  TypeEvenement.java
 * Author:  Oussama
 * Purpose: Defines the Class TypeEvenement
 ***********************************************************************/

import java.util.*;
public class TypeEvenement {

   public String numTypeEvenement;

   public String libelleTypeEvenementt;

   public int nbrType;
   

   public Collection<GenreEvenement> genreEvenement;
   
   
   /** @pdGenerated default getter */
   public Collection<GenreEvenement> getGenreEvenement() {
      if (genreEvenement == null)
         genreEvenement = new HashSet<GenreEvenement>();
      return genreEvenement;
   }
   
   /** @pdGenerated default iterator getter */
   public Iterator getIteratorGenreEvenement() {
      if (genreEvenement == null)
         genreEvenement = new HashSet<GenreEvenement>();
      return genreEvenement.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newGenreEvenement */
   public void setGenreEvenement(Collection<GenreEvenement> newGenreEvenement) {
      removeAllGenreEvenement();
      for (Iterator iter = newGenreEvenement.iterator(); iter.hasNext();)
         addGenreEvenement((GenreEvenement)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newGenreEvenement */
   public void addGenreEvenement(GenreEvenement newGenreEvenement) {
      if (newGenreEvenement == null)
         return;
      if (this.genreEvenement == null)
         this.genreEvenement = new HashSet<GenreEvenement>();
      if (!this.genreEvenement.contains(newGenreEvenement))
         this.genreEvenement.add(newGenreEvenement);
   }
   
   /** @pdGenerated default remove
     * @param oldGenreEvenement */
   public void removeGenreEvenement(GenreEvenement oldGenreEvenement) {
      if (oldGenreEvenement == null)
         return;
      if (this.genreEvenement != null)
         if (this.genreEvenement.contains(oldGenreEvenement))
            this.genreEvenement.remove(oldGenreEvenement);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllGenreEvenement() {
      if (genreEvenement != null)
         genreEvenement.clear();
   }

}