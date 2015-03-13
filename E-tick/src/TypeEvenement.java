/***********************************************************************
 * Module:  TypeEvenement.java
 * Author:  Oussama
 * Purpose: Defines the Class TypeEvenement
 ***********************************************************************/


/** @pdOid 319811f9-3496-4aea-9e67-84d15b7c9881 */
public class TypeEvenement {
   /** @pdOid b87d52cd-09bf-4c8b-b094-70f91c2f8601 */
   public java.lang.String numTypeEvenement;
   /** @pdOid a5974a77-9806-4242-ab17-186aa22d8988 */
   public java.lang.String libelleTypeEvenementt;
   /** @pdOid cdcc571b-b31b-43e1-b141-1d66c2520747 */
   public int nbrType;
   
   /** @pdRoleInfo migr=no name=GenreEvenement assc=typeEvenGenreEven coll=java.util.Collection impl=java.util.HashSet mult=1..* side=A */
   public java.util.Collection<GenreEvenement> genreEvenement;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<GenreEvenement> getGenreEvenement() {
      if (genreEvenement == null)
         genreEvenement = new java.util.HashSet<GenreEvenement>();
      return genreEvenement;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorGenreEvenement() {
      if (genreEvenement == null)
         genreEvenement = new java.util.HashSet<GenreEvenement>();
      return genreEvenement.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newGenreEvenement */
   public void setGenreEvenement(java.util.Collection<GenreEvenement> newGenreEvenement) {
      removeAllGenreEvenement();
      for (java.util.Iterator iter = newGenreEvenement.iterator(); iter.hasNext();)
         addGenreEvenement((GenreEvenement)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newGenreEvenement */
   public void addGenreEvenement(GenreEvenement newGenreEvenement) {
      if (newGenreEvenement == null)
         return;
      if (this.genreEvenement == null)
         this.genreEvenement = new java.util.HashSet<GenreEvenement>();
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